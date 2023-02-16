package aluno;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;

public class Principal {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
		LocalDate aluno_1 = LocalDate.of(2001, 8, 8);
		Aluno aluno1 = new Aluno("Rafael", "153.079.886.80", aluno_1, "rafaeldamasceno2000@gmail.com" );
		
		
		System.out.println("------------------------------------------------------------");
	
		System.out.println("Nome:"+ aluno1.getNome());
		System.out.println("CPF:" + aluno1.getCpf());
		System.out.println("Data:" +aluno1.getDataNasci());
		System.out.println("Email:" +aluno1.getEmail());
		
		
		LocalDate aluno_2 = LocalDate.of(2003, 5, 20);
		Aluno aluno2 = new Aluno("Joao", "123.456.789.80", aluno_2, "joaokleber@gmail.com" );
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Nome:"+ aluno2.getNome());
		System.out.println("CPF:" + aluno2.getCpf());
		System.out.println("Data:" +aluno2.getDataNasci());
		System.out.println("Email:" +aluno2.getEmail());
		
		
		LocalDate aluno_3 = LocalDate.of(1990, 2, 5);
		Aluno aluno3 = new Aluno("Ricardo", "153.078.885.80", aluno_3, "ricardo2023@gmail.com" );
		System.out.println("-------------------------------------------------------");
		System.out.println("Nome:"+ aluno3.getNome());
		System.out.println("CPF:" + aluno3.getCpf());
		System.out.println("Data:" +aluno3.getDataNasci());
		System.out.println("Email:" +aluno3.getEmail());

		
		boolean resultado = aluno3.getDataNasci().isBefore(aluno2.getDataNasci());
		Integer primeiroComp = 0;
		
		if(resultado == true) {
			//System.out.println("O aluno 3 é maior que o aluno 2");
			primeiroComp = 1;
		
		
		}else {
			//System.out.println("O aluno 2 é maior que o aluno 3");
			primeiroComp = 2;
		}
		
		System.out.println(resultado);
		System.out.println(primeiroComp);
		
		System.out.println("---------------------------------------------");
		
		
		if(primeiroComp == 1) {
			resultado = aluno3.getDataNasci().isBefore(aluno1.getDataNasci());
			
			if(resultado == true) {
				//System.out.println("O aluno 3 é mais velho que o aluno 1");
				LocalDate dataAtual = LocalDate.now();
				int idade = Period.between(aluno3.getDataNasci(), dataAtual).getYears();
				//System.out.println(idade);
				System.out.println("O aluno: " + aluno3.getNome() + " é mais velho e tem "+ idade + " anos");
				
			}else {
				//System.out.println("O aluno 1 é mais velho que o aluno 3");
				LocalDate dataAtual = LocalDate.now();
				int idade = Period.between(aluno1.getDataNasci(), dataAtual).getYears();
				//System.out.println(idade);
				System.out.println("O aluno: " + aluno1.getNome() + " é mais velho e tem "+ idade + " anos");

			}
		}else {
			
			resultado = aluno2.getDataNasci().isBefore(aluno1.getDataNasci());
			
			if(resultado == true) {
				//System.out.println("o aluno 2 é mais velho que o aluno 1");
				LocalDate dataAtual = LocalDate.now();
				int idade = Period.between(aluno1.getDataNasci(), dataAtual).getYears();
				//System.out.println(idade);
				System.out.println("O aluno: " + aluno2.getNome() + " é mais velho e tem "+ idade + " anos");

			}else {
				//System.out.println("o aluno 1 é mais velho que o aluno 2");
				LocalDate dataAtual = LocalDate.now();
				int idade = Period.between(aluno1.getDataNasci(), dataAtual).getYears();
				//System.out.println(idade);
				System.out.println("O aluno: " + aluno1.getNome() + " é mais velho e tem "+ idade + " anos");

			}
			
			
			
		}
		
				
	
		
	}
}
