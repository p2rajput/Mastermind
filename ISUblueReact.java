package Mastermind;

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public class ISUblueReact extends JPanel{

	private static final long serialVersionUID = 1L;

	//Creates a cricle to output
	Ellipse2D.Double circle;

	public ISUblueReact (){
		circle = new Ellipse2D.Double(0, 0, 25, 25);
		setOpaque(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.blue);
		g2.fill(circle);
	}

}
