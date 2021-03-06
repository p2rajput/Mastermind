package Mastermind;
//Make sure that the circle is displayed and a new one is added
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ISU extends JPanel implements ActionListener{ 

	private static final long serialVersionUID = 1L;

	static JPanel panel = new JPanel();
	static JPanel end = new JPanel();

	// Counts the number of clicks to limit user inputs
	private static int counter = 0;
	private static int guesses = 0;

	//Stores the order of the guesses
	static int[] order = new int [4];

	public static int compare (int a, int b, int c, int d, int w, int x, int y, int z){
		int count = 0;
		int win = 0;
		if (a==w){
			final whiteCircle white = new whiteCircle();
			count++;
			win++;
			white.setLocation(125+(35*(count)),50+(40*(guesses-1)));
			white.setSize(25,25);
			panel.add(white);
			panel.repaint();
			}
		else if (a==x||a==y||a==z){
			final blackCircle black = new blackCircle();
			count++;
			black.setLocation(125+(35*count),50+(40*(guesses-1)));
			black.setSize(25,25);
			panel.add(black);
			panel.repaint();
		}
		if (b==x){
			final whiteCircle white = new whiteCircle();
			count++;
			win++;
			white.setLocation(125+(35*count),50+(40*(guesses-1)));
			white.setSize(25,25);
			panel.add(white);
			panel.repaint();
			}
		else if (b==w||b==y||b==z){
			final blackCircle black = new blackCircle();
			count++;
			black.setLocation(125+(35*count),50+(40*(guesses-1)));
			black.setSize(25,25);
			panel.add(black);
			panel.repaint();
		}
		if (c==y){
			final whiteCircle white = new whiteCircle();
			count++;
			win++;
			white.setLocation(125+(35*count),50+(40*(guesses-1)));
			white.setSize(25,25);
			panel.add(white);
			panel.repaint();
			}
		else if (c==x||c==w||c==z){
			final blackCircle black = new blackCircle();
			count++;
			black.setLocation(125+(35*count),50+(40*(guesses-1)));
			black.setSize(25,25);
			panel.add(black);
			panel.repaint();
		}
		if (d==z){
			final whiteCircle white = new whiteCircle();
			count++;
			win++;
			white.setLocation(125+(35*count),50+(40*(guesses-1)));
			white.setSize(25,25);
			panel.add(white);
			panel.repaint();
			}
		else if (d==x||d==y||d==w){
			final blackCircle black = new blackCircle();
			count++;
			black.setLocation(125+(35*count),50+(40*(guesses-1)));
			black.setSize(25,25);
			panel.add(black);
			panel.repaint();
		}
		count=0;
		return win;
	}
	
	public static void lose (int a, int b, int c, int d) {
		blueReact blue = new blueReact(); redReact red = new redReact();
		greenReact green = new greenReact(); orangeReact orange = new orangeReact();
		cyanReact cyan = new cyanReact(); magentaReact magenta = new magentaReact();
		if (a==1||b==1||c==1||d==1){
			int x=3;
			if (a==1){x=0;}
			if (b==1){x=1;}
			if (c==1){x=2;}
			blue.setLocation(15+(35*x),500);
			blue.setSize(25,25);
			panel.add(blue);
			panel.repaint();
		}
		if (a==2||b==2||c==2||d==2){
			int x=3;
			if (a==2){x=0;}
			if (b==2){x=1;}
			if (c==2){x=2;}
			red.setLocation(15+(35*x),500);
			red.setSize(25,25);
			panel.add(red);
			panel.repaint();
		}
		if (a==3||b==3||c==3||d==3){
			int x=3;
			if (a==3){x=0;}
			if (b==3){x=1;}
			if (c==3){x=2;}
			green.setLocation(15+(35*x),500);
			green.setSize(25,25);
			panel.add(green);
			panel.repaint();
		}
		if (a==4||b==4||c==4||d==4){
			int x=3;
			if (a==4){x=0;}
			if (b==4){x=1;}
			if (c==4){x=2;}
			orange.setLocation(15+(35*x),500);
			orange.setSize(25,25);
			panel.add(orange);
			panel.repaint();
		}
		if (a==5||b==5||c==5||d==5){
			int x=3;
			if (a==5){x=0;}
			if (b==5){x=1;}
			if (c==5){x=2;}
			cyan.setLocation(15+(35*x),500);
			cyan.setSize(25,25);
			panel.add(cyan);
			panel.repaint();
		}
		if (a==6||b==6||c==6|d==6){
			int x=3;
			if (a==6){x=0;}
			if (b==6){x=1;}
			if (c==6){x=2;}
			magenta.setLocation(15+(35*x),500);
			magenta.setSize(25,25);
			panel.add(magenta);
			panel.repaint();
		}
		if (a==1||b==1||c==1||d==1){
			int x=3;
			if (a==1){x=0;}
			if (b==1){x=1;}
			if (c==1){x=2;}
			blue.setLocation(15+(35*x),500);
			blue.setSize(25,25);
			panel.add(blue);
			panel.repaint();
		}
	}

	//Makes title
	public static void colourOpt (){
		//Generates the secret code
		int w=0,x=0,y=0,z=0;
		w = (int) (Math.random() * 6)+1;
		while (x==w||x==0){
		x = (int) (Math.random() * 6)+1;}
		while (y==w||y==x||y==0){
		y = (int) (Math.random() * 6)+1;}
		while (z==w||z==x||z==y||z==0){
		z = (int) (Math.random() * 6)+1;}
		int a=w,b=x, c=y, d=z;
		
		JFrame play = new JFrame("Mastermind");
		play.setTitle("Mastermind");
		play.setResizable(false);
		//Creates colourful circle buttons
		play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		blueCircle blue = new blueCircle("");
		blue.addActionListener(new ActionListener(){
			//Counts the order the buttons are clicked
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final blueReact blueCircle = new blueReact();
					blueCircle.setLocation(15+(35*counter),50+(40*guesses));
					blueCircle.setSize(25,25);
					panel.add(blueCircle);
					panel.repaint();
					order [counter]=1;
					counter++;
				}
			}
		});
		redCircle red = new redCircle("");
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final redReact redCircle = new redReact();
					redCircle.setLocation(15+(35*counter),50+(40*guesses));
					redCircle.setSize(25,25);
					panel.add(redCircle);
					panel.repaint();
					order [counter]=2;
					counter++;
				}
			}
		});
		greenCircle green = new greenCircle("");
		green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final greenReact greenCircle = new greenReact();
					greenCircle.setLocation(15+(35*counter),50+(40*guesses));
					greenCircle.setSize(25,25);
					panel.add(greenCircle);
					panel.repaint();
					order [counter]=3;
					counter++;
				}
			}
		});
		orangeCircle orange = new orangeCircle("");
		orange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final orangeReact orangeCircle = new orangeReact();
					orangeCircle.setLocation(15+(35*counter),50+(40*guesses));
					orangeCircle.setSize(25,25);
					panel.add(orangeCircle);
					panel.repaint();
					order [counter]=4;
					counter++;
				}
			}
		});
		cyanCircle cyan = new cyanCircle("");
		cyan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final cyanReact cyanCircle = new cyanReact();
					cyanCircle.setLocation(15+(35*counter),50+(40*guesses));
					cyanCircle.setSize(25,25);
					panel.add(cyanCircle);
					panel.repaint();
					order [counter]=5;
					counter++;
				}
			}
		});
		magentaCircle magenta = new magentaCircle("");
		magenta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (counter<4){
					final magentaReact magentaCircle = new magentaReact();
					magentaCircle.setLocation(15+(35*counter),50+(40*guesses));
					magentaCircle.setSize(25,25);
					panel.add(magentaCircle);
					panel.repaint();
					order [counter]=6;
					counter++;
				}
			}
		});
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						guesses++;
						counter = 0;
						if (compare (order [0],order [1], order [2], order [3], a, b, c, d)==4){
							JOptionPane.showMessageDialog(end, "You have won!");
							System.exit(0);
						}
						panel.repaint();
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						System.out.println(d);
						System.out.println(order[0]);
						System.out.println(order[1]);
						System.out.println(order[2]);
						System.out.println(order[3]);
						if (guesses == 10){
							lose(a,b,c,d);
							JOptionPane.showMessageDialog(end, "You have lost... \n The correct code is at the botton of the screen.");
							System.exit(0);
						}
					}
				});
		panel.add(blue);
		panel.add(red);
		panel.add(green);
		panel.add(orange);
		panel.add(cyan);
		panel.add(magenta);
		panel.add(submit);
		play.add(panel);
		play.setSize(400, 750);
		play.setVisible(true);	
	}

	public static void openScreen (){
		//Creates instructions writing
		String instruct= "In this game, you are trying to guess the secret code! Enter a sequence of"
				+ " four circles and I will give you hints on how correct you are.\n A black circle"
				+ " means that one of the colours are correct.\n A white circle means that one of the"                 
				+ " colours are in the right spot. \n The code is only 4 colours long so you can only "
				+ " enter 4 circles at a time. \n Each circle only appears once.";
		// Creates the Instruction button
		final JFrame frame = new JFrame();
		JButton butInstr = new JButton("Instruction");
		butInstr.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,instruct);
					}
				});
		// Create the play button
		JButton btnCancel = new JButton("Play");
		btnCancel.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);
						colourOpt();
					}
				});

		//Makes title
		JLabel title = new JLabel("Mastermind");

		// Adds buttons to the screen
		JPanel open = new JPanel( );
		open.add(butInstr);
		open.add(btnCancel);
		frame.setTitle("Mastermind");
		frame.add(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		frame.setResizable(false);
		frame.getContentPane( ).add(open,BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		openScreen();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
