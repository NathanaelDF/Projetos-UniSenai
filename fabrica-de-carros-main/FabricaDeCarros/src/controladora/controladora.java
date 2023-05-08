package controladora;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import carro.*;
import fabrica.fabrica;

public class controladora {

	public void exibeMenu() {
		carro carro = new carro();
		fabrica fabrica = new fabrica();
		int opcao = 0;
		do {
			opcao = fabrica.solicitaOpcao();
			switch (opcao) {
			case 0:				
				int QtdeCarros = fabrica.numRep();
				for (int i = 0; i < QtdeCarros; i++) {
					fabrica.fabricarCarro();
				}
				
				break;
			case 1:
				 QtdeCarros = fabrica.numRep();
				 for (int i = 0; i < QtdeCarros; i++) {
					carro.setCor(carro.solicitaCor());
					carro.setModelo(carro.solicitaModelo());
					fabrica.venderCarro(carro.getCor(),carro.getModelo());
				 }
				break;
			case 2:
				fabrica.lerArray();
				break;

			}
		} while (opcao != 3);

	}
}
