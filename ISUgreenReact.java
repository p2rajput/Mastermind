package Mastermind;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class ResponseCircle {
}

class whiteCircle extends JPanel{

	private static final long serialVersionUID = 1L;
	//Creates a circle to output
	Ellipse2D.Double circle;

	public whiteCircle (){
		circle = new Ellipse2D.Double(0, 0, 25, 25);
		setOpaque(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fill(circle);
		g2.setColor(Color.black);
		g2.draw(circle);
	}
}

class blackCircle extends JPanel{

	private static final long serialVersionUID = 1L;
	//Creates a circle to output
	Ellipse2D.Double circle;

	public blackCircle (){
		circle = new Ellipse2D.Double(0, 0, 25, 25);
		setOpaque(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
		g2.fill(circle);
	}
}
