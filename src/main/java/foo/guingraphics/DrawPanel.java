package foo.guingraphics;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	//draws an X from the corners of the panel
	
	public void paintComponent(Graphics g){
		//call paintComponent to ensure panel displays correctly
		super.paintComponent(g);
		
		int width = getWidth();
		int height=getHeight();
		
		//draw a line from upper left to the lower right
		g.drawLine(0,0, width, height);
		
		//draw a line from lower left to the upper right
		g.drawLine(0,height, width,0);
			
	}//end paintComponent
}//end class
