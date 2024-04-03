package exercicio_04;

import exercicio_03.NoLista;

public class ListaDupla<T> {

	private NoListaDupla<T> primeiro;

	public ListaDupla() {
		primeiro = null;
	}

	public void inserir(T valor) {
		NoListaDupla<T> novo = new NoListaDupla<T>();
		novo.setInfo(valor);
		novo.setProximo(primeiro);
		novo.setAnterior(null);

		if (primeiro != null) {
			primeiro.setAnterior(novo);
		}
		primeiro.setAnterior(novo);
	}

	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = getPrimeiro();

		while (p != null) {
			if (p.getInfo().equals(valor)) {
				return p;
			} else {
				p = p.getProximo();

			}
		}

		return null;
	}

	public void retirar(T valor) {
		NoListaDupla<T> p = buscar(valor);

		if (p != null) {
			NoListaDupla<T> proximo = p.getProximo();
			NoListaDupla<T> anterior = p.getAnterior();

			if (p.equals(primeiro)) {
				setPrimeiro(proximo);
			} else {
				anterior.setProximo(proximo);
			}

			if (proximo != null) {
				proximo.setAnterior(anterior);
			}
		}

	}

	// outra opção
//	public void exibirOrdemInversa() {
//		NoLista<T> p = obterUltimo();
//		
//		while (p != null) {
//			System.out.println(p.getInfo().toString());
//			p = p.getAnterior();
//		}
//	}

//	private NoListaDupla<T> obterUltimo() {
//		NoListaDupla<T> ultimo = primeiro;
//		
//		NoListaDupla<T> p = primeiro;
//		
//		while(p != null) {
//			ultimo = p;
//		}
//		
//		return ultimo;
//	}

	public void exibirOrdemInversa() {
		NoListaDupla<T> p = getPrimeiro();

		while (p.getProximo() != null) {
			p = p.getProximo();
		}

		while (p != null) {
			System.out.println(p.getInfo().toString());
			p = p.getAnterior();
		}

	}

	public void liberar() {
		NoListaDupla<T> p = getPrimeiro();

		while (p != (null)) {
			NoListaDupla<T> proximo = p.getProximo();

			p.setInfo(null);
			p.setAnterior(null);
			p.setProximo(null);

			p = proximo;
		}

	}

	public String toString() {
		NoListaDupla<T> p = getPrimeiro();

		String str = "";

		while (p != null) {
			if (p != primeiro) {
				str += ", ";

			}

			str += p.getInfo().toString();
			p = p.getProximo();
		}

		return str;
	}

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoListaDupla<T> primeiro) {
		this.primeiro = primeiro;
	}
}
