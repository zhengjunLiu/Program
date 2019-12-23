import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class DisplayClock extends JFrame{
public DisplayClock(){
	StillClock clock=new StillClock();
	//MessagePanel messagePanel=new MessagePanel("hello");
	add(clock);

	
}
	public static void main(String[] args) {
		
		  DisplayClock a=new DisplayClock();
	      a.setTitle("Exercise");
	      a.setSize(300,350);
	      a.setLocationRelativeTo(null);
	      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      a.setVisible(true);

	}

}
