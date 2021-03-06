package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import livro.Livros;

public class ManipuladorArquivos {

	public static boolean verificaArquivo(String caminho) {
		File arquivo = new File(caminho);
		boolean existe = arquivo.exists();

		return existe;
	}

	public static boolean criaArquivo(String caminho) {
		File arquivo = new File(caminho);
		try {
			return arquivo.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean escreveArquivo(String caminho, String conteudo) {
		try {
			FileWriter arq = new FileWriter(caminho);
			arq.write(conteudo);
			arq.close();
		} catch (IOException e) {
			return false;
		}

		return true;

	}

	public static ArrayList<String> lerArquivo(String caminho) {
		ArrayList<String> texto = new ArrayList<String>();
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader bufferLeitura = new BufferedReader(arq);
			String linha = bufferLeitura.readLine();
			while (linha != null) {
				texto.add(linha);
				linha = bufferLeitura.readLine();
			}
		} catch (IOException e) {
			return null;
		}
		return texto;
	}
	
	public static boolean gravaLivro(String caminho, Livros funcionario) {
		return escreveArquivo(caminho, funcionario.toString());
	}
	
	public static Livros lerLivro(String caminho) {
		Livros livro;
		ArrayList<String> texto = lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");
		
		livro = new Livros(Integer.parseInt(dados[0].trim()), dados[1], dados[2], dados[3], Boolean.parseBoolean(dados[4]), Boolean.parseBoolean(dados[5]) );
		
		return livro;
	}
	
}
