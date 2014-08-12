/*
    This class extends JPanel functionality and adds a mouseListener and 
    paintComponent that will handle the drawing for the individual JPanels based
    on logic that is handled in a seperate class.
    John
*/
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToeDemo extends JPanel implements MouseListener {
    static int cnt = 0;
    boolean t = false;
    int num, id;
    playerX x;
    playerO o;
    
    public TicTacToeDemo(int num, playerX x, playerO o) {
        addMouseListener(this);
        this.num = num;
        this.x = x;
        this.o = o;
        cnt = cnt + 1;
        id = cnt;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("Here\t"+num);
        //System.out.println(id);
        if(o.turn == false) {
            o.setTurn(true);
            x.setTurn(false);
            
            o.addCount(num, id);
            //System.out.println(o.getCount() + "\t" + o.checkWinner());
            
        } else if(x.turn == false ) {
            x.setTurn(true);
            o.setTurn(false);
            
            x.addCount(num, id);
            //System.out.println(x.getCount() + "\t" + x.checkWinner());
        }
                
        repaint();
        
        if( o.checkWinner() ) {
            JOptionPane.showMessageDialog(this.getParent(), "O Has Won The Game!");
            //super.dispatchEvent(new WindowEvent(super.getRootPane().get, WindowEvent.WINDOW_CLOSING));
            //super.getRootPane().getParent().setVisible(false);
            //super.dispatchEvent(new WindowEvent((Window)this.getRootPane().getParent(), WindowEvent.WINDOW_CLOSING));
            System.exit(0);
        }
        else if( x.checkWinner() ) {
            JOptionPane.showMessageDialog(this.getParent(), "X Has Won The Game!");
            //super.dispatchEvent(new WindowEvent(super.getRootPane().get, WindowEvent.WINDOW_CLOSING));
            //super.getRootPane().getParent().setVisible(false);
            //super.dispatchEvent(new WindowEvent((Window)this.getRootPane().getParent(), WindowEvent.WINDOW_CLOSING));
            System.exit(0);
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(10));
        if( o.turn ) {
            super.paintComponent(g);
            g2d.drawOval(10, 10, getWidth()-20, getHeight()-20);
        }
        else if( x.turn ) {
            super.paintComponent(g);
            g2d.drawLine(10, 10, getWidth()-10, getHeight()-10);
            g2d.drawLine(getWidth()-10, 10, 10, getHeight()-10);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
} //end tttDemo
