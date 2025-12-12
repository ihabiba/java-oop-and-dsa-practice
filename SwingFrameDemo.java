import java.awt.*;
import javax.swing.*;
public class Myframe2 extends JFrame
{

   public Myframe2()
	{
	  setTitle("My frame");
	  setSize(600, 300);
	  setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
	  Myframe2 myFrame = new Myframe2();
	  Container contentPane = myFrame.getContentPane();
	  contentPane.setBackground(Color.PINK);
	  contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
	  JButton okButton = new JButton("OK");
	  JButton cancelButton = new JButton("CANCEL");
	  contentPane.add(okButton);
	  contentPane.add(cancelButton);
	  
	}



}