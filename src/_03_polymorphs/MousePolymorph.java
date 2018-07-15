package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

import java.awt.color.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Point;

public class MousePolymorph extends Polymorph implements MouseMotionListener{
	MousePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(x, y, width, height);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
	}

}
