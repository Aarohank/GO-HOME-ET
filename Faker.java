import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Faker extends JFrame implements KeyListener{
    private int lives;
    private int moveSpeed;
    private int shootSpeed;
    private int pxpos;
    private int pypos;
    private boolean status;
    private JTextArea textArea;

    public void KeyEventsExample() {
        textArea = new JTextArea();
        textArea.addKeyListener(this);
    }

    public Faker(int l, int mS, int sS, int xpos, int ypos, boolean s){
        lives = l;
        moveSpeed = mS;
        shootSpeed = sS;
        pxpos = xpos;
        pypos = ypos;
        status = s;
        addKeyListener(this);
    }
    
    public boolean getStatus (){
        return this.status;
    }

    public int getPxpos() {
        return pxpos;
    }

    public int getPypos() {
        return pypos;
    }
    public void moveLeft(KeyEvent l){
        //needs paint component done to work
        
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
        System.out.println("keyCode");
        if(keyCode == 65){
            System.out.println("A Works");
            if(pxpos <= 1600){
                pxpos -= 5; 
                repaint();
            }
        }
        if(keyCode == KeyEvent.VK_D){
            if(pxpos >= 0){
                pypos +=5; 
                repaint();
                System.out.println("D works");
                }
            
        }
        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    
}
