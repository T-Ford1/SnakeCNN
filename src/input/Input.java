/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Terrell
 */
public class Input implements KeyListener {
    
    private static final Point LT = new Point(-1,0);
    private static final Point RT = new Point(1,0);
    private static final Point UP = new Point(0,-1);
    private static final Point DN = new Point(0,1);
    
    private Point dir;
    
    public Input() {
        dir = RT;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        setDir(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    private void setDir(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            dir = LT;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            dir = RT;
        } else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
            dir = UP;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            dir = DN;
        }
    }
    
    public Point getDirection() {
        return dir;
    }
    
}
