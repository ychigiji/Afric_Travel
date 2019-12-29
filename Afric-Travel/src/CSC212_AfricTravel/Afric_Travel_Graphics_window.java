package CSC212_AfricTravel;

import java.awt.Graphics2D;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import me.jjfoley.gfx.GFX;

/**
 * AfricTravel, the graphics window.
 * @author Sabra Mouhi, Wasila Yussif, Yolanda Chigiji
 * @reference JJfoley
 */ 

public class Afric_Travel_Graphics_window extends GFX {
	BufferedImage current;

	public Afric_Travel_Graphics_window() throws IOException {
	}
	
	public void setImage (Country c) {
		// current is the image pointing to the current country
		current = c.image;
	}

	@Override
	public void draw(Graphics2D g) {
		if (current != null) {
			int winWidth = this.getWidth();
			int WinHeight = this.getHeight();
			
			// resizing the image to fit the size of the Window
			g.drawImage(current, 0, 0, winWidth, WinHeight, null);
		}
	}
}

