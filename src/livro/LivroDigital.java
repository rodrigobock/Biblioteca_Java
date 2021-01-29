package livro;

public class LivroDigital extends Livro{
	
	public LivroDigital(int id, String titulo, String autor, String genero) {
		super(id, titulo, autor, genero);
	}

	public static void main(String[] args) {
		LivroDigital NovoLivro = new LivroDigital(1, "Minha Biografia", "Rodrigo", "Drama");
		NovoLivro.LivroDigital("google.com");
	}
	
}
