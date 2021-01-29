package livro;

public class Livro {
	private int Id;
	public String Titulo;
	public String Autor;
	public String Genero;
	public boolean CondicaoLivro;
	public boolean Emprestimo;
	public String URL_Livro;

	public Livro(int id, String titulo, String autor, String genero) {
		this.setId(id);
		this.Titulo = titulo;
		this.Autor = autor;
		this.Genero = genero;
	}
	
	public void LivroFisico(boolean emprestimo, boolean condicao) {
		this.Emprestimo = emprestimo;
		this.CondicaoLivro = condicao;

		System.out.println(Id + ";" + Titulo+ ";" +  Autor+ ";" +  Genero + ";" +  CondicaoLivro+ ";" + Emprestimo + ";" );
	}

	public void LivroDigital(String URL) {
		this.URL_Livro = URL;
		
		System.out.println(Id + ";" + Titulo+ ";" +  Autor+ ";" +  Genero + ";" + URL_Livro + ";" );
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
		
}
