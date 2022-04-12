package model;

public class Funcionario {

	private String nome;
	private boolean habilitado;
	

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario() {}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	public String toString() {
		return "IdFuncionario: " + " - " + nome; 
	}
	
}