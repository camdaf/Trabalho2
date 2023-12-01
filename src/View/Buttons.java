package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Buttons extends JButton  {
	public int identificador;
	public Buttons(String string) {
		setText(string);
		setPreferredSize(new Dimension(300,100));
		setBackground(Color.CYAN);
		
	}

	
	
}
