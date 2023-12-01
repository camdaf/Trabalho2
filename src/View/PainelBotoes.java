package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import Planetas.Planeta;
import View.*;

public class PainelBotoes extends JPanel  {
	Buttons processarProximoInstante = new Buttons("Processar próximo instante");
	Buttons lerNovoArquivoDeEntrada = new Buttons("Ler novo arquivo de entrada");
	Buttons gravarRelatorio = new Buttons("Gravar relatório");
	Buttons lerDadosDeOutrosParticipantes = new Buttons("Ler dados de outros participantes");
	Buttons gravarArquivoDeSaida = new Buttons("Gravar arquivo de saida");
	
	public PainelBotoes() {
		setVisible(true);
		setPreferredSize(new Dimension(500,200));
		setBackground(Color.white);
		setLayout(new FlowLayout(FlowLayout.CENTER,40,90));
		setForeground(Color.DARK_GRAY);
		add(processarProximoInstante);
		add(lerNovoArquivoDeEntrada);
		add(gravarRelatorio);
		add(lerDadosDeOutrosParticipantes);
		add(gravarArquivoDeSaida);
	}
	
	
	
	
	
	
		
		
		
	}


	