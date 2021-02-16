package livro;

import livro.Interfaces.ILivro;

public class LivroDigital extends Livro implements ILivro {
	
	public LivroDigital(int id, String titulo, String autor, String genero) {
		super(id, titulo, autor, genero);
	}

	public static void main(String[] args) {
		LivroDigital NovoLivro = new LivroDigital(1, "Minha Biografia", "Rodrigo", "Drama");
		NovoLivro.LivroDigital("google.com");
	}

	public void Livro(boolean emprestimo, boolean condicao) {
		this.Emprestimo = emprestimo;
		this.CondicaoLivro = condicao;

		System.out.println(Id + ";" + Titulo+ ";" +  Autor+ ";" +  Genero + ";" +  CondicaoLivro+ ";" + Emprestimo + ";" );
	}
	
}
