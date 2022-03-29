package Controller;

import java.util.List;

import dao.ChamadoDao;
import model.Chamado;

public class ChamadoController {
	
	public void registrarChamado(Chamado Chamado) throws Exception {
		if (Chamado.getInicioChamado() == true ) {
			throw new Exception("Chamado iniciado... ");
	    }
	    if (Chamado.getInicioChamado() == false) {
	    	throw new Exception ("Chamado Finalizado... ");
	    }
	    ChamadoDao.getInstance().registrarChamado(Chamado);
	}
	
	public List<Chamado> listar(){
		return ChamadoDao.getInstance().listar();
	}
}