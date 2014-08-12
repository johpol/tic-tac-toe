import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
    Main class that creates a JFrame and instantiates a new TicTacToeDemo
    object that extends JPanel.
    John
*/
public class ticTacToeMain {
    
    public static void main(String[] args) {
        
        boolean x_plays_first = true;
        playerX x = new playerX(!x_plays_first);
        playerO o = new playerO(!x_plays_first);
        
        magicSquare square = new magicSquare(3);
        int cst= square.magicConst();
        System.out.println( cst );
        JFrame frame = new JFrame();
        
        Container panels = frame.getContentPane();
        panels.setLayout(new GridLayout(3,3));
        
        //Add jpanels with constants for the magic square method
        JPanel sq = new TicTacToeDemo(2, x, o);
        sq.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq);
        
        JPanel sq2 = new TicTacToeDemo(7, x, o);
        sq2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq2);
        
        JPanel sq3 = new TicTacToeDemo(6, x, o);
        sq3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq3);
        
        JPanel sq4 = new TicTacToeDemo(9, x, o);
        sq4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq4);
        
        JPanel sq5 = new TicTacToeDemo(5, x, o);
        sq5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq5);
        
        JPanel sq6 = new TicTacToeDemo(1, x, o);
        sq6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq6);
        
        JPanel sq7 = new TicTacToeDemo(4, x, o);
        sq7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq7);
        
        JPanel sq8 = new TicTacToeDemo(3, x, o);
        sq8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq8);
        
        JPanel sq9 = new TicTacToeDemo(8, x, o);
        sq9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panels.add(sq9);
        
        frame.setTitle("Tic-Tac-Toe - John");
        frame.setSize(550,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
