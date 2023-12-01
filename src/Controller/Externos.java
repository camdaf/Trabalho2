package Controller;

import java.util.Random;

import View.Malha;

import java.util.ArrayList;

public abstract class Externos {
	protected int posiçãox;
	protected int posiçãoy;
	public int getPosiçãox() {
		return posiçãox;
	}
	public void setPosiçãox(int posiçãox) {
		this.posiçãox = posiçãox;
	}
	public int getPosiçãoy() {
		return posiçãoy;
	}
	public void setPosiçãoy(int posiçãoy) {
		this.posiçãoy = posiçãoy;
	}
	public boolean isExistir() {
		return existir;
	}
	public void setExistir(boolean existir) {
		this.existir = existir;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	protected boolean existir = true;
	protected int quantidade;

	Random random = new Random();

	public void gerarPosição() {

		posiçãox = random.nextInt(15) + 1;
		posiçãoy = random.nextInt(15) + 1;

	}
	public void conferirPosiçao(Malha malha) {
		if(malha.ocupado == true) {
				gerarPosição();
			}
			
	}
		
	}

