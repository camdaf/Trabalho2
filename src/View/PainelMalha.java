package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PainelMalha extends JPanel {
	ArrayList<Malha> malha = new ArrayList<>();
	public PainelMalha() {
		setVisible(true);
		setPreferredSize(new Dimension(300,200));
		setBackground(Color.BLACK);
		setLayout(new GridLayout(15,15,1,1));
		
		for(int i = 0; i < 15; i++) {
			for(int k = 0; k < 15; k++) {
				Malha celula = new Malha(i,k);
				if(celula.posiçãox == 8 && celula.posiçãoy == 8) {
					celula.setBackground(Color.yellow);
				}
				malha.add(celula);
				add(celula);
				
				
			}
			
			
		}
		
		

	
	}
}