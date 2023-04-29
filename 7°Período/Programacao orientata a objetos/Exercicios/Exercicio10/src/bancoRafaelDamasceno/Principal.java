package bancoRafaelDamasceno;

public class Principal {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 5000.00);
		
		BancoA banco1 = new BancoA(conta);
		//Double transferencia, Conta conta, Double saque, Double deposito, Double extrato
		
		
		//System.out.println(banco1.getdeposito());
		System.out.println("Custo de manutenção do banco do usuário: " + banco1.getUserBanco() + " deixou o saldo com R$ " + banco1.getmanutencaoConta());
		
		System.out.println("o banco ta no valor de " + banco1.getExtrato());
		
		System.out.println("O usuário do banco sacou R$1.200 e ficou com o saldo de R$" + banco1.getSaque(1200.00));
		
		System.out.println("O usuário do banco depositou R$4000.00 e ficou com o saldo de R$" + banco1.getdeposito(4000.00));

		
	}

}	
