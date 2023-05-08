package EntradaSaida;

public class Movimentacao {

	private int tipoMovi;
	
	private int saque;

	private int deposito;

	private int valor;

	private int conta;

	private String data;

	private String nomeTitular;

	private String cpfTitular;

	public int getTipoMovi() {
		return tipoMovi;
	}
	
	public void setTipoMovi(int tipoMovi) {
		this.tipoMovi = tipoMovi;
	}
	
	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
}
