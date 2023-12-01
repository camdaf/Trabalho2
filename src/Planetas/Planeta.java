package Planetas;

import java.util.ArrayList;
import java.util.List;

public  class Planeta {
	protected String nome;
	protected String descrição;
	protected int posiçãox;
	protected int posiçãoy;
	protected int velocidade;
	protected boolean vivo = true;
	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getAno() {
		return ano;
	}

	public void setAno(double ano) {
		this.ano = ano;
	}

	public double getRotação() {
		return rotação;
	}

	public void setRotação(double rotação) {
		this.rotação = rotação;
	}

	public int getControtação() {
		return controtação;
	}

	public void setControtação(int controtação) {
		this.controtação = controtação;
	}

	public double getPeriodo() {
		return periodo;
	}

	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}

	public int getNumerobugs() {
		return numerobugs;
	}

	public void setNumerobugs(int numerobugs) {
		this.numerobugs = numerobugs;
	}

	public int getNumerodevs() {
		return numerodevs;
	}

	public void setNumerodevs(int numerodevs) {
		this.numerodevs = numerodevs;
	}

	public int getInstantes() {
		return instantes;
	}

	public void setInstantes(int instantes) {
		this.instantes = instantes;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	protected double ano = 0.0;
	protected double rotação = 0.0;
	protected int controtação;
	protected double periodo;
	protected int numerobugs;
	protected int numerodevs;
	protected int instantes;

	public ArrayList<Planeta> planetas() {
		ArrayList<Planeta> p = new ArrayList<>();
		p.add(new Python("Python", 4, 8, 7));
		p.add(new Javascript("Javascript", 3,8, 6));
		p.add(new RubyonRails("RubyonRails", 2, 8, 5));
		p.add(new Php("PHP", 2, 8, 4));
		p.add(new Csharp("C#", 1, 8, 3));
		p.add(new Cplusplus("C++", 2, 8, 2));
		p.add(new C("C", 10, 8, 1));

		return p;
	}

	public int getPosiçãox() {
		return posiçãox;
	}

	public String getNome() {
		return nome;
	}

	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
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

	public Planeta() {

	}

	public Planeta(String nome, int velocidade, int posiçãox, int posiçãoy) {
		super();
		this.nome = nome;
		this.posiçãox = posiçãox;
		this.posiçãoy = posiçãoy;
		this.velocidade = velocidade;
		
	}

	public void moverPosição(int distancia) {
		int cont = 0;
		do {
			if (posiçãoy == 8 + distancia && posiçãox != 8 + distancia) {
				posiçãox++;
			}

			else if (posiçãoy == 8 - distancia && posiçãox != 8 - distancia) {
				posiçãox--;
			}

			else if (posiçãox == 8 + distancia && posiçãoy != 8 - distancia) {
				posiçãoy--;
			}

			else if (posiçãox == 8 - distancia && posiçãoy != 8 + distancia) {
				posiçãoy++;
			}
			if (posiçãox == 8 && posiçãoy == 8 + distancia) {
				ano++;
			}

			cont++;
		} while (cont < this.velocidade);

	}

	public double contRotação(double periodo) {
		rotação = rotação + periodo / 24;
		return rotação;
	}

}
