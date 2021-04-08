package entidades;

public class Escola {
	
	private String Endereco;
	
	private String Cnpj;
	private String Alunos[];
	private Integer QtdAlunoMat;
    private String Nome;
	
	
	public Escola(String endereco, String cnpj, String[] alunos, Integer qtdAlunoMat, String Nome) {
		
		Endereco = endereco;
		Cnpj = cnpj;
		Alunos = alunos;
	    QtdAlunoMat = qtdAlunoMat;
		Nome = Nome;
	}
	// metodo construtor vazio
	public Escola() {};
	
    
    
    
    
    public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	public String[] getAlunos() {
		return Alunos;
	}
	public void setAlunos(String[] alunos) {
		Alunos = alunos;
	}
	public Integer getQtdAlunoMat() {
		return QtdAlunoMat;
	}
	public void setQtdAlunoMat(Integer qtdAlunoMat) {
		QtdAlunoMat = qtdAlunoMat;
	}
	
}
