// James Dizikes
// CS 1324 Fall 2019
// Maintained by D. Trytten 4/12/2020
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.RoundRectangle2D.Double;

public class Project11 extends JPanel
{
	// Change these constants to adjust the size and title of the window.
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	private static final String WINDOW_TITLE = "Java Robot";
	
	// Do not change the main method.
	public static void main(String[] args)
	{
		JPanel panel = new Project11();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		JFrame frame = new JFrame(WINDOW_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}
	
	// Add your drawing code to this method.
	
	public void paintComponent(Graphics g)
	{
		// Do not change these two lines.
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		
		
	// Sets background to black
		
		setBackground(Color.white);
		
		
		
	// Creates ground
		
		RoundRectangle2D ground = new RoundRectangle2D.Double();
		ground.setRoundRect(0, HEIGHT-20, 640, 20, 10, 10);
		
		g2d.setColor(Color.gray);
		g2d.fill(ground);
		g2d.draw(ground);
		
		
		
	// Robot's left leg
		
		// Create robot's left leg
		RoundRectangle2D legL = new RoundRectangle2D.Double();
		legL.setRoundRect(224, 360, WIDTH/12.8, HEIGHT/4.8, 10, 10);
		
		// Display left leg
		Color limbColor = new Color(0, 204, 0);
		g2d.setColor(limbColor);
		g2d.fill(legL);
		g2d.draw(legL);
		
		
		
	// Robot's right leg
		
		// Create rebot's right leg
		RoundRectangle2D legR = new RoundRectangle2D.Double();
		legR.setRoundRect(366, 360, WIDTH/12.8, HEIGHT/4.8, 10, 10);
		
		// Display right leg
		g2d.fill(legR);
		g2d.draw(legR);
		
		
		
	// Robot's left arm
		
		// Create robot's left arm
		Rectangle2D armL = new Rectangle2D.Double();
		armL.setFrame(144, 264, 40, 90);
				
		// Display left arm
		g2d.setColor(limbColor);
		g2d.fill(armL);
		g2d.draw(armL);
		
		
	// Robot's right arm
		
		// Create robot's right arm
		Rectangle2D armR = new Rectangle2D.Double();
		armR.setFrame(456, 264, 40, 90);
		
		g2d.fill(armR);
		g2d.draw(armR);
		
		
		
	// Robot's neck
		
		// Create robot's neck
		Rectangle2D neck = new Rectangle2D.Double();
		neck.setFrame(300, 156, 40, 12);
		
		g2d.fill(neck);
		g2d.draw(neck);
		
		
	
	// Robot's body
		
		// Creates the robot's hexagon body
		Polygon hexagon = new Polygon();
		hexagon.addPoint((int)(WIDTH*.35), (int)(HEIGHT*.35));
		hexagon.addPoint((int)(WIDTH*.225), (int)(HEIGHT*.55));
		hexagon.addPoint((int)(WIDTH*.35), (int)(HEIGHT*.75));
		hexagon.addPoint((int)(WIDTH*.65), (int)(HEIGHT*.75));
		hexagon.addPoint((int)(WIDTH*.775), (int)(HEIGHT*.55));
		hexagon.addPoint((int)(WIDTH*.65), (int)(HEIGHT*.35));
		
		// Set color of robot's body
		Color bodyColor = new Color(0,0,0);
		g2d.setColor(bodyColor);
		g2d.fill(hexagon);
		g2d.draw(hexagon);
		
		
		
	// Robot's head
		
		// Create robot's head
		Ellipse2D head = new Ellipse2D.Double();
		head.setFrame(290, 104, 60, 60);
		
		
		// Display the robot's head
		g2d.setColor(Color.black);
		g2d.fill(head);
		g2d.draw(head);
	
		
		
	// Robot's eyes
		
		// Create robot's left eye
		Ellipse2D eyeL = new Ellipse2D.Double();
		eyeL.setFrame(305, 120, 10, 10);
		
		// Display the robot's left eye
		g2d.setColor(Color.red);
		g2d.draw(eyeL);
		
		
		
		// Create robot's right eye
		Ellipse2D eyeR = new Ellipse2D.Double();
		eyeR.setFrame(325, 120, 10, 10);
		
		// Display the robot's right eye
		g2d.draw(eyeR);
		
		
		
	// Robot's mouth
		
		// Create robot's mouth
		Rectangle2D mouth = new Rectangle2D.Double();
		mouth.setFrame(303, 142, 35, 2);
		
		// Display robot's mouth
		g2d.fill(mouth);
		g2d.draw(mouth);
		
		
		
	// Phrase
		
		// Create phrase
		JLabel word = new JLabel("the future was yesterday");
		
		// Display phrase
		add(word);
		
		
		
	}
}