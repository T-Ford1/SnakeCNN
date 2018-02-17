/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Terrell
 */
public class Food {
    
    private final Random dropper;
    private Point food;
    
    public Food() {
        dropper = new Random();
        nextFood();
    }
    
    public final void nextFood() {
        food = new Point(dropper.nextInt(20), dropper.nextInt(20));
    }

    public Point foodPos() {
        return food;
    }
}
