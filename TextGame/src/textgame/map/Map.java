package textgame.map;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

/**
 *
 * @author patrick
 */
public class Map {

    private Image bg;
    private int dotX = 16;
    private int dotY = 1;

    public Map() {
        bg = null;
        try {
            URI imageurl = getClass().getResource("grid.png").toURI();
            File f = new File(imageurl);
            bg = ImageIO.read(f);
        } catch (URISyntaxException | IOException ex) {
            
        }
    }

    public void drawMap(Graphics g) {
        g.drawImage(bg, 0, 0, null);
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        g.fillRect(dotX, dotY, 10, 9);
    }
    
    public void updateMap(int x, int y) {
        this.dotX = x;
        this.dotY = y;
    }
}
