package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Chamado;
import model.Funcionario;
import model.Veiculo;
import util.ConnectionUtil;

public class ChamadoDao {

	private static ChamadoDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	public static ChamadoDao getInstance() {
		if (instance == null) {
			instance = new ChamadoDao();
		}
		return instance;
	}
	
	public void salvar(Chamado chamado) {
		try {
			String sql = "insert into cliente (distancia, data, endereco, emissaoCarbono) values (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, chamado.getDistancia());
			pstmt.setDate(2,java.sql.Date.valueOf(chamado.getData()));
			pstmt.setString(3, chamado.getEndereco());
			pstmt.setDouble(4, chamado.getEmissaoCarbono());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void criarChamado(Chamado chamado) {
		try {
			String sql = "insert into chamado (distancia, data, endereco, emissaoCarbono,"
					+ "funcionario_idFuncionario, veiculo_idVeiculo) values (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, chamado.getDistancia());
			pstmt.setDate(2, java.sql.Date.valueOf(chamado.getData()));
			pstmt.setString(3, chamado.getEndereco());
			pstmt.setDouble(4, chamado.getEmissaoCarbono());
			pstmt.setInt(5, chamado.getVeiculo().getIdVeiculo());
			
			
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Chamado chamado) {
		try {
			String sql = "update chamado set data = ?, endereco = ?, distancia = ?, carbono = ?, "
					+ "funcionario_idFuncionario = ?, veiculo_idVeiculo = ?, where idChamado = ?;";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, Date.valueOf(chamado.getData()));
			pstmt.setString(2, chamado.getEndereco());
			pstmt.setDouble(3, chamado.getDistancia());
			pstmt.setDouble(4, chamado.getEmissaoCarbono());
			pstmt.setInt(5, chamado.getVeiculo().getIdVeiculo());
			pstmt.setInt(6, chamado.getIdChamado());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from chamado where idChamado = ?;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Chamado> listar() {
		List<Chamado> listaChamados = new ArrayList<>();
		
		try {
			String sql = "select * from chamado c join funcionario func on c.funcionario_idFuncionario = func.idFuncionario"
					+ " join veiculo v on c.veiculo_idVeiculo = v.idVeiculo;";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Chamado c = new Chamado();
				c.setId(rs.getInt("idChamado"));
				c.setData((rs.getDate("data").toString()));
				c.setEndereco(rs.getString("endereco"));
				c.setDistancia(rs.getDouble("distancia"));
				c.setEmissaoCarbono(rs.getDouble("carbono"));

				Veiculo v = new Veiculo();
				v.setId(rs.getInt("idVeiculo"));
				v.setModelo(rs.getString("modelo"));
				v.setPlaca(rs.getString("placa"));
				v.setAutonomia(rs.getFloat("km_litro"));
				
				Funcionario func = new Funcionario(rs.getString("nome"));
				func.setHabilitado(rs.getBoolean("habilitado"));
				
				c.setVeiculo(v);
				c.setFuncionario(func);
				
				listaChamados.add(c);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaChamados;
	}

	public Chamado listById(int id) {
		Chamado c = new Chamado();
		
		try {
			String sql = "select * from chamado c join funcionario func on c.funcionario_idFuncionario = func.idFuncionario"
					+ " join veiculo v on c.veiculo_idVeiculo = v.idVeiculo where idChamado = ?;";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt("idChamado"));
				c.setData(rs.getDate("data_inicio").toString());
				c.setEndereco(rs.getString("endereco"));
				c.setDistancia(rs.getDouble("distancia"));
				c.setEmissaoCarbono(rs.getDouble("carbono"));
				
				Veiculo v = new Veiculo();
				v.setId(rs.getInt("idVeiculo"));
				v.setModelo(rs.getString("modelo"));
				v.setPlaca(rs.getString("placa"));
				v.setAutonomia(rs.getFloat("km_litro"));
				
				Funcionario func = new Funcionario(rs.getString("nome"));
				func.setHabilitado(rs.getBoolean("habilitado"));
				
				c.setVeiculo(v);
				c.setFuncionario(func);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
}