package carro;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Carro {
	
	private String[] cores;
	private String[] modelos;
	
	public String[] getCores() {
		return cores;
	}
	public void setCores(String[] cores) {
		this.cores = cores;
	}
	public String[] getModelos(){
		return modelos;
	}
	public void setModelos(String[] modelos) {
		this.modelos = modelos;
	}
	public int SolicitaCor() {
		String[] cores = {"PRETO","BRANCO","CINZA","MARROM","VERMELO","PEROLA","AZUL","VERDE ÁGUA",};
		JComboBox<String> cor = new JComboBox<String>(cores);
		JOptionPane.showConfirmDialog(cor,"Selecione umas das cores");
		return cor.getSelectedIndex();
	}
	public int SolicitaModelo() {
		String[] modelos = {"SUV","SEDÃ","PICAPE","VAN","CONVERSIVEL"};
		JComboBox<String> modelo = new JComboBox<String>(modelos);
		JOptionPane.showConfirmDialog(modelo," Selecione um modelos de carro");
		return modelo.getSelectedIndex();
	}
	
}