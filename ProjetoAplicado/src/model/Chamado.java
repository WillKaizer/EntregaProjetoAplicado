package model;

public class Chamado {

	private int numChamado;
	private boolean inicioChamado;
	private boolean fimChamado;
	private String enderecoChamado;
	private float kmSaidaVeiculo;
	private float kmChegadaVeiculo;
	
	public Chamado(int numChamado, boolean inicioChamado, boolean fimChamado, String enderecoChamado, float kmSaidaVeiculo, float kmChegadaVeiculo) {
		super();
		this.numChamado = numChamado;
		this.inicioChamado = inicioChamado;
		this.fimChamado = fimChamado;
		this.enderecoChamado = enderecoChamado;
		this.kmSaidaVeiculo = kmSaidaVeiculo;
		this.kmChegadaVeiculo = kmChegadaVeiculo;
	}
	
	public Chamado() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumChamado() {
		return numChamado;
	}
	public void setNumChamado(int numChamado) {
		this.numChamado = numChamado;
	}
	public boolean getInicioChamado() {
		return inicioChamado;
	}
	public void setInicioChamado(boolean inicioChamado) {
		this.inicioChamado = inicioChamado;
	}
	public boolean getFimChamado() {
		return fimChamado;
	}
	public void setFimChamado(boolean fimChamado) {
		this.fimChamado = fimChamado;
	}
	public String getenderecoChamado() {
		return enderecoChamado;
	}
	public void setenderecoChamado(String enderecoChamado) {
		this.enderecoChamado = enderecoChamado;
	}
	public float getkmSaidaVeiculo() {
		return kmSaidaVeiculo;
	}
	public void setkmSaidaVeiculo(float kmSaidaVeiculo) {
		this.kmSaidaVeiculo = kmSaidaVeiculo;
	}
	
	public float getkmChegadaVeiculo() {
	return kmChegadaVeiculo;
	}
	public void setkmChegadaVeiculo(float kmChegadaVeiculo) {
	this.kmChegadaVeiculo = kmChegadaVeiculo;
	}

	
	public String toString() {
		return numChamado + " - " + inicioChamado + " - " + fimChamado + " - "  + enderecoChamado + " - " + kmSaidaVeiculo + " - " + kmChegadaVeiculo ;
	}
		
}