package escola.musica.Bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

@ManagedBean
public class CursoBean {

	private Curso curso = new Curso();
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<TipoCurso> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoCurso> tipos) {
		this.tipos = tipos;
	}
	
	

}
