import javax.swing.*;
import java.lang.Runnable;

public class examp_p864 
{
	examp_p864()
	{
		JFrame frame = new JFrame("An application of java swing");
		
		frame.setSize( 300,200 );
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible( true );
		
		JLabel label = new JLabel("Swing is based on AWT");
		
		frame.add ( label );
		
		label.setVisible( true );
	}
	
	public static void main ( String args[] )
	{
		SwingUtilities.invokeLater
		(
				new Runnable()
				{
						public void run()
						{
							new examp_p864();
						}
				}
		);
	}
}