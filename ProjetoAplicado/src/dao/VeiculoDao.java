package dao;

import java.util.ArrayList;
import java.util.List;

import model.Veiculo;

public class VeiculoDao {
	
	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculos = new ArrayList<>();
	
	/*
	 * Singleton
	 */
	public static VeiculoDao getInstace() {
		if (instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}
	
	public void salvar(Veiculo Veiculo) {
		listaVeiculos.add(Veiculo);
    }
	
	public void atualizar(Veiculo Veiculo) {
		listaVeiculos.set(Veiculo.getVeiculoIdChassi(), Veiculo);
	}
	
	public void excluir(int idVeiculo) {
		listaVeiculos.remove(idVeiculo);	
	}

	public List<Veiculo> listar(){
		return listaVeiculos;
	}
	
	
}
