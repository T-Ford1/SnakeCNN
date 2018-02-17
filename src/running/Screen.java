/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Terrell
 */
public class Screen {
    
    private final JFrame frame;
    private final GamePanel panel;
    public final input.Keyboard input;
    
    public Screen() {
        frame = new JFrame();
        frame.add(panel = new GamePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(400,400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(input = new input.Keyboard());
    }
    
    public void makeVisible() {
        frame.setVisible(true);
    }

    public void scheduleRepaint() {
        frame.repaint();
    }
}
