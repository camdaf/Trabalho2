package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import Controller.Bug;
import Controller.Dev;
import Model.LerArquivo;
import Planetas.Planeta;

public class PainelGeral extends JPanel implements ActionListener {
	PainelBotoes painelbotoes = new PainelBotoes();
	PainelMalha painelmalha = new PainelMalha();
	ArrayList<Malha> arraymalha = painelmalha.malha;
	Planeta planeta = new Planeta();
	ArrayList<Planeta> p = planeta.planetas();
	FuncoesInterface funcaointerface = new FuncoesInterface();
	Bug bug = new Bug();
	ArrayList<Bug> bugsgerais = new ArrayList<>();
	Dev dev = new Dev();
	ArrayList<Dev> devsgerais = new ArrayList<>();
	LerArquivo lerarquivo = new LerArquivo();
	PainelGeral(){
		setVisible(true);
		setBackground(Color.white);
		setSize(1920, 1080);
		setLayout(new BorderLayout());
		setForeground(Color.DARK_GRAY);
		add(painelbotoes,BorderLayout.EAST);
		add(painelmalha,BorderLayout.CENTER);
		criarAcaoBotao(painelbotoes.processarProximoInstante);
		criarAcaoBotao(painelbotoes.lerNovoArquivoDeEntrada);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == painelbotoes.processarProximoInstante) {
			conservarBugs(10);
			conservarDevs(10);
			bug.colisaoGeralBugs(p);
			dev.colisaoGeralDevs(p);
			funcaointerface.resetMalha(arraymalha);
			funcaointerface.implementarBugMalha(bugsgerais, arraymalha);
			funcaointerface.implementarDevMalha(devsgerais,arraymalha);
			funcaointerface.moverPlanetaNaInterface(p,arraymalha);
			
			
			
				
	}
		if(e.getSource() == painelbotoes.lerNovoArquivoDeEntrada) {
			
			 lerarquivo.pegarStringDados();
			
			
			
			
		}
		
	
	
	}

	private void conservarBugs(int i) {
		
		ArrayList<Bug> bugsparciais = bug.criarbugs(i, arraymalha);
		for (Bug bugs: bugsparciais) {
			bugsgerais.add(bugs);
		}
	}
	private void conservarDevs(int i) {
		ArrayList<Dev> devsparciais = dev.criardevs(i, arraymalha);
		for (Dev devs: devsparciais) {
			devsgerais.add(devs);
		}
	}

	
	private Buttons criarAcaoBotao(Buttons botao) {
	botao.addActionListener(this);
	return botao;
}
}