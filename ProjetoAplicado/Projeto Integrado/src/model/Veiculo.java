package model;

public class Veiculo {
	
	private int numFrota;
	private String numPlaca;
	private float kmLitro;
	private boolean veiculoRevisado;
	private String veiculoIdChassi;
	
		
	public Veiculo(int numFrota, String numPlaca, float kmLitro, boolean veiculoRevisado, String veiculoIdChassi) {
		super();
		this.numFrota = numFrota;
		this.numPlaca = numPlaca;
		this.kmLitro = kmLitro;
		this.veiculoRevisado = veiculoRevisado;
		this.veiculoIdChassi = veiculoIdChassi;
	
	}
	
	public Veiculo() {
	}

	public int getNumFrota() {
		return numFrota;
	}
	public void setNumFrota(int numFrota) {
		this.numFrota = numFrota;
	}
	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
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
	public String getVeiculoIdChassi() {
		return veiculoIdChassi;
	}
	public void setVeiculoIdChassi(String veiculoIdChassi) {
		this.veiculoIdChassi = veiculoIdChassi;
	}
	
	public String toString() {
		return numFrota + " - " + numPlaca + " - " + kmLitro + " - "  + veiculoRevisado + " - " + veiculoIdChassi ;
	}
}