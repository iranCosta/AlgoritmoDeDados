package exercicio_07_fila;

import exercicio_03.NoLista;

public class ListaEncadeada<T> {

	private FilaLista<T> primeiro;
	private FilaLista<T> ultimo;

	// a
	public ListaEncadeada() {
		primeiro = null;
	}

	// b
	public FilaLista<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		FilaLista<T> novo = new FilaLista<T>();
		novo.setInfo(info);
		novo.setProximo(primeiro);
		primeiro = novo;
	}

	// d
	public boolean estaVazia() {

		if (primeiro == null) {
			return true;
		}
		return false;
	}

	// e
	public FilaLista<T> buscar(T info) {
		FilaLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo().equals(info)) {
				return p;

			}
			p = p.getProximo();
		}

		return null;
	}

	// f
	public void retirar(T valor) {
		FilaLista<T> p = primeiro;
		FilaLista<T> anterior = null;

		if (p.equals(primeiro)) {
			p.setInfo(valor);
		} else {
			anterior.setProximo(anterior);
		}

		if (p.getProximo() != null) {
			anterior = p;
		}
	}

	// g
	public int obterComprimento() {
		int compri = 0;
		FilaLista<T> p = primeiro;

		while (p != null) {
			compri++;
			p = p.getProximo();
		}
		return compri;
	}

	// h
	public FilaLista<T> obterNo(int idx) {
		if (idx < 0 || idx >= obterComprimento()) {
			throw new IndexOutOfBoundsException();
		}

		FilaLista<T> p = primeiro;
		for (int i = 0; i < idx; i++) {
			p = p.getProximo();
		}
		return p;
	}

	/*
	 * public NoLista<T> obterNo(int idx) { if(idx < 0) { throw new
	 * IndexOutOfBounds(); }
	 * 
	 * NoLista<T> p = getPrimeiro(); while(p!= null) && (idx > 0) { idx--; p=
	 * p.getProximo(); }
	 * 
	 * if(p == null) { throw new IndexOutOfBoundsException(); } return p; }
	 * 
	 */

	public void retirarTodos(T valor) {
		FilaLista<T> p = primeiro;
		FilaLista<T> anterior = null;

		while ((p != null) && !p.getInfo().equals(valor)) {
			anterior = p;
			p.setProximo(p);
		}

		if (p != null) {
			if (p != primeiro) {
				this.primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		} else {
			anterior = p;
		}

		p = p.getProximo();

	}

	// i
	public String toString() {
		String result = "[";
		FilaLista<T> p = primeiro;

		while (p != null) {
			result += p.getInfo().toString(); // Concatena o valor do nó à string resultante
			if (p.getProximo() != null) {
				result += ", "; // Adiciona uma vírgula e um espaço se não for o último elemento
			}
			p = p.getProximo();
		}

		result += "]";
		return result;
	}

	public void inserirNoFinal(T valor) {
		FilaLista<T> novo = new FilaLista();
		novo.setInfo(valor);
		novo.setProximo(null);

		if (estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProximo(novo);
		}
		ultimo = novo;
	}

}
