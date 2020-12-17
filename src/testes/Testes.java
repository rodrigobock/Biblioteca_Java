package testes;

import core.ManipuladorArquivos;
import livro.Livros;

public class Testes {
	public static void main(String[] args) throws Exception {

		//Utilizando o arquivo de texto para armazenar dados
		ManipuladorArquivos.criaArquivo("funcionario.txt");
        Livros livro = new Livros(0001, "ABC", "DEF", "GHI", true, true);
        ManipuladorArquivos.gravaLivro("livro.txt", livro);
    	
    	Livros arquivoLido = ManipuladorArquivos.lerLivro("livro.txt");
    	System.out.println("\n----------------- Teste gravação em arquivo ----------");
    	System.out.println(arquivoLido);
    	System.out.println("-----------------\n");
	}
}
