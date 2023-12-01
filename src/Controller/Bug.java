package Controller;

import java.util.ArrayList;
import java.util.Random;


import Planetas.Planeta;
import View.Malha;

public class Bug extends Externos {

	public void colisãobug(Planeta planeta) {

		if (posiçãox == planeta.getPosiçãox() && posiçãoy == planeta.getPosiçãoy() && planeta.isVivo() == true && existir == true) {
			System.out.println(planeta.getNome() + " se encontrou com um Bug!");
			planeta.setVelocidade(planeta.getVelocidade() - 1);
			planeta.setNumerobugs(planeta.getNumerobugs() + 1);
			existir = false;
			if (planeta.getVelocidade() == 0) {
				planeta.setVivo(false);
			}
		}

	}
	
	public void colisaoGeralBugs(ArrayList<Planeta> p) {
		for (Planeta planeta : p) {
			colisãobug(planeta);
		}
	}
	
	
	
	
	
	
	public ArrayList<Bug> criarbugs(int i, ArrayList<Malha> malha) {
		int a = 0;
		ArrayList<Bug> bugs = new ArrayList<>();
		for (int k = 0; k < i; k++) {
		
			Bug bug = new Bug();
			bug.gerarPosição();
			for (Malha malha1 : malha) {
				bug.conferirPosiçao(malha1);
				if(malha1.ocupado == true) {
					a++;
				}
				
			}
			if(a == 225) {
				break;
			}
			bugs.add(bug);

		}
		return bugs;
	}

	

	public ArrayList<Bug> retirarbugscolididos(ArrayList<Bug> bugs) {
		for (int i = 0; i < bugs.size(); i++) {
			if (bugs.get(i).existir == false) {
				bugs.remove(bugs.get(i));
			}
		}
		return bugs;
	}

	public void printposiçãobugs(ArrayList<Bug> bugs) {
		for (Bug bug : bugs) {
			System.out.println(" (" + bug.posiçãox + "," + bug.posiçãoy + ") ");
		}
	}

}
