package controller;

import java.util.List;
import dao.VeiculoDao;
import model.Veiculo;


public class VeiculoController {
	
    public void salvar(Veiculo veiculo) throws Exception {
    	if (veiculo.getModelo() == null || veiculo.getModelo().length() < 15) {
			throw new Exception("Modelo Salvo! ");
		}
    	VeiculoDao.getInstance().salvar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) throws Exception {
		if (veiculo.getModelo() == null || veiculo.getModelo().length() < 15) {
			throw new Exception("Modelo Atualizado! ");
		}
		VeiculoDao.getInstance().atualizar(veiculo);
	}
	
	public void excluir(int idVeiculo) throws Exception {
		if (idVeiculo == 0) {
			throw new Exception("Veiculo excluido! ");
		}
		VeiculoDao.getInstance().excluir(idVeiculo);
	}
	
  	public List<Veiculo> listar() {
  		return VeiculoDao.getInstance().listar();
  	}
	
}