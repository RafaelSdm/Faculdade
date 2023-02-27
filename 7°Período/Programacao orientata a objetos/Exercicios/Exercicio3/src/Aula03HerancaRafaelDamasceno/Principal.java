package Aula03HerancaRafaelDamasceno;

public class Principal {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Rafael", "15307988680", "08/08/2001", "201000831");
		
		
		
		System.out.println("Nome:"+ aluno.getNome() + "e o custo das copias ficaram em " + aluno.getValorCopia(1000));
	}

}
