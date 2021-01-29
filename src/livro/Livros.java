package livro;

public class Livros {
	private int Id;
	private String Titulo;
	private String Autor;
	private String Genero;
	private boolean Estado;
	private boolean Emprestado;

	public Livros(int id, String titulo, String autor, String genero, boolean estado, boolean emprestado) {
		this.Id = id;
		this.Titulo = titulo;
		this.Autor = autor;
		this.Genero = genero;
		this.Estado = estado;
		this.Emprestado = emprestado;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public void setAutor(String autor) {
		this.Autor = autor;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public void setGenero(String genero) {
		this.Genero = genero;
	}

	public void setEmprestado(boolean emprestado) {
		this.Emprestado = emprestado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

	public int getId() {
		return this.Id;
	}

	public String getAutor() {
		return this.Autor;
	}

	public String getTitulo() {
		return this.Titulo;
	}

	public String getGenero() {
		return this.Genero;
	}

	public String getEmprestado() {
		if (Emprestado)
			return "Já emprestado";
		else
			return "Disponivel para empr�stimo";
	}

	public String getEstado() {
		if (Estado)
			return "Bom";
		else
			return "Ruim";
	}

	public String toString() {
		return Id + ";" + Titulo+ ";" +  Autor+ ";" +  Genero + ";" +  Estado+ ";" + Emprestado + ";" +  "\n";
	}
}
