package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
	double angle = 0.0;
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		x = (int) (50 + Math.sin(angle) * 30);
		y = (int) (50 + Math.cos(angle) * 30);
		angle++;
		g.fillRect(x, y, width, height);
		
		
		
	}

}
