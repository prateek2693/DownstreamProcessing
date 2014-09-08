/*This class generates the first window in the Downstream Processing Optimizing Application
*@author Prateek Sappadla
*
*
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DownstreamProcessing extends JFrame
{
	JButton inptoOut;
	JButton inptoOutcycles;
	JButton outtoInp;
	JButton exit;
	
	//Constructor for the class
	public DownstreamProcessing()
	{
		
		//Create the buttons
		inptoOut = new JButton("Input to Output");
		inptoOutcycles = new JButton("Input to Output with number of cycles rounded off");
		outtoInp = new JButton("Output to Input");
		exit = new JButton("Exit");

		JPanel p1 = new JPanel();
		this.getContentPane().add(p1);
		
			
		//Set the layout of the window to Flowlayout
		p1.setLayout(new FlowLayout()); 

		//Add the buttons to the window
		p1.add(inptoOut);
		p1.add(inptoOutcycles);
		p1.add(outtoInp);
		p1.add(exit);

		inptoOut.addActionListener(new InptoOut_Event());
		inptoOutcycles.addActionListener(new InptoOutcycles_Event());
		outtoInp.addActionListener(new OuttoInp_Event());  
		exit.addActionListener(new Exit_Event());
		
	}

	public static void main(String[] args)
	{
		DownstreamProcessing d1 = new DownstreamProcessing();
		d1.setTitle("Downstream Processing");
		d1.setSize(400,300);	
		d1.setVisible(true);
		d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	//Event handler for Input_to_Output Button
	public class InptoOut_Event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			InputtoOutput i1 = new InputtoOutput();
			i1.setSize(1000,1000);	
			i1.setVisible(true);
			i1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}
	
	public class InptoOutcycles_Event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			InputtoOutputcycles i1 = new InputtoOutputcycles();
			i1.setSize(1000,1000);	
			i1.setVisible(true);
			i1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}
	
		
	//Event handler for Output_to_Input Button
	public class OuttoInp_Event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			OutputtoInput o1 = new OutputtoInput();
			o1.setSize(1000,1000);	
			o1.setVisible(true);
			o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}
	
	//Event Handler for the Exit Button
	public class Exit_Event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}

	}
}
