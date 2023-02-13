package aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Principal {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
		Date aluno_1 = formato.parse("08/08/2001");
		Aluno aluno1 = new Aluno("Rafael", "123456789", aluno_1, "rafaeldamasceno2000@gmail.com" );
		
		
		System.out.println("------------------------------------------------------------");
	
		System.out.println("Nome:"+ aluno1.getNome());
		System.out.println("CPF:" + aluno1.getCpf());
		System.out.println("Data:" +aluno1.getDataNasci());
		System.out.println("Email:" +aluno1.getEmail());
		
		
		Date aluno_2 = formato.parse("08/08/2001");
		Aluno aluno2 = new Aluno("Joao", "124569878", aluno_2, "joaokleber@gmail.com" );
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Nome:"+ aluno2.getNome());
		System.out.println("CPF:" + aluno2.getCpf());
		System.out.println("Data:" +aluno2.getDataNasci());
		System.out.println("Email:" +aluno2.getEmail());
		
		
		Date aluno_3 = formato.parse("08/08/2001");
		Aluno aluno3 = new Aluno("Ricardo", "789456123", aluno_3, "ricardo2023@gmail.com" );
		System.out.println("-------------------------------------------------------");
		System.out.println("Nome:"+ aluno3.getNome());
		System.out.println("CPF:" + aluno3.getCpf());
		System.out.println("Data:" +aluno3.getDataNasci());
		System.out.println("Email:" +aluno3.getEmail());
		
		
		
		
		
		
		
		
		
	
		
	}
}
