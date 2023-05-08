package Controladora;

import EntradaSaida.Conta;
import Vizualizacao.*;

public class controladora {
	Conta conta = new Conta();
	InfoConta infoConta = new InfoConta();

	public void exibeMenu() {
		int opcao, opcoesExtratos, qualConta;
		String info;
		conta.gerarDadosDaConta();
		qualConta = conta.qualConta();
		do {
			opcao = conta.opcaoes();
			switch (opcao) {
			case 0:// saldo
				conta.setSaldo(conta.gerarSaldo(qualConta));
				infoConta.exibirSaldoCompleto(conta.getSaldo());
				break;
			case 1:// saque
				conta.sacar(qualConta);
				break;
			case 2:// deposito
				conta.depositar(qualConta);
				break;
			case 3:// extratos
				do {
					opcoesExtratos = conta.opcoesExtratos();
					switch (opcoesExtratos) {
					case 0:// extratos de saques
						info = conta.gerarExtratoSaques();
						infoConta.exibirExtratoDeSaques(info);
						break;
					case 1:// extrato de depositos
						info = conta.gerarExtratoDepositos();
						infoConta.exibirExtratoDeDepositos(info);
						break;
					case 2:// extrato completo
						info = conta.gerarExtrato();
						infoConta.exibirExtratoCompleto(info);
						break;
					}
				} while (opcoesExtratos != 3);
				break;
			case 4:// informações da conta
				info = conta.dadosConta();
				infoConta.exibirDadosDaConta(info);
				break;
			}
		} while (opcao != 5);
	}

}
