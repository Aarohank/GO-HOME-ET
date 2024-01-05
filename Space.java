import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Space extends JPanel implements KeyListener{
    private JFrame myFrame;
    int bordx = 800;
    int bordy = 900;
    Player p1 = new Player(3, 5, 10, bordx/2, 750, true);
    Alien a1 = new Alien(10, 50, 50, 50);
    ArrayList<Alien> Aliens = new ArrayList<Alien>();
    int turn;
    int round;

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
        // ArrayList<Alien> Aliens = new ArrayList<Alien>();
        Alien a1 = new Alien(10, 50, 50, 30);
    }
    
    public void initializePlayer(){
        Player p1 = new Player(3, 5, 10, 800, 40, true);
    }

    public void testAliens(int t, int r){
        int row = 4;
        int col = 10;
        for(int y = 0; y<row; y++){
            for(int x = 0; x<col; x++){
            Aliens.add(new Alien(10, 40 + 64*x + 16*t, 16 + y*64 + 16*r, 40));
        } 
        }
    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){

        }
    }

    public void ticktock(){
        Aliens.clear();
        boolean lorR = true;
        for (int r = 0; r>12; r++){
            round = r;
            if(lorR== true){
                for (int t = 0; t>3; t++){
                    takeABeat(1000);
                    turn = t; 
                    Aliens.clear();

                }
            lorR = false;
            }
            if(lorR== false){
                for (int t = 3; t>0; t--){
                    takeABeat(1000);
                    turn = t; 
                    Aliens.clear();
                }
            lorR = true;
            }
        }
        
    }


    public void paintComponent(Graphics g) {
        super.repaint(); // don't worry about this -- it 'clears the screen'
        g.setColor(Color.black);
        g.fillRect(0, 0, bordx, bordy);
        g.setColor(Color.white);
        drawPlayer(p1,g);
        ticktock();
        drawAlien(g);
  
    }

    public void centerFillRect(int x, int y, int w, int h, Graphics g){
        g.fillRect(x - w/2, y + h/2, w, h);
        
    }

    public void drawPlayer(Player p, Graphics g){
    
        g.setColor(Color.WHITE);
        centerFillRect(p.getPxpos(), p.getPypos(), 40, 40, g);
        
    }

    public void drawAlien(Graphics g){
        for (Alien a : Aliens){
            int [] x = {a.getAxpos(), a.getAxpos() + a.getSize()/2, a.getAxpos() + a.getSize()};
            int [] y = {a.getAypos(), a.getAypos() + a.getSize(), a.getAypos()};
            g.setColor(Color.WHITE);
            g.fillPolygon(x, y, 3);
        }
            



        
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
            if(p1.getPxpos() - 20> 40){
                p1.changePxpos(-10);  
                repaint();
            }
        }
        if(keyCode == KeyEvent.VK_D){
            if(p1.getPxpos() + 20 < 760){
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