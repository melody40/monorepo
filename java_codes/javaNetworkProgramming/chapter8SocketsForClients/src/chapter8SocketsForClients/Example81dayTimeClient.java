package chapter8SocketsForClients;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class Example81dayTimeClient {
	public static void main (String[] args){
		dayTimeGUI gui = new dayTimeGUI();
		gui.setVisible(true);
		
		//String hostname = args ? args[0] : "time.nist.gov";
		
		/*if (args>0){
			args[0] = "time.nist.gov";
			hostname = args[0]
		}*/
		Socket socket = null;
	}
	
	public class DayTimeGUI extends JFrame{
		panel = new JPanel();
		button = new JButton();
		label = new JLabel();
		
		panel.add (button);
		panel.add (label);
		this.add(panel);
	}

}