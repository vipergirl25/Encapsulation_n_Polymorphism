package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class JOPolymorph extends Polymorph implements MouseListener{
	PointerInfo a = MouseInfo.getPointerInfo();
	Point b = a.getLocation();
	Rectangle rect = new Rectangle(x, y, width, height);
	JOPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(rect.contains(b)) {
			JOptionPane.showMessageDialog(null, "wassup aidan tan");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
