package controller;

import java.util.List;
import dao.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController {

    public void salvar(Funcionario funcionario) throws Exception {
    	if (funcionario.getNome().length() < 3) {
			throw new Exception("Nome inválido! ");
		}
    	FuncionarioDao.getInstance().salvar(funcionario);
	}
	
	public void atualizar(Funcionario funcionario) throws Exception {
		if (funcionario.getNome().length() < 3) {
			throw new Exception("Nome inválido! ");
		}
		FuncionarioDao.getInstance().atualizar(funcionario);
	}
	
	public void excluir(int nome) throws Exception {
		if (nome == 0) {
			throw new Exception("Funcionario inválido! ");
		}
		FuncionarioDao.getInstance().excluir(nome);
	}
	
  	public List<Funcionario> listar() {
  		return FuncionarioDao.getInstance().listar();
  	}
	
}