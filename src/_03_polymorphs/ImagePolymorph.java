package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph {
	BufferedImage kermit;
	ImagePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			kermit = ImageIO.read(this.getClass().getResource("tired kermit.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(kermit, 0, 0, null);
		
	}

}
