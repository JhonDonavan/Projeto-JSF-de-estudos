package escola.musica.Bean;

import javax.faces.bean.ManagedBean;

import escola.musica.modelo.Curso;

@ManagedBean
public class crusoBean {

	private Curso curso = new Curso();

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
