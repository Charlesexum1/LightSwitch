import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LightSwitch extends JApplet implements ActionListener {
	
	private Container con;
	private JButton button;
	private JLabel welcome;
	private int modulate = 0;
	
	public void init() {
		Container con = getContentPane();
		button = new JButton("On/Off");
		button.addActionListener(this);
		welcome = new JLabel("Lightswitch");
		
		con.setLayout(new FlowLayout());
		con.add(button);
		con.add(welcome);
		}
		
	public void actionPerformed(ActionEvent e) {
		
		Container con = getContentPane();
		
		if (modulate % 2 == 0) {
			if (e.getActionCommand().equals("On/Off")) {
			con.setBackground(Color.blue);
			modulate++;
			}
		}
		else {
			if (e.getActionCommand().equals("On/Off")) {
			con.setBackground(Color.green);
			modulate++;
				}
			}	
		}	
	}


