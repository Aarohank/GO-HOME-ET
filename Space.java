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
    Player p1 = new Player(3, 5, 10, bordx/2, 750, true);
    Alien a1 = new Alien(10, 50, 50, 50, false);
    Bullet b1 = new Bullet(40,p1.getPxpos(),p1.getPypos());
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
      initializeAliens();
      runGame(1);
        
    }
    
    public void initializePlayer(){
        Player p1 = new Player(3, 5, 10, 800, 40, true);
    }

    public void initializeAliens(){
        int row = 6;
        int col = 10;
        for(int y = 0; y<row; y++){
            for(int x = 0; x < col; x++){
                Aliens.add(new Alien(10, 40 + 64*x , 16 + y*64, 40, false));
            } 
        }
    }



    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }

    public void shiftHori(int d){
        for (Alien a: Aliens){
            a.setAxpos(d);
        }
    }

    public void shiftVert(int d){
        for (Alien a: Aliens){
            a.setAypos(d);
        }
    }

    public void alienMovement(int d, int cd, int maxR){
        for (int r = 0; r<maxR; r++){
            round = r;
            shiftVert(d);
            for (int t = 1; t<=54; t++){
                takeABeat(cd);
                turn = t; 
                shiftHori(d * (int)Math.pow(-1, round));
                for (Bullet am: b1.getArrayList()){    
                    am.setBYpos(-1*(am.getSpeed()));      
                }
                }
        takeABeat(cd);
        for (Bullet am: b1.getArrayList()){    
            am.setBYpos(-1*(am.getSpeed()));      
            for(Alien a: Aliens){
                if((am.getBXpos() > a.getAxpos()-25 && am.getBXpos() < a.getAxpos() +75) && (am.getBYpos() > a.getAypos() && am.getBYpos() < a.getAypos() +50)){
                    a.MarkForD(true);                    
                }
            }
        }
        }
    }


    public void paintComponent(Graphics g) {
        super.repaint(); // don't worry about this -- it 'clears the screen'
        g.setColor(Color.black);
        g.fillRect(0, 0, bordx, bordy);
        g.setColor(Color.white);
        drawPlayer(p1,g);
        drawAlien(g);
        drawBullet(g);
        
  
    }

    public void centerFillRect(int x, int y, int w, int h, Graphics g){
        g.fillRect(x - w/2, y + h/2, w, h);
        
    }

    public void centerFillOval(int x, int y, int w, int h, Graphics g){
        g.fillOval(x - w/2, y + h/2, w, h);
    }


    public void drawPlayer(Player p, Graphics g){
        g.setColor(Color.WHITE);
        centerFillRect(p.getPxpos(), p.getPypos(), 40, 40, g);
        
    }

    public void drawBullet(Graphics g){
        g.setColor(Color.WHITE);
        for (Bullet am: b1.getArrayList()){
            centerFillOval(am.getBXpos(), am.getBYpos(), 30, 30, g);
        }

    }
    

    public void drawAlien(Graphics g){
        for (Alien a : Aliens){
            g.setColor(Color.WHITE);
            if (a.getMFD()){
                g.setColor(Color.BLACK);
            }
            
            int [] x = {a.getAxpos(), a.getAxpos() + a.getSize()/2, a.getAxpos() + a.getSize()};
            int [] y = {a.getAypos(), a.getAypos() + a.getSize(), a.getAypos()};
            
            g.fillPolygon(x, y, 3);
            
        }
    }

    public void runGame(int speedMult){
        paintComponent(getGraphics());
        alienMovement(16,100,15);
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
        if(keyCode == KeyEvent.VK_A){ 
            if(p1.getPxpos() - 20> 40){
                p1.changePxpos(-10);  
            }
        }
        if(keyCode == KeyEvent.VK_D){
            if(p1.getPxpos() + 20 < 1560){
                p1.changePxpos(10); 
            }
            
        }
        if(keyCode == KeyEvent.VK_SPACE){
                b1.createBullet(p1.getPxpos(),p1.getPypos());
                // moveBullets();
            }
            
        }
        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");


    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleaAAAAAAAAAAAAAAAAAAsed'");
    }
}