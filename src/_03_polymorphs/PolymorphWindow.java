package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
  
    ArrayList<Polymorph>morphs = new ArrayList<Polymorph>();
    Polymorph m1 = new BluePolymorph(50, 50, 50, 50);
    Polymorph m2 = new RedPolymorph(25, 32, 80, 80);
    Polymorph m3 = new CirclePolymorph(76, 32, 123, 123);
    Polymorph m4 = new MousePolymorph(450, 450, 400, 50);
    Polymorph m5 = new MovingMorph(200, 134, 350,350);
    Polymorph m6 = new JOPolymorph(250, 250, 550, 550);
    Polymorph m7 = new ImagePolymorph(14, 10, 250, 250);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener((MouseListener) m6);
   	 window.addMouseMotionListener((MouseMotionListener) m4);
   	 
   	morphs.add(m7);
   	morphs.add(m2);
   	morphs.add(m3);
   	morphs.add(m4);
   	morphs.add(m5);
   	morphs.add(m6);
   	morphs.add(m1);
   	
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph p : morphs) {
   		p.update();
		p.draw(g);
	}
	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
 
   	 
    }
}
