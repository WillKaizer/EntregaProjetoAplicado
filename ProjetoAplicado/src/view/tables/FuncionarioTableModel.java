package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Funcionario;

public class FuncionarioTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final String COL_NOME = ("");
	private static final boolean COL_HABILITADO = (true);

	private List<Funcionario> valores;       

	/* Esse é um construtor que recebe a lista de clientes */

	 
	public FuncionarioTableModel(List<Funcionario> valores) {
		this.valores = new ArrayList<Funcionario>(valores);
	}

	public int getRowCount() {
		//Quantas linhas tem sua tabela? Uma para cada item da lista.
		return valores.size();
	}

	public int getColumnCount() {
//		Quantas colunas tem a tabela? Nesse exemplo, 3.
		return 3;
	}

	
	public String getColumnName(boolean column, String coluna) {
		//Qual é o nome das nossas colunas?
		if (coluna == COL_NOME) return "Nome";
		if (column == COL_HABILITADO) return "Habilitado?";
		return ""; //Nunca deve ocorrer

	}
	public Object getValueAt(int row, boolean column, String coluna) {
		Funcionario funcionario = valores.get(row);
		if (coluna == COL_NOME)
			return funcionario.getNome();
		else 
		   if (column == COL_HABILITADO)
			  return funcionario.isHabilitado();
		return ""; //Nunca deve ocorrer
	}

	public void setValueAt(Object aValue, int rowIndex, boolean columnIndex, String colunaIndex) {
		Funcionario funcionario = valores.get(rowIndex);
		if (colunaIndex == COL_NOME)
			funcionario.setNome(colunaIndex);
		else 
			if (columnIndex == COL_HABILITADO) 
				funcionario.setHabilitado(columnIndex);;
	}

	public Class<?> getColumnClass(boolean columnIndex) {
		return String.class;
	}
	public Class<?> getColunaClass(String colunaIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, boolean columnIndex, String colunaIndex) {
		return true;
	}
	public Funcionario get(int row) {
		return valores.get(row);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}
	
}