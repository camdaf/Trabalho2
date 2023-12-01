package View;

import java.awt.Color;
import java.util.ArrayList;

import Controller.Bug;
import Controller.Dev;
import Planetas.Planeta;

public class FuncoesInterface {
	
	
	
	
	
	public void moverPlanetaNaInterface(ArrayList<Planeta> p, ArrayList<Malha> arraymalha) {
		int i = 1;	
		
		
		for (Planeta planeta : p) {
			for (Malha malha : arraymalha) {
				if(planeta.getPosiçãox() == malha.posiçãox && planeta.getPosiçãoy() == malha.posiçãoy) {
					malha.ocupado = true;
					malha.setBackground(Color.blue);
					
				}
				
					
			}
			planeta.moverPosição(i);
			i++;
		}
	}
	
	public void resetMalha(ArrayList<Malha> arraymalha) {
		for (Malha malha : arraymalha) {
			
			malha.setBackground(Color.white);
			
			if(malha.posiçãox == 8 && malha.posiçãoy == 8 ) {
				malha.ocupado = true;
				malha.setBackground(Color.yellow);
			}
		}
	}
		
	public void implementarBugMalha(ArrayList<Bug> bugs,ArrayList<Malha> arraymalha) {
		 
			for (Malha malha : arraymalha) {
					for (Bug bug : bugs) {
						if(bug.isExistir() == true && (bug.getPosiçãox() == malha.posiçãox && bug.getPosiçãoy() == malha.posiçãoy)) {
							malha.setBackground(Color.green);
							malha.ocupado = true;
				}
			}
		}
	}
	
	public void implementarDevMalha(ArrayList<Dev> devs,ArrayList<Malha> arraymalha) {
				 
				for (Malha malha : arraymalha) {
						for (Dev dev : devs) {
							if(dev.isExistir() == true && (dev.getPosiçãox() == malha.posiçãox && dev.getPosiçãoy() == malha.posiçãoy)) {
								malha.setBackground(Color.ORANGE);
								malha.ocupado = true;
					}
				}
			}
			
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
