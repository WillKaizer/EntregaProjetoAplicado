package model;

import java.time.LocalDate;

public class Funcionario {
	
	private int idCpf;
	private char nome;
	private LocalDate dataNac;
	private char endereco;
	private boolean habilitado;
	private boolean disponivel;
	
	public Funcionario(int idCpf, char nome, LocalDate dataNac, char endereco, boolean habilitado, boolean disponivel) {
		super();
		this.idCpf = idCpf;
		this.nome = nome;
		this.dataNac = dataNac;
		this.endereco = endereco;
		this.habilitado = habilitado;
		this.disponivel = disponivel;
	}
	
	public int getIdCpf() {
		return idCpf;
	}
	public void setIdCpf(int idCpf) {
		this.idCpf = idCpf;
	}
	public char getNome() {
		return nome;
	}
	public void setNome(char nome) {
		this.nome = nome;
	}
	public LocalDate getDataNac() {
		return dataNac;
	}
	public void setDataNac(LocalDate dataNac) {
		this.dataNac = dataNac;
	}
	public char getEndereco() {
		return endereco;
	}
	public void setEndereco(char endereco) {
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
	
	

	

}
