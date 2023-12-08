import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Space extends JPanel implements KeyListener{
    private JFrame myFrame;
    int bordx = 1600;
    int bordy = 900;
    Player p1 = new Player(3, 5, 10, 800, 750, true);

    public Space(){
      myFrame = new JFrame("GO HOME ET!");
      myFrame.add(this);
      myFrame.setSize(bordx, bordy);
      this.setFocusable(true);
      myFrame.setVisible(true);
      addKeyListener(this);
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
        g.fillRect(0, 0, bordx, bordy);
        g.setColor(Color.white);
        drawPlayer(p1,g);
  
    }

    public void centerFillRect(int x, int y, int w, int h, Graphics g){
        g.fillRect(x - w/2, y + h/2, w, h);
        
    }

    public void drawPlayer(Player p, Graphics g){
        g.setColor(Color.WHITE);
        centerFillRect(p.getPxpos(), p.getPypos(), 40, 40, g);
    }

    public void drawAlien(Alien a, Graphics g){

    }

    public void runGame(int speedMult){
        paintComponent(getGraphics());

    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        int keyCode = e.getKeyChar();
        if(keyCode == KeyEvent.VK_SPACE){

        }
        if(keyCode == KeyEvent.VK_ENTER){

        }
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        System.out.println(p1.getPxpos() );
        if(keyCode == KeyEvent.VK_A){ 
            if(p1.getPxpos() - 20> 20){
                p1.changePxpos(-10);  
                repaint();
            }
        }
        if(keyCode == KeyEvent.VK_D){
            if(p1.getPxpos() + 20 < 1580){
                p1.changePxpos(10); 
                repaint();
            }
            
        }
        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleaAAAAAAAAAAAAAAAAAAsed'");
    }
}