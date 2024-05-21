package exercicio_03;

import exercicio_07_fila.FilaLista;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;
	private NoLista<T> ultimo;

	// a
	public ListaEncadeada() {
		primeiro = null;
	}

	// b
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
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
	public NoLista<T> buscar(T info) {
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo().equals(info)) {
				return p;

			}
			p = p.getProximo();
		}

		return null;
	}

	// f
	public void retirar(T info) {
		NoLista<T> anterior = null;
		NoLista<T> atual = primeiro;

		while ((atual != null) && (!atual.getInfo().equals(info))) {
			anterior = atual;
			atual = atual.getProximo();
		}

		if (atual != null) {
			if (atual == primeiro)
				primeiro = primeiro.getProximo();
			else
				anterior.setProximo(atual.getProximo());
		}
		if (atual != null) {
			if (anterior == null)
				this.primeiro = atual.getProximo();
			else
				anterior.setProximo(atual.getProximo());
			if (atual == ultimo) {
				ultimo = anterior;
			}
		}
	}

	// g
	public int obterComprimento() {
		int compri = 0;
		NoLista<T> p = primeiro;

		while (p != null) {
			compri++;
			p = p.getProximo();
		}
		return compri;
	}

	// h
	public NoLista<T> obterNo(int idx) {
		if (idx < 0 || idx >= obterComprimento()) {
			throw new IndexOutOfBoundsException();
		}

		NoLista<T> p = primeiro;
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
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;

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
		NoLista<T> p = primeiro;

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
		NoLista<T> novo = new NoLista();
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
