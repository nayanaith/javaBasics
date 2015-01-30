package foo.guingraphics;

import javax.swing.JFrame;

public class DrawPanelUse {
	public static void main(String args[]){
		//create panel that contains our drawing
		DrawPanel panel = new DrawPanel();

		//create a new frame to hold the panel
		JFrame application = new JFrame();
		
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add( panel,0 );
		application.setSize(1000,1000);
		application.setVisible(true);
	}//end main
}//end class
