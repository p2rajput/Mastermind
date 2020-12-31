package Mastermind;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import javax.swing.JButton;

public class ButtonCircle {
}

class blueCircle extends JButton{

	//Tracks the mouse's movements
	private static final long serialVersionUID = 1L;
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	
	public blueCircle(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		MouseAdapter mouseListener = new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(30, 30);
	}

	//Checks if the mouse is on the button
	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
	}

	//Creates the button and has it change colour when pressed
	@Override
	public void paintComponent(Graphics g){
		if(mousePressed){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.blue);
		}
		g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		if(mouseOver){
			g.setColor(Color.blue);
		}
		else{
			g.setColor(Color.white);
		}
		g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
	}

}

class cyanCircle extends JButton{

	//Tracks the mouse's movements
	private static final long serialVersionUID = 1L;
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	public cyanCircle(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		MouseAdapter mouseListener = new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(30, 30);
	}

	//Checks if the mouse is on the button
	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
	}

	//Creates the button and has it change colour when pressed
	@Override
	public void paintComponent(Graphics g){
		if(mousePressed){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.cyan);
		}
		g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		if(mouseOver){
			g.setColor(Color.cyan);
		}
		else{
			g.setColor(Color.white);
		}
		g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
	}
}

class greenCircle extends JButton{

	//Tracks the mouse's movements
	private static final long serialVersionUID = 1L;
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	public greenCircle(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		MouseAdapter mouseListener = new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(30, 30);
	}

	//Checks if the mouse is on the button
	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
	}

	//Creates the button and has it change colour when pressed
	@Override
	public void paintComponent(Graphics g){
		if(mousePressed){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.green);
		}
		g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		if(mouseOver){
			g.setColor(Color.green);
		}
		else{
			g.setColor(Color.white);
		}
		g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
	}
}
class magentaCircle extends JButton{

	//Tracks the mouse's movements
	private static final long serialVersionUID = 1L;
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	public magentaCircle(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		MouseAdapter mouseListener = new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(30, 30);
	}

	//Checks if the mouse is on the button
	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
	}

	//Creates the button and has it change colour when pressed
	@Override
	public void paintComponent(Graphics g){
		if(mousePressed){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.magenta);
		}
		g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		if(mouseOver){
			g.setColor(Color.magenta);
		}
		else{
			g.setColor(Color.white);
		}
		g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
	}
}

class orangeCircle extends JButton{

	//Tracks the mouse's movements
		private static final long serialVersionUID = 1L;
		private boolean mouseOver = false;
		private boolean mousePressed = false;
		public orangeCircle(String text){
			super(text);
			setOpaque(false);
			setFocusPainted(false);
			setBorderPainted(false);
			MouseAdapter mouseListener = new MouseAdapter(){
				public void mousePressed(MouseEvent me){
					if(contains(me.getX(), me.getY())){
						mousePressed = true;
						repaint();
					}
				}
				public void mouseReleased(MouseEvent me){
					mousePressed = false;
					repaint();
				}

				@Override
				public void mouseExited(MouseEvent me){
					mouseOver = false;
					mousePressed = false;
					repaint();
				}

				@Override
				public void mouseMoved(MouseEvent me){
					mouseOver = contains(me.getX(), me.getY());
					repaint();
				}	
			};
			addMouseListener(mouseListener);
			addMouseMotionListener(mouseListener);		
		}

		@Override
		public Dimension getPreferredSize(){
			return new Dimension(30, 30);
		}

		//Checks if the mouse is on the button
		@Override
		public boolean contains(int x, int y){
			return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
		}

		//Creates the button and has it change colour when pressed
		@Override
		public void paintComponent(Graphics g){
			if(mousePressed){
				g.setColor(Color.white);
			}
			else{
				g.setColor(Color.orange);
			}
			g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
			if(mouseOver){
				g.setColor(Color.orange);
			}
			else{
				g.setColor(Color.white);
			}
			g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		}
}

class redCircle extends JButton{

	//Tracks the mouse's movements
	private static final long serialVersionUID = 1L;
	private boolean mouseOver = false;
	private boolean mousePressed = false;
	public redCircle(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		MouseAdapter mouseListener = new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}	
		};
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(30, 30);
	}

	//Checks if the mouse is on the button
	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < 25/2;
	}

	//Creates the button and has it change colour when pressed
	@Override
	public void paintComponent(Graphics g){
		if(mousePressed){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.red);
		}
		g.fillOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
		if(mouseOver){
			g.setColor(Color.red);
		}
		else{
			g.setColor(Color.white);
		}
		g.drawOval(25/2 - 25/2, 25/2 - 25/2, 25, 25);
	}
}
