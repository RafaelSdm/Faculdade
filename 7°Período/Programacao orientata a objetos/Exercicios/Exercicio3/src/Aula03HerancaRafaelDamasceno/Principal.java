package Aula03HerancaRafaelDamasceno;

public class Principal {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Rafael", "15307988680", "08/08/2001", "201000831");
		
		Funcionario funcionario = new Funcionario("Ronaldo", "28/03/1967", "12345678900", 4000.00, "01/10/2000", "Diretor");
		
		Professor professor = new Professor("Robson","05/08/1995","45678985222", 8000.00, "Sistemas Operacionais, Redes de Computadores, Organização de Computadores");
		
		System.out.println("INFORMAÇÃO DO ALUNO");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF: "+ aluno.getCpf());
		System.out.println("Data de nascimento: "+ aluno.getData_nascimento());
		System.out.println("Matricula: "+ aluno.getMatricula());
		System.out.println("Custo das copias ficaram em R$" + aluno.getValorCopia(1000));
		
		System.out.println("----------------------------------------------");
		
		System.out.println("INFORMAÇÃO DO FUNCIONÁRIO:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: "+ funcionario.getCpf());
		System.out.println("Data de nascimento: "+ funcionario.getData_nascimento());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Data de admissão: "+ funcionario.getAdmissao());
		System.out.println("Cargo: "+ funcionario.getCargo());
		System.out.println("Custo das copias ficaram em R$" + funcionario.getValorCopia(1000));
		
		System.out.println("------------------------------------------------");
		
		
		System.out.println("INFORMACÃO DO PROFESSOR");
		System.out.println("Nome: "+ professor.getNome());
		System.out.println("CPF: "+ professor.getCpf());
		System.out.println("Data de nascimento:"+ professor.getData_nascimento());
		System.out.println("Salario: " + professor.getSalario());
		System.out.println("Disciplinas:" + professor.getDisciplina());
		System.out.println("Custo das copias ficaram em R$" + professor.getValorCopia(1000));
		
		
	}

}
