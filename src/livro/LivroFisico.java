package livro;

public class LivroFisico extends Livro {

	public LivroFisico(int id, String titulo, String autor, String genero) {
		super(id, titulo, autor, genero);
	}

	public static void main(String[] args) {
		LivroFisico NovoLivro = new LivroFisico(1, "Minha Biografia", "Rodrigo", "Drama");
		NovoLivro.LivroFisico(false, true);
	}

}
