package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Planetas.Planeta;

public class Frame extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Frame() {
		
		setVisible(true);
		setSize(1920, 1080);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(new PainelGeral());
		setExtendedState(MAXIMIZED_BOTH);
		
		}
			
		}
	
	

	
	

