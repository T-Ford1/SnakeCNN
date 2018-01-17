/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running;

/**
 *
 * @author Terrell
 */
public class Runner extends Thread {

    public static Screen SCREEN;
    public static elements.Map MAP;

    public Runner() {
        MAP = new elements.Map();
        SCREEN = new Screen();
    }

    public void run() {
        SCREEN.makeVisible();
        MAP.setFood();
        while (MAP.step()) {
            SCREEN.scheduleRepaint();
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}
