package _03_polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	public void update() {
		y+=10;
		x+=10;
	}

	@Override
	public void draw(Graphics g) {
		
	}

}
