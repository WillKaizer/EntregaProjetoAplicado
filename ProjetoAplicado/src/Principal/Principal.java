package Principal;

import Controller.FuncionarioController;
import model.Funcionario;
import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setIdCpf(1234567891);;
		f1.setNome("Joao Paulo");
		f1.setDataNac(LocalDate.of(2022, 03, 27));
		f1.setEndereco("Rua: Joinville, nº1");
		f1.setHabilitado(true);
		f1.setDisponivel(true);
		
		
		Funcionario f2 = new Funcionario();
		f2.setIdCpf(1234567892);
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
		
		for (Funcionario c : controller.listar()) {
			System.out.println(c.toString());
		}

	}
	
}