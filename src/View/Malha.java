package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Malha extends JPanel {
	public int posiçãox;
	public int posiçãoy;
	public boolean ocupado = false;
	JLabel label = new JLabel();
	public Malha(int posiçãoy, int posiçãox) {
		this.posiçãox = posiçãox + 1;
		this.posiçãoy = posiçãoy + 1;
		setVisible(true);
		setBackground(Color.WHITE);
		label.setText( (posiçãoy + 1) + "," + (posiçãox + 1));
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);
		add(label);
	}
	


}
