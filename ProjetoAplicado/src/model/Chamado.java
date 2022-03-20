package model;

public class Chamado {

	private int numChamado;
	private int inicioChamado;
	private int fimChamado;
	private char itinerario;
	private float distanciaPercorrida;
	
	public Chamado(int numChamado, int inicioChamado, int fimChamado, char itinerario, float distanciaPercorrida) {
		super();
		this.numChamado = numChamado;
		this.inicioChamado = inicioChamado;
		this.fimChamado = fimChamado;
		this.itinerario = itinerario;
		this.distanciaPercorrida = distanciaPercorrida;
	}
	public int getNumChamado() {
		return numChamado;
	}
	public void setNumChamado(int numChamado) {
		this.numChamado = numChamado;
	}
	public int getInicioChamado() {
		return inicioChamado;
	}
	public void setInicioChamado(int inicioChamado) {
		this.inicioChamado = inicioChamado;
	}
	public int getFimChamado() {
		return fimChamado;
	}
	public void setFimChamado(int fimChamado) {
		this.fimChamado = fimChamado;
	}
	public char getItinerario() {
		return itinerario;
	}
	public void setItinerario(char itinerario) {
		this.itinerario = itinerario;
	}
	public float getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	public void setDistanciaPercorrida(float distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	
	
}
