package exercicio_03;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	// a
	public ListaEncadeada() {
		primeiro = null;
		// primeiro.setInfo(null); --> Perguntar qual a diferença entre esse e o de cima
	}

	// b
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
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
	public NoLista<T> buscar(T info) {
		NoLista<T> p = primeiro;

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
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

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

	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();

		lista.estaVazia();

		lista.inserir(5);
		lista.estaVazia();

		lista.toString();

	}

}
