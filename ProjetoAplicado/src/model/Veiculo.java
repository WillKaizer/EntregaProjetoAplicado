package model;

public class Veiculo {
	
	private int numFrota;
	private char numPlaca;
	private float kmLitro;
	private boolean veiculoRevisado;
	private char veiculoIdChassi;
	
		
	public Veiculo(int numFrota, char numPlaca, float kmLitro, boolean veiculoRevisado, char veiculoIdChassi) {
		super();
		this.numFrota = numFrota;
		this.numPlaca = numPlaca;
		this.kmLitro = kmLitro;
		this.veiculoRevisado = veiculoRevisado;
		this.veiculoIdChassi = veiculoIdChassi;
	
	}
	
	public int getNumFrota() {
		return numFrota;
	}
	public void setNumFrota(int numFrota) {
		this.numFrota = numFrota;
	}
	public char getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(char numPlaca) {
		this.numPlaca = numPlaca;
	}
	public float getKmLitro() {
		return kmLitro;
	}
	public void setKmLitro(float kmLitro) {
		this.kmLitro = kmLitro;
	}
	public boolean isVeiculoRevisado() {
		return veiculoRevisado;
	}
	public void setVeiculoRevisado(boolean veiculoRevisado) {
		this.veiculoRevisado = veiculoRevisado;
	}
	public char getVeiculoIdChassi() {
		return veiculoIdChassi;
	}
	public void setVeiculoIdChassi(char veiculoIdChassi) {
		this.veiculoIdChassi = veiculoIdChassi;
	}
	

	}
	
	

