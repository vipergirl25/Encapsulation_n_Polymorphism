package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {

	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		Math.sin(x);
		Math.cos(y);
		g.setColor(Color.pink);
		
		
	}

}
