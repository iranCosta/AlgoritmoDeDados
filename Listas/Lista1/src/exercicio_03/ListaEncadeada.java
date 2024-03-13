package exercicio_03;

public class ListaEncadeada<T> {

	private NoLista primeiro;

	// a
	public ListaEncadeada() {
		primeiro = null;
		// primeiro.setInfo(null); --> Perguntar qual a diferença entre esse e o de cima
	}

	// b
	public NoLista getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		NoLista novo = new NoLista();
		novo.setInfo(info);
		novo.setProximo(primeiro);
		this.primeiro = novo;
	}

	// d
	public boolean estaVazia() {

		if (primeiro == null) {
			return true;
		}

		return false;
	}

	// e
	public NoLista buscar(T info) {
		NoLista p = primeiro;

		while (p != null) {
			if (p.getInfo() == info) {
				return p;
			}
			p = p.getProximo();
		}

		return null;
	}

	// f
	public void retirar(T info) {
		NoLista anterior = null;
		NoLista p = primeiro;

		while (p != null && p.getInfo() != info) {
			anterior = p;
			p.setProximo(p);
		}

		if (p != null) {
			if (p != primeiro) {
				this.primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
	}

	// g
	public int obterComprimento() {

	}

	// h
	public NoLista obterNo() {

	}

	// i
	public String toString() {

	}

}
