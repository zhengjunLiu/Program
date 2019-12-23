import java.awt.*;
import javax.swing.*;

public class TestPanels extends JFrame {
public TestPanels(){
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(4,3));
	for(int i=1;i<10;i++){
		p1.add(new JButton(""+i));
	}
	p1.add(new JButton(""+0));
	p1.add(new JButton("Start"));
	p1.add(new JButton("Stop"));
	JPanel p2=new JPanel(new BorderLayout());
	p2.add(new JTextField("time to be displayed here"),BorderLayout.NORTH);
	p2.add(p1,BorderLayout.CENTER);
	setLayout(new GridLayout(1,2));
	add(new JButton("Food to be placed here"));
	add(p2);
	
	
}
	
	
public static void main(String[] args) {
		
	TestPanels frame=new TestPanels();
	frame.setTitle("The Front View  of a Microwave Oven");
	frame.setSize(500, 400);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}

}
