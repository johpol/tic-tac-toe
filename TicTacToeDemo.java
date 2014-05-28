/*
    This class extends JPanel functionality and adds a mouseListener and 
    paintComponent that will handle the drawing for the individual JPanels based
    on logic that is handled in a seperate class.
    John
*/
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class TicTacToeDemo extends JPanel implements MouseListener {
    boolean t = false;
    public TicTacToeDemo() {
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Here");
        if(TicTacToeLogic.circle==false) {
            TicTacToeLogic.setCircle(true);
            TicTacToeLogic.setCross(false);
        }
        else if(TicTacToeLogic.cross==false) {
            TicTacToeLogic.setCross(true);
            TicTacToeLogic.setCircle(false);
        }
        //TicTacToeLogic.setCross(true);
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(10));
        if(TicTacToeLogic.circle) {
            super.paintComponent(g);
            g2d.drawOval(10, 10, getWidth()-20, getHeight()-20);
        }
        else if(TicTacToeLogic.cross) {
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
