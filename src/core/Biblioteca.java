package core;

import java.util.ArrayList;

import livro.Livros;

public class Biblioteca {
	private static ArrayList<Livros> livros = new ArrayList<Livros>();

	public ArrayList<Livros> GetAll() {
		return livros;
	}

	public int GetQuantity() {
		return livros.size();
	}

	public void Create(Livros novo) {
		int maiorId = 0;
		for (Livros p : livros) {
			if (p.getId() > maiorId) {
				maiorId = p.getId();
			}
		}
		novo.setId(maiorId + 1);
		livros.add(novo);
	}

	public void Delete(int id) throws Exception {
		Livros p = GetById(id);
		livros.remove(p);
	}

	public Livros GetById(int idProcurado) throws Exception {
		for (Livros pe : livros) {
			if (pe.getId() == idProcurado) {
				return pe;
			}
		}
		throw new Exception("Não encontrado");
	}

	public void Update(Livros p) {
		int ondeMudar = -1;
		for (int i = 0; i < GetQuantity(); i++) {
			if (livros.get(i).getId() == p.getId()) {
				ondeMudar = i;
				break;
			}
		}
		if (ondeMudar >= 0) {
			livros.set(ondeMudar, p);
		}
	}

	public void Emprestar(Livros p) throws Exception {
		if (p.getEmprestado() == "Sim") {
			throw new Exception("Este livro já foi emprestado");
		}
		p.setEmprestado(true);
		Update(p);
	}

	public void AlterarEstado(int id, boolean estado) throws Exception {
		Livros p = GetById(id);
		p.setEstado(estado);
		Update(p);
	}

	public Livros BuscarPorAutor(String param) throws Exception {
		for (Livros pe : livros) {
			if (pe.getAutor() == param) {
				return pe;
			} else if (pe.getEstado() == param) {
				return pe;
			}
		}
		throw new Exception("Nenhum livro encontrado para esse autor");
	}

	public Livros BuscarPorTitulo(String param) throws Exception {
		for (Livros pe : livros) {
			if (pe.getTitulo() == param) {
				return pe;
			}
		}
		throw new Exception("Nenhum livro encontrado com esse título");
	}

	public Livros BuscarPorGenero(String param) throws Exception {
		for (Livros pe : livros) {
			if (pe.getGenero() == param) {
				return pe;
			}
		}
		throw new Exception("Nenhum livro encontrado para esse gênero");
	}

	public Livros BuscarPorEstado(String param) throws Exception {
		for (Livros pe : livros) {
			if (pe.getEstado() == param) {
				return pe;
			}
		}
		throw new Exception("Nenhum livro encontrado com esse estado");
	}
}
