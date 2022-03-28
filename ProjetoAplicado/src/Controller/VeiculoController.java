package Controller;

import java.util.List;

import dao.VeiculoDao;
import model.Veiculo;

public class VeiculoController {
	
	public void salvar(Veiculo Veiculo) throws Exception {
        if (Veiculo.getNumPlaca() > 7 || Veiculo.getNumPlaca() < 7) {
        	throw new Exception("Placa inv�lida! ");
        }
        VeiculoDao.getInstace().salvar(Veiculo);
        
    }
	
	public void atualizar(Veiculo Veiculo) throws Exception {
		if (Veiculo.getNumPlaca() > 7 || Veiculo.getNumPlaca() < 7) {
        	throw new Exception("Placa inv�lida! ");
	    }
		VeiculoDao.getInstace().atualizar(Veiculo);
	}
	
	public void excluir(int idVeiculo) throws Exception {
		if (idVeiculo == 0) {
			throw new Exception("Nenhum ve�culo selecionado... ");
		}
		VeiculoDao.getInstace().excluir(idVeiculo);
	}

	public List<Veiculo> listar(){
		return VeiculoDao.getInstace().listar();
	}
	
	
}
