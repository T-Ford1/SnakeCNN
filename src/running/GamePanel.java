/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Terrell
 */
public class GamePanel extends JPanel {

    public void paintComponent(Graphics g) {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                g.drawImage(Runner.MAP.getTile(y,x).getImage(), x * 20, y * 20, null);
            }
        }
    }
}
