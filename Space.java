import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Space extends JPanel{ //implements KeyEvent{
    private JFrame myFrame;
    int bordx = 1600;
    int bordy = 900;
    Player p1 = new Player(3, 5, 10, 775, 800, true);

    public Space(){
        myFrame = new JFrame("Dot Racing!");
      myFrame.add(this);
      myFrame.setSize(bordx, bordy);
      myFrame.setVisible(true);
      runGame(1);

    }

    public void initializeAliens(){
        ArrayList<Alien> Aliens = new ArrayList<Alien>();

    }
    
    public void initializePlayer(){
        Player p1 = new Player(3, 5, 10, 800, 40, true);
    }

    public void paintComponent(Graphics g) {
        super.repaint(); // don't worry about this -- it 'clears the screen'
  
        g.setColor(Color.black);
        g.fillRect(0, 0, bordx, bordy); // draw a nice white background
        g.setColor(Color.black);
        drawAlien(null,g);
        g.setColor(Color.white);
        drawPlayer(p1);
        // g.fillRect(p1.getPxpos(), p1.getPypos(),50,50);
  
    }

    public void drawPlayer(Player p){
        getGraphics().setColor(Color.white);
        getGraphics().fillRect(p.getPxpos(), p.getPypos(),50,50);
    }

    public void drawAlien(Alien a, Graphics g){

    }

    public void runGame(int speedMult){
        paintComponent(getGraphics());

    }
}