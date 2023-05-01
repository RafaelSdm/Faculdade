package bancoRafaelDamasceno;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Conta> listaBanco = new ArrayList<Conta>();

		Conta conta = new Conta(1234, 5000.00);
		
		
		
		Conta contaB = new Conta(8765, 12000.00);
		listaBanco.add(contaB);
		
		
		BancoA banco1 = new BancoA(conta);
		
		BancoB banco2 = new BancoB(contaB);
		//Double transferencia, Conta conta, Double saque, Double deposito, Double extrato
		
		
		//System.out.println(banco1.getdeposito());
		System.out.println("Custo de manutenção do banco do usuário: " + banco1.getUserBanco() + " deixou o saldo com R$ " + banco1.getmanutencaoConta());
		
		System.out.println("o banco ta no valor de " + banco1.getExtrato());
		
		System.out.println("O usuário do banco sacou R$1.200 e ficou com o saldo de R$" + banco1.getSaque(1200.00));
		
		System.out.println("O usuário do banco depositou R$4000.00 e ficou com o saldo de R$" + banco1.getdeposito(4000.00));
		
		System.out.println("Foi passao o dinheiro para o banco b....");
		banco1.transferencia(contaB, 3000.00);
		
		
		System.out.println("O valor da conta do usuario " + banco2.getUserBanco() + "é de RS:  "+ banco2.getExtrato());
		
		
		System.out.println("Valor do banco pos da trasferencia:" + banco1.getExtrato());

	}

}	
