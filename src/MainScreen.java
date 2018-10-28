package com.cclass.frames;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;


/*___________________________________________________________________
	The Main Screen -----> 	The frist screen the customer will see 	|
							when the software starts				|
____________________________________________________________________|
	descriptions	-----> 	Not sure maybe a Login screen or a Menu	|
							Selector for the options				|
____________________________________________________________________|
	objectives		----->	-> Make a menu selector for Dark Theme  |
							or Light Theme 							|
							-> Make a menu selector with some infor-|
							mation about transaction or the isr/iva	|
							status									|
							-> Menu for the diferents actions n the |
							feactures								|
____________________________________________________________________|
	Knowledge Bugs 			Nothing but now							|
	n Errors		----->											|
____________________________________________________________________|
	Countributors	----->	xXpilintuXx								|
																	|
____________________________________________________________________|
*/
public class MainScreen extends JFrame{


	//init Component for the Main Frame
	private void initComponent(){
		//declaration of components
		JTextField nameTxt = new JTextField();
		JLabel labelTxtDir = new JLabel();
		JButton butTheme = new JButton("Dark Theme");
		JPanel backgroundPanel = new JPanel();
		Color blackTheme = new Color(40,41,35);
		Color whiteTheme = new Color(235,237,239);
		
		//theme changes
		backgroundPanel.setBackground(blackTheme);
		labelTxtDir.setForeground(Color.white);


		//implements on background panel
		backgroundPanel.setLayout(new FlowLayout());
		backgroundPanel.add(labelTxtDir);
		backgroundPanel.add(nameTxt);
		backgroundPanel.add(butTheme);
		labelTxtDir.setText("Example Text");
		nameTxt.setPreferredSize(new Dimension(200,24));
		butTheme.setFocusPainted(false);



		// Here the main options for the main screen
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(backgroundPanel);
	}




	public MainScreen(){
		initComponent();
	}





























	
}
