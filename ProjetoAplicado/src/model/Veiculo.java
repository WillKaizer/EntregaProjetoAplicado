package model;

public class Veiculo {
	
	private int idVeiculo;
	private String modelo;
	private String placa;
	private Float autonomia;
	private boolean disponivel;
	
	public Veiculo(String modelo, String placa, Float autonomia) {
		this.modelo = modelo;
		this.placa = placa;
		this.autonomia = autonomia;
		
	}
	
	public Veiculo() {
	
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setId(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	
	}

	public Float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Float autonomia) {
		this.autonomia = autonomia;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}	
	
	public String toString() {
		return modelo + " - Placa: " + placa;
	}
	
}