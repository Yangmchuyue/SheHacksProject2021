import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class Scoreboard extends JPanel{

    //Instance Fields
    private int score;
    private JLabel scoreLabel;

    public Scoreboard(){
        super();
        this.setBackground(new Color(230,242,230));
        score = 0;
        scoreLabel = new JLabel("Score: " + getScore());
        scoreLabel.setFont(new Font("Open Sans", Font.BOLD, 18));
        Border border = BorderFactory.createLineBorder(new Color(40,108,6));
        scoreLabel.setOpaque(true);
        scoreLabel.setBackground(new Color(167,230,140));
        scoreLabel.setForeground(new Color(40,108,6));
        scoreLabel.setBorder(border);
        scoreLabel.setPreferredSize(new Dimension(150, 100));
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setVerticalAlignment(JLabel.CENTER);
        this.add(scoreLabel);
    }

    //Accessor Methods

    //Returns current score
    public int getScore(){
        return score;
    }

    //Mutator Methods
    public void addToScore(int points){
        score = score + points;
        this.remove(scoreLabel);
        scoreLabel.setText("Score: " + getScore());
        this.add(scoreLabel);
        this.revalidate();
        this.repaint();
    }
}

