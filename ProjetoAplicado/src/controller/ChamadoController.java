package controller;

import java.util.List;

import dao.ChamadoDao;
import dao.VeiculoDao;
import model.Chamado;

public class ChamadoController {
	
	public void salvar(Chamado chamado) throws Exception {
		if (chamado.getData() == null) {
			throw new Exception("Nome inv�lido");
		}
		
		ChamadoDao.getInstance().salvar(chamado);
		
	}

	public void criarChamado(Chamado chamado) throws Exception {
		if (chamado.getData() == null) 
			throw new Exception("Erro: Data de in�cio inv�lida.");
		
		if (chamado.getEndereco() == null || chamado.getEndereco().length() < 5) 
			throw new Exception("Erro: Endere�o inv�lido.");
		
		if (chamado.getDistancia() < 1)
			throw new Exception("Erro: Dist�ncia inv�lida.");
		
		if (!chamado.getFuncionario().isHabilitado()) 
			throw new Exception("Erro: Funcionario n�o habilitado.");
		
		
		ChamadoDao.getInstance().criarChamado(chamado);
		VeiculoDao.getInstance().atualizar(chamado.getVeiculo());
	}
	
	public void atualizar(Chamado chamado) throws Exception {
		if (chamado.getEndereco() == null || chamado.getEndereco().length() < 5)
			throw new Exception("Erro: Endere�o inv�lido."); 
		
		if (chamado.getDistancia() < 1)
			throw new Exception("Erro: Dist�ncia inv�lida.");
		
		ChamadoDao.getInstance().atualizar(chamado);
		
	}
	
	public void excluir(Chamado chamado) throws Exception {
		if (chamado.getIdChamado() == 0) {
			throw new Exception("Erro: IdChamado inv�lido");
		}

	}
	
	public List<Chamado> listar() {
		List<Chamado> chamados = ChamadoDao.getInstance().listar();
		return chamados;
	}
	
	public Chamado listById(int id) {
		return ChamadoDao.getInstance().listById(id);
	}
	
}