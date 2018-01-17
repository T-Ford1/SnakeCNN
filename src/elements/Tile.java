/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Terrell
 */
public class Tile {

    public int x, y;

    private int type;
    //0 = head
    //1 = body
    //2 = food
    //3 = background

    public Tile(int y, int x, int type) {
        this.y = y;
        this.x = x;
        this.type = type;
    }

    public static BufferedImage[] IMAGES;

    static {
        try {
            IMAGES = new BufferedImage[4];
            IMAGES[0] = ImageIO.read(new File("res/hd.png"));//HEAD
            IMAGES[1] = ImageIO.read(new File("res/bd.png"));//BODY
            IMAGES[2] = ImageIO.read(new File("res/fd.png"));//FOOD
            IMAGES[3] = ImageIO.read(new File("res/bg.png"));//BACKGROUND
        } catch (Exception e) {
        }

    }

    public Image getImage() {
        return IMAGES[type];
    }

    public void setHead() {
        type = 0;
    }

    public void setBody() {
        type = 1;
    }

    public void setFood() {
        type = 2;
    }

    public void setBackground() {
        if (type == 1) {
            type = 3;
        }
    }
}
