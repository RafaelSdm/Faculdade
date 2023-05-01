package bancoRafaelDamasceno;

public class BancoB implements Banco {
	
	
	private Double transferencia;
	private Conta conta;
	private Double saque;
	private Double deposito;
	private Double extrato;
	
	
	
	
	
	

	public BancoB(Conta conta) {
		super();

		this.conta = conta;


	}

	@Override
	public Double getmanutencaoConta() {
		// TODO Auto-generated method stub
		//conta.getSaldo() = cocnta.getSaldo - 100;
		Double teste = conta.getSaldo() - 100;
		return conta.setSaldo(teste);
	}

	@Override
	public Double getSaque(Double saque) {
		// TODO Auto-generated method stub
		Double retirada = conta.getSaldo() - saque;
		return conta.setSaldo(retirada);
	}

	@Override
	public Double getdeposito(Double deposito) {
		// TODO Auto-generated method stub
		Double adicionar = conta.getSaldo() + deposito;
		return conta.setSaldo(adicionar);
	}

	@Override
	public Double getExtrato() {
		// TODO Auto-generated method stub
		return conta.getSaldo();
	}
	
	public int getUserBanco() {
		return conta.getNumeroConta();
	}

	@Override
	public String toString() {
		return "BancoA [transferencia=" + transferencia + ", conta=" + conta + ", saque=" + saque + ", deposito="
				+ deposito + ", extrato=" + extrato + "]";
	}
	
	
	
	
	
	
	

}
