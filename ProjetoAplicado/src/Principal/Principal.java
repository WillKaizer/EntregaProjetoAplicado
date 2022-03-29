package Principal;


import Controller.FuncionarioController;
import model.Funcionario;
import java.time.LocalDate;
import model.Chamado;
import Controller.ChamadoController;
import model.Veiculo;
import Controller.VeiculoController;

public class Principal {
	
	public static void main(String[] args) {
		testeFuncionario();
		testeVeiculo();
		testeChamado();
		
	}
	
	public static void testeFuncionario() {
		Funcionario f1 = new Funcionario();
		f1.setIdCpf("12345678911");
		f1.setidFuncionario(1);
		f1.setNome("Joao Paulo");
		f1.setDataNac(LocalDate.of(2022, 03, 27));
		f1.setEndereco("Rua: Joinville, nº1");
		f1.setHabilitado(true);
		f1.setDisponivel(true);
		
			
		Funcionario f2 = new Funcionario();
		f2.setIdCpf("12345678921");
		f2.setidFuncionario(2);
		f2.setNome("Pedro Paulo");
		f2.setDataNac(LocalDate.of(2022, 02, 27));
		f2.setEndereco("Rua: Joinville, nº2");
		f2.setHabilitado(false);
		f2.setDisponivel(false);
		
		
		FuncionarioController controller = new FuncionarioController();
		try {
			controller.salvar(f1);
			controller.salvar(f2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Funcionario f : controller.listar()) {
			System.out.println(f.toString());
		}
	}
	

	public static void testeVeiculo() {
		Veiculo v1 = new Veiculo();
		v1.setNumFrota(1);
		v1.setNumPlaca("ABC1J123");
		v1.setKmLitro((float) 10.0);
		v1.setVeiculoIdChassi("1a2b3c4d5e6f7g8h9");
		v1.setVeiculoRevisado(true);
		
		Veiculo v2 = new Veiculo();{
			v2.setNumFrota(1);
			v2.setNumPlaca("DFE4K567");
			v2.setKmLitro((float) 15.0);
			v2.setVeiculoIdChassi("9a8b7c6d5e4f3g2h1");
			v2.setVeiculoRevisado(false);
		
			VeiculoController controller = new VeiculoController();
			try {
				controller.salvar(v1);
				controller.salvar(v2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			for (Veiculo v : controller.listar()) {
				System.out.println(v.toString());
			}
			
		
			}
		}
	
	public static void testeChamado() {
		Chamado chamado = new Chamado();
		chamado.setNumChamado(2);
		chamado.setInicioChamado(false);
		chamado.setenderecoChamado("Rua: Abracadabra, nº2");
		chamado.setkmSaidaVeiculo((float) 1000.0);
		chamado.setkmChegadaVeiculo((float) 1050.0);
		
		ChamadoController controller = new ChamadoController();
		try {
			controller.registrarChamado(chamado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}