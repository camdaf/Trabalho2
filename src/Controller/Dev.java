package Controller;

import java.util.ArrayList;
import java.util.Random;


import Planetas.Planeta;
import View.Malha;

public class Dev extends Externos {

	public void colisãodev(Planeta planeta2) {

		if (posiçãox == planeta2.getPosiçãox() && posiçãoy == planeta2.getPosiçãoy() && planeta2.isVivo() == true
				&& isExistir() == true) {
			System.out.println(planeta2.getNome() + " se encontrou com um Dev!");
			planeta2.setVelocidade(planeta2.getVelocidade() + 1);
			planeta2.setNumerodevs(planeta2.getNumerodevs() + 1);
			existir = false;
		}
	}
	
	public void colisaoGeralDevs(ArrayList<Planeta> p) {
		for (Planeta planeta : p) {
			colisãodev(planeta);
		}
	}

	
	
	
	public ArrayList<Dev> criardevs(int i, ArrayList<Malha> malha) {
		int a = 0;
		ArrayList<Dev> devs = new ArrayList<>();
		for (int k = 0; k < i; k++) {
			Dev dev = new Dev();
			dev.gerarPosição();
			for (Malha malha1 : malha) {
				dev.conferirPosiçao(malha1);
				if(malha1.ocupado == true) {
					a++;
				}
				
			}
			if(a == 225) {
				break;
			}
			devs.add(dev);

		}
		return devs;
	}

	


	public ArrayList<Dev> retirardevsscolididos(ArrayList<Dev> devs) {

		for (int i = 0; i < devs.size(); i++) {
			if (devs.get(i).existir == false) {
				devs.remove(devs.get(i));
			}
		}
		return devs;
	}

	public void printposiçãodevs(ArrayList<Dev> devs) {
		for (Dev dev : devs) {
			System.out.println(" (" + dev.posiçãox + "," + dev.posiçãoy + ") ");
		}
	}

}