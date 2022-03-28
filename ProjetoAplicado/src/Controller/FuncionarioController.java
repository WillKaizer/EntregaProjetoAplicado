package Controller;

import java.util.List;

import dao.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController { 
	
	public void salvar(Funcionario Funcionario) throws Exception {
	    if (Funcionario.getIdCpf() == 0 || Funcionario.getIdCpf() == 0) {
    	    throw new Exception("Funcion�rio inv�lido... ");
        }
	    FuncionarioDao.getInstace().salvar(Funcionario);
	
    }
	
	public void atualizar(Funcionario Funcionario) throws Exception {
		if (Funcionario.getIdCpf() == 0 || Funcionario.getIdCpf() == 0) {
        	throw new Exception("Funcion�rio inv�lido! ");
	    }
		FuncionarioDao.getInstace().atualizar(Funcionario);
	
	}
	
	public void excluir(int idFuncionario) throws Exception {
		if (idFuncionario == 0) {
			throw new Exception("Nenhum funcion�rio selecionado... ");
		}
		FuncionarioDao.getInstace().excluir(idFuncionario);
		
	}

	public List<Funcionario> listar(){
		return FuncionarioDao.getInstace().listar();
	}
	
	
}