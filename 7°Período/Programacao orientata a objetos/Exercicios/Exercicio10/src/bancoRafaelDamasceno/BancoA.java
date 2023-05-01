package bancoRafaelDamasceno;

public class BancoA implements Banco {
	
	
	private Double transferencia;
	private Conta conta;
	private Double saque;
	private Double deposito;
	private Double extrato;
	
	
	
	
	
	

	public BancoA(Conta conta) {
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
	
	
	public void transferencia(Conta contaT, Double trasnferencia) {
		
		//trasnferencia = trasnferencia + contaT.getSaldo();
		//valorTotal = transferencia + 2000.00;
		Double adicionar = contaT.getSaldo() + trasnferencia ;
		Double retirar = conta.getSaldo() - trasnferencia ;

		System.out.println(conta.getSaldo());
		System.out.println("valor do adicionar: " + adicionar);
		//conta.setSaldo(conta.getSaldo() - 3000.00);
		conta.setSaldo(retirar);
		contaT.setSaldo(adicionar);
	}
	

	@Override
	public String toString() {
		return "BancoA [transferencia=" + transferencia + ", conta=" + conta + ", saque=" + saque + ", deposito="
				+ deposito + ", extrato=" + extrato + "]";
	}
	
	
	
	
	
	
	

}
