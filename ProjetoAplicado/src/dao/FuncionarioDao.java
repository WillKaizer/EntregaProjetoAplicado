package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;
import util.ConnectionUtil;

public class FuncionarioDao {

	private static FuncionarioDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	public static FuncionarioDao getInstance() {
		if (instance == null) {
			instance = new FuncionarioDao();
		}
		return instance;
	}
	
	public void salvar(Funcionario funcionario) {
		try {
			String sql = "insert into funcionario (nome, habilitado) values (?, ?);";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcionario.getNome());
			pstmt.setBoolean(2, funcionario.isHabilitado());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Funcionario funcionario) {
		try {
			String sql = "update funcionario set nome = ?, habilitado = ? where nome = ?;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcionario.getNome());
			pstmt.setBoolean(2, funcionario.isHabilitado());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from funcionario where nome = ?;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Funcionario> listar() {
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		try {
			String sql = "select * from funcionario;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Funcionario c = new Funcionario();
				c.setNome(rs.getString("nome"));
				c.setHabilitado(rs.getBoolean("habilitado"));
				listaFuncionarios.add(c);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaFuncionarios;
	}
	
}