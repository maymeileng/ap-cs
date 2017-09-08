import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JApplet;

public class Flag extends JFrame {

	public Flag () {
		init();
	}

	public void init() {
		//Sets the initial size of screen
		setSize(700,600);
	}
	
	public void paint (Graphics g) {
		//Resets screen
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		//Finds the height and width of the window
		double real_height = getHeight()*1.0; 
		double real_width = getWidth()*1.0; 
		
		double width = 0;
		double height = 0;
		//Assigns height and width of the flag: ensures that the flag dimensions always fit the screen
		if (real_height < (real_width/1.9)) {
			height = real_height;
			width = height*1.9;
		} else {
			width = real_width;
			height = width/1.9;
		}
		
		//Draws 13 scalable red and white stripes, returns height of stripe
		int stripe_height = drawStripes(g, width, height);
		//Draws scalable blue rectangle at top left corner
		drawBlueRect(g, width, stripe_height);
		//Draws 50 scalable stars
		drawStars(g, width, height);
	}
	
	public int drawStripes(Graphics g, double width, double height) {
		int stripe_width = (int)width;
		int stripe_height = (int)(height/13);
		int red_y = 22;
		//Draws 7 red stripes
		for (int i = 1; i<=7;i++) {
			Color red = new Color(224, 0, 0);
			g.setColor(red);
			g.fillRect(0, red_y, stripe_width, (int)stripe_height);
			//Ensures that the stripe moves down one space every time
			red_y+=stripe_height*2;
		}
		//Draws 6 white stripes
		double white_y = 22 + stripe_height;
		for (int i = 1; i<=6;i++) {
			g.setColor(Color.WHITE);
			g.fillRect(0, (int)white_y, stripe_width, (int)stripe_height);
			white_y+=stripe_height*2;
		}
		return stripe_height;
	}
	
	public void drawBlueRect(Graphics g, double width, int stripe_height) {
		double b_width = width*0.4;
		//Ensures that bottom side aligns with the top of the fourth white stripe
		double b_height = (stripe_height*7);
		Color blue = new Color(0, 33, 71);
		//Draw blue rectangle
		g.setColor(blue);
		g.fillRect(0, 22, (int)b_width, (int)b_height);
	}
	
	public void drawStars(Graphics g, double width, double height) {
		//Determines size of outer "pentagon" or five points
		double radius = width*0.01621;
		//Determines size of inner "pentagon"
		double radius2 = radius*(1/Math.tan((2*Math.PI)/5));
		//Determine the horizontal gap between each star
		double spacing_x = width*0.03315789;
		//Determine the vertical gap between each star
		double spacing_y = height*0.054;
		//Determines the coordinates of the centers of each star
		double star_x = spacing_x;
		double star_y = spacing_y + 22;
		//This for loop draws 30 of the 50 stars
		for (int j=1; j<=30;j++){
			int[] x_points = new int[10];
			int[] y_points = new int[10];
			//Gets the coordinates of outer pentagon
			getOuterPoints(x_points, y_points, radius, star_x, star_y);
			//Gets the coordinates of inner pentagon
			getInnerPoints(x_points, y_points, radius2, star_x, star_y);
			//Properly spaces out stars horizontally
			star_x+=spacing_x*2;
			//Spaces out stars vertically so that there are 5 rows of 6 stars
			if(j%6 == 0) {
				star_y += spacing_y*2;
				star_x = spacing_x;
			}
			//Reorder coordinates within array so that java graphics can correctly fill in the star
			int[] x_points1 = reorderXPoints(x_points);
			int[] y_points1 = reorderYPoints(y_points);
			//Draw stars
			g.setColor(Color.WHITE);
			g.fillPolygon(x_points1, y_points1, 10);
		}

		double star_x2 = spacing_x*2;
		double star_y2 = spacing_y*2 + 22;
		//This for loop is for the 20 offset stars
		for (int j=1; j<=20;j++){
			int[] x_points = new int[10];
			int[] y_points = new int[10];
			//Gets the coordinates of outer pentagon
			getOuterPoints(x_points, y_points, radius, star_x2, star_y2);
			//Gets the coordinates of inner pentagon
			getInnerPoints(x_points, y_points, radius2, star_x2, star_y2);
			//Properly spaces out stars horizontally
			star_x2+=spacing_x*2;
			//Spaces out stars vertically so that there are 4 rows of 5 stars
			if(j%5 == 0) {
				star_y2 += spacing_y*2;
				star_x2 = spacing_x*2;
			}
			//Reorder coordinates within array so that java graphics can correctly fill in the star
			int[] x_points1 = reorderXPoints(x_points);
			int[] y_points1 = reorderYPoints(y_points);
			//Draw stars
			g.setColor(Color.WHITE);
			g.fillPolygon(x_points1, y_points1, 10);
		}
	}
	
	private void getOuterPoints(int[] x_points, int[] y_points, double radius, double star_x, double star_y) {
		for (int i = 0; i < 5; i++) {
			//Assigns the outer x-points of the star
			x_points[i] = (int) Math.round(radius*Math.cos(((2*Math.PI*i)/5) + Math.PI/2 + Math.PI)) + (int)star_x;
			//Assigns outer y-points of the star
			y_points[i] = (int) Math.round(radius*Math.sin(((2*Math.PI*i)/5) + Math.PI/2 + Math.PI)) + (int)star_y;
		}
	}
	
	private void getInnerPoints(int[] x_points, int[] y_points, double radius2, double star_x, double star_y) {
		for (int i = 5; i < 10; i++) {
			//Assign the inner x-points of the star
			x_points[i] = (int) Math.round(radius2*Math.cos(((2*Math.PI*i)/5) + 3*Math.PI/2 + Math.PI/5)) + (int)star_x;
			//Assigns the inner y-points of the star
			y_points[i] = (int) Math.round(radius2*Math.sin(((2*Math.PI*i)/5) + 3*Math.PI/2 + Math.PI/5)) + (int)star_y;
		}
	}
	//Puts x-coordinates in the correct order inside array
	private int[] reorderXPoints(int[] x_points) {
		int[] x_points1 = new int[10];
		int k = 0;
		for (int i = 0; i<10; i++) {
			x_points1[i] = x_points[k];
			if(i%2 == 0) {
				k+=5;
			} else {
				k-=4;
			}
		}
		return x_points1;
	}
	//Puts y-coordinates in the correct order inside array
	private int[] reorderYPoints(int[] y_points) {
		int[] y_points1 = new int[10];
		int k = 0;
		for (int i = 0; i<10; i++) {
			y_points1[i] = y_points[k];
			if(i%2 == 0) {
				k+=5;
			} else {
				k-=4;
			}
		}
		return y_points1;
	}
}

