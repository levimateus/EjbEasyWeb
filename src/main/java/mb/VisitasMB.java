package mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

import beans.VisitasBean;

@ManagedBean
@SessionScoped
public class VisitasMB {

	@EJB
	VisitasBean visitasBean;

	private String visitante;

	public void entrouVisita() {
		visitasBean.entrouVisita(visitante);
	}

	public List<String> getVisitas() {
		return new ArrayList<String>(visitasBean.getListaVisitantes());
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
}
