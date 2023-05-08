package Vizualizacao;

import javax.swing.JOptionPane;
public class InfoConta {

	public void exibirExtratoDeSaques(String extrato) {
		JOptionPane.showConfirmDialog(null, extrato,"EXTRATO DOS SAQUES",JOptionPane.OK_CANCEL_OPTION);
	}
	public void exibirExtratoDeDepositos(String extrato) {	
		JOptionPane.showConfirmDialog(null, extrato,"EXTRATO DOS DEPOSITOS",JOptionPane.OK_CANCEL_OPTION);
	}

	public void exibirExtratoCompleto(String extrato) {
		JOptionPane.showConfirmDialog(null, extrato,"EXTRATO COMPLETO",JOptionPane.OK_CANCEL_OPTION);
	}
		
	public void exibirDadosDaConta(String dados) {	
			JOptionPane.showConfirmDialog(null, dados,"DADOS DA CONTA",JOptionPane.OK_CANCEL_OPTION);
	}
	public void exibirSaldoCompleto(int saldo) {
		JOptionPane.showConfirmDialog(null, saldo,"Esse é o saldo da sua conta",JOptionPane.OK_CANCEL_OPTION);
	}
}
