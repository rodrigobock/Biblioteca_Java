package livro;

import livro.Interfaces.ILivro;

public class LivroFisico extends Livro implements ILivro {

	public LivroFisico(int id, String titulo, String autor, String genero) {
		super(id, titulo, autor, genero);
	}

	public static void main(String[] args) {
		LivroFisico NovoLivro = new LivroFisico(1, "Minha Biografia", "Erick", "Drama");
		NovoLivro.LivroFisico(false, true);
	}

	public void Livro(boolean emprestimo, boolean condicao) {
		this.Emprestimo = emprestimo;
		this.CondicaoLivro = condicao;

		System.out.println(Id + ";" + Titulo+ ";" +  Autor+ ";" +  Genero + ";" +  CondicaoLivro+ ";" + Emprestimo + ";" );
	}
}
