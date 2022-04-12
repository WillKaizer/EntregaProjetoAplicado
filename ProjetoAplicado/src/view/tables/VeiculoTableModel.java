package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Veiculo;

public class VeiculoTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final String COL_NUM_PLACA = ("");
	private static final float COL_AUTONOMIA = 1;
	private static final String COL_MODELO = ("");

	private List<Veiculo> valores;       

	//Esse é um construtor, que recebe a nossa lista de clientes
	public VeiculoTableModel(List<Veiculo> valores) {
		this.valores = new ArrayList<Veiculo>(valores);
	}

	public int getRowCount() {
		//Quantas linhas tem sua tabela? Uma para cada item da lista.
		return valores.size();
	}

	public int getColumnCount() {
//		Quantas colunas tem a tabela? Nesse exemplo, 3.
		return 3;
	}

	
	public String getColumnName(int column, String coluna) {
		//Qual é o nome das nossas colunas?
		if (coluna == COL_NUM_PLACA) return"Num placa";
		if (column == COL_AUTONOMIA) return "Autonomia";
		if (coluna == COL_MODELO) return "Modelo";
		return ""; //Nunca deve ocorrer

	}
	public Object getValueAt(int row, int column, String coluna) {
		Veiculo veiculo = valores.get(row);
		if (coluna == COL_NUM_PLACA)
			return veiculo.getPlaca();
		if (coluna == COL_MODELO)
        return veiculo.getModelo(); 
		else 
		   if (column == COL_AUTONOMIA)
			  return veiculo.getAutonomia();
		return ""; //Nunca deve ocorrer
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex, String colunaIndex) {
		Veiculo veiculo = valores.get(rowIndex);
		if (colunaIndex == COL_NUM_PLACA)
			veiculo.setPlaca(colunaIndex);
		if (colunaIndex == COL_MODELO)
			veiculo.setModelo(colunaIndex);
		else 
			if (columnIndex == COL_AUTONOMIA) 
				veiculo.setAutonomia(null);;
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}
	public Class<?> getColunaClass(String colunaIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	public Veiculo get(int row) {
		return valores.get(row);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}
	
}