package carro;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class carro {
	  private String cor;
	  private String modelo;
	  
	  public String getCor() {
		  return cor;
	  }
	  public void setCor(String cor) {
		  this.cor = cor;
	  }
	  public String getModelo() {
		  return modelo;
	  }
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static String solicitaCor() {
		String[] cores = {"PRETO","BRANCO","CINZA","MARROM","VERMELO","PEROLA","AZUL","VERDE ÁGUA",};
		JComboBox<String> cor = new JComboBox<String>(cores);
		JOptionPane.showConfirmDialog(null,cor, "Selocione a cor desejada para seu carro", JOptionPane.OK_CANCEL_OPTION);
		int core = cor.getSelectedIndex();
		return cores[core];
	}
	public static String solicitaModelo() {
		String[] modelos = {"SUV","SEDÃ","PICAPE","VAN","CONVERSIVEL"};	
		JComboBox<String> modelo = new JComboBox<String>(modelos);
		JOptionPane.showConfirmDialog(null, modelo, "Selocione o modelo desejado do seu carro", JOptionPane.OK_CANCEL_OPTION);		
		int molds = modelo.getSelectedIndex();
		return modelos[molds];
	}


}
