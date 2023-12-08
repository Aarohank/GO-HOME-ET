import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Player{
    private int lives;
    private int moveSpeed;
    private int shootSpeed;
    private int pxpos;
    private int pypos;
    private boolean status;
    


    public Player(int l, int mS, int sS, int xpos, int ypos, boolean s){
        lives = l;
        moveSpeed = mS;
        shootSpeed = sS;
        pxpos = xpos;
        pypos = ypos;
        status = s;
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

    public void changePxpos(int s){
        pxpos += s;
    }


    public void setPxpos(int s) {
        pxpos = s;
    }

    public void setPypos(int s) {
        pypos = s;
    }
    
}
