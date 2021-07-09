package aula8.interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Tela extends JPanel {
	private ArrayList<Desenhavel> formas;
	
	//exemplo de varargs... formas será um vetor de desenhaveis
	public Tela(Desenhavel... formas) {
		this.formas = new ArrayList<Desenhavel>();
		for(Desenhavel forma:formas) this.formas.add(forma);
	}
	public void addForma(Desenhavel d) {
		formas.add(d);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x=5, y=5;
		for(Desenhavel d: formas) {
			d.desenha(g, x, y);
			x = x+5+d.getLargura();
		}
	}
}
