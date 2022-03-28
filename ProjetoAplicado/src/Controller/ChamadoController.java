package Controller;

import dao.ChamadoDao;
import model.Chamado;

public class ChamadoController {
	
	public void registrarChamado(Chamado Chamado) throws Exception {
		if (Chamado.getInicioChamado() == 0 ) {
			throw new Exception("Chamado não iniciado... ");
	    }
	    if (Chamado.getFimChamado() > 1) {
	    	throw new Exception ("Chamado iniciado... ");
	    }
	    ChamadoDao.getInstance().registrarChamado(Chamado);
	}
	
}