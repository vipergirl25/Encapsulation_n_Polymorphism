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
		g.drawRect(x, y, width, height);
		if(y>500&&x>500) {
			y-=10;
			x-=10;
		}else if(y<0&&x<0) {
			x+=10;
			y=+10;
		}
	
	}

}
