package escola.musica.modelo;

public class Curso {

	private Integer id;
	private String nome;
	private String descricao;
	private double ducarao;
	private TipoCurso tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDucarao() {
		return ducarao;
	}

	public void setDucarao(double ducarao) {
		this.ducarao = ducarao;
	}

	public TipoCurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoCurso tipo) {
		this.tipo = tipo;
	}
}
