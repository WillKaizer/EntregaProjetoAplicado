package model;

import java.time.LocalDate;

public class Funcionario {
	
	private String idCpf;
	private int idFuncionario;
	private String nome;
	private LocalDate dataNasc;
	private String endereco;
	private boolean habilitado;
	private boolean disponivel;
	
	public Funcionario(String idCpf, int idFuncionario, String nome, LocalDate dataNasc, String endereco, boolean habilitado, boolean disponivel) {
		super();
		this.idCpf = idCpf;
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.habilitado = habilitado;
		this.disponivel = disponivel;
	}
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getIdCpf() {
		return idCpf;
	}


	public void setIdCpf(String idCpf) {
		this.idCpf = idCpf;
	}
	
	public int getidFuncionario() {
		return idFuncionario;
	}
	
	public void setidFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNac() {
		return dataNasc;
	}
	public void setDataNac(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		

		}
	
	public String toString() {
		return nome + " - " + idCpf + " - "  + idFuncionario + " - " + dataNasc + " - "  + endereco + " - " + habilitado + " - " + disponivel;
		
	}
		
		
/*		
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setIdCpf(int i) {
		// TODO Auto-generated method stub
		
	}
		
*/
}