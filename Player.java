import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class Player {
    private int lives;
    private int moveSpeed;
    private int shootSpeed;
    private int pxpos;
    private int pypos;
    private boolean status = true;

    public Player(int l, int mS, int sS, int xpos, int ypos, boolean s){
        lives = l;
        moveSpeed = mS;
        shootSpeed = sS;
        pxpos = xpos;
        pypos = ypos;
        status = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }

    public void moveLeft(KeyEvent l){
        //needs paint component done to work
        
    }
    
}
