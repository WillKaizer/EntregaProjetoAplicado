package Controller;

import java.util.List;

import dao.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController { 
	
	public void salvar(Funcionario Funcionario) throws Exception {
	    if (Funcionario.getidFuncionario() == 0) {
    	    throw new Exception("Funcion�rio inv�lido... ");
        }
	    FuncionarioDao.getInstance().salvar(Funcionario);
	
    }
	
	public void atualizar(Funcionario Funcionario) throws Exception {
		if (Funcionario.getidFuncionario() == 0) {
        	throw new Exception("Funcion�rio inv�lido! ");
	    }
		FuncionarioDao.getInstance().atualizar(Funcionario);
	
	}
	
	public void excluir(int idFuncionario) throws Exception {
		if (idFuncionario == 0) {
			throw new Exception("Nenhum funcion�rio selecionado... ");
		}
		FuncionarioDao.getInstance().excluir(idFuncionario);
		
	}

	public List<Funcionario> listar(){
		return FuncionarioDao.getInstance().listar();
	}
	
	
}