import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
    Main class that creates a JFrame and instantiates a new TicTacToeDemo
    object that extends JPanel.
    TODO Logic to play a game
    John
*/
public class ticTacToeMain extends JFrame {
    ticTacToeMain() {
        Container panels = getContentPane();
        panels.setLayout(new GridLayout(3,3));
        
        for(int i=0; i<9; i++) {
            JPanel sq = new TicTacToeDemo();
            sq.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panels.add(sq);
        }
    }
    public static void main(String[] args) {
        //TicTacToe game = new TicTacToe();
        //game.draw();
        
        /*JFrame frame = new TicTacToeDemo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); */
        
        ticTacToeMain frame = new ticTacToeMain();
        frame.setTitle("Tic-Tac-Toe - John");
        frame.setSize(550,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
