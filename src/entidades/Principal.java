package entidades;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		Escola escola = new Escola();
		System.out.println("informe nome da Escola:");
		String nomeEscola= sc.next();
		escola.setNome(nomeEscola);
		
		System.out.println("informe CNPJ da Escola:");
		String cnpjEscola = sc.next();
		escola.setCnpj(cnpjEscola);
		
		System.out.println("informe endereço da Escola:");
		String endEscola= sc.next();
		escola.setEndereco(cnpjEscola);

		System.out.println("qtd de alunos matirculados:");
		int qtdAlunos =sc.nextInt();
		escola.setQtdAlunoMat(qtdAlunos);
		
		
		for (int i = 0; i<= qtdAlunos; i++) {
			Aluno aluno = new Aluno();
			System.out.println("digte o nome do aluno:");
			String nomeAluno= sc.next();
			aluno.setNome(nomeAluno);
			
			System.out.println("informe CPF:");
			String cpfAluno = sc.next();
			aluno.setCpf(cpfAluno);
			
			System.out.println("informe email:");
			String emailAluno = sc.next();
			aluno.setEmail(emailAluno);
			
			
			System.out.println("informe Idade:");
			int idadeAlunos =sc.nextInt();
			aluno.setIdade(idadeAlunos);
			
			System.out.println("Matricula:");
			String matriculaAluno = sc.next();
			aluno.setMatricula(matriculaAluno);
           
			
			
			
			
			
			
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
