import java.awt.*;
import javax.swing.*;

public class GUIwithPanels extends JFrame 
{

    public GUIwithPanels() 
	 {
        super("Using Panels in JFrame");
        Container ctr = getContentPane();
        ctr.setLayout(new BorderLayout());
		  
		  JPanel panelTop = new JPanel();
        ctr.add(panelTop, BorderLayout.NORTH);
        JLabel label = new JLabel("Name");
        JTextField txtField = new JTextField(20);
		  panelTop.setLayout(new FlowLayout());
        panelTop.add(label);
        panelTop.add(txtField);
		  
		  JPanel panelMid = new JPanel();
        ctr.add(panelMid, BorderLayout.CENTER);
        JTextArea txtArea = new JTextArea();
        panelMid.setLayout(new GridLayout());
        panelMid.add(txtArea);
		  
		  JPanel panelBottom = new JPanel();
        ctr.add(panelBottom, BorderLayout.SOUTH);
        JButton btn1 = new JButton("Send");
        JButton btn2 = new JButton("Cancel");
        panelBottom.setLayout(new FlowLayout());
        panelBottom.add(btn1);
        panelBottom.add(btn2);

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                                                                                                                                                                       
    } // constructor
	 
	 public static void main(String[] arg)
    {
        GUIwithPanels app = new GUIwithPanels();
    }

}


