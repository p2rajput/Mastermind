package Mastermind;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class ISUmagentaReact extends JPanel{

	private static final long serialVersionUID = 1L;

	//Creates a cricle to output
	Ellipse2D.Double circle;

	public ISUmagentaReact (int radius)
	{
		circle = new Ellipse2D.Double(0, 0, radius, radius);
		setOpaque(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.magenta);
		g2.fill(circle);

	}

}
