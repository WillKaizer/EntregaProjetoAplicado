package dao;

import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDao {
	
	private static FuncionarioDao instance;
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static FuncionarioDao getInstace() {
		if (instance == null) {
			instance = new FuncionarioDao();
		}
		return instance;
	}
	
	
	public void salvar(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
    }
	
	public void atualizar(Funcionario funcionario) {
		listaFuncionarios.set(funcionario.getIdCpf(), funcionario);
	}
	
	public void excluir(int idFuncionario) {
		listaFuncionarios.remove(idFuncionario);	
	}

	public List<Funcionario> listar(){
		return listaFuncionarios;
	}
	
	
}
