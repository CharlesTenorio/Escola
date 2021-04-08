package entidades;

public class Aluno {
	private String Nome;
	private Integer Idade;
	private String Email;
	private String Cpf;
	private String Matricula;
	
	
	public Aluno(String nome, Integer idade, String email, String cpf, String matricula) {
		
		Nome = nome;
		Idade = idade;
		Email = email;
		Cpf = cpf;
		Matricula = matricula;
	}
	
	public Aluno() {};
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getIdade() {
		return Idade;
	}
	public void setIdade(Integer idade) {
		Idade = idade;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	
	

}
