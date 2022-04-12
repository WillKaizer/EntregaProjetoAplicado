package model;


public class Chamado {

	private int idChamado;
	private String data;
	private String endereco;
	private Double distancia;
	private Double emissaoCarbono;
	private Funcionario funcionario;
	private Veiculo veiculo;
		
	public Chamado(String data, String endereco, Double distancia, Funcionario funcionario, Veiculo veiculo) {
				this.data = data;
				this.endereco = endereco;
				this.distancia = distancia;
				this.funcionario = funcionario;
				this.veiculo = veiculo;
				calcularEmissaoCarbono();
	}

	public Chamado() {}
	
	public int getIdChamado() {
		return idChamado;
	}
	
	public void setId(int idChamado) {
		this.idChamado = idChamado;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
		
	}
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	
	public Double getEmissaoCarbono() {
		return emissaoCarbono;
	}
	
	public void setEmissaoCarbono(Double emissaoCarbono) {
		this.emissaoCarbono = emissaoCarbono;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void calcularEmissaoCarbono() {
		Double consumo = distancia / veiculo.getAutonomia();
		this.emissaoCarbono = consumo * 0.82 * 0.75 * 3.7;
	}
	
	public String toString()  {
		return idChamado + " - " + endereco + " - ";
	}
	
}