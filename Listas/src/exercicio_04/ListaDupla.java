package exercicio_04;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.NoopCharAppender;

public class ListaDupla<T> {

	private NoListaDupla<T> primeiro;

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}

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
		primeiro = novo;
	}

	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = new NoListaDupla<T>();

		while (p == valor) {
			return p;
		}

		return null;
	}

	public void retirar(T valor) {

		NoListaDupla<T> p = buscar(valor);

		if (p != null) {
			if (primeiro == p) {
				primeiro = p.getProximo();
			} else {
				p.getAnterior().setProximo(p.getProximo());
			}

			if (p.getProximo() != null) {
				p.getProximo().setAnterior(p.getAnterior());
			}
		}

	}

	public void exibirOrdemInversa() {
		NoListaDupla<T> p = primeiro;

		while (p != null) {
			p.getProximo().setAnterior(p);
			System.out.println("não foi " +p.getProximo().getInfo());
			while (p.getProximo() == null) {
				System.out.println("Lista: " + p.getProximo() + " " + p.getAnterior());
			}
		}
	}

	public void liberar() {

	}

//	public String toString() {
//
//	}

	public static void main(String[] args) {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();

		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);

		lista.exibirOrdemInversa();
	}
}
