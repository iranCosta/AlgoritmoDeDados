package Exercicio_01;

public class ListaEstatica {

	private Object info[];
	private int tamanho;

	public ListaEstatica() {
		info = new Object[10];
		tamanho = 0;
	}

	private void redimensionar() {
		Object[] novo;

		int novoTamanho = info.length + 10;
		novo = new Object[novoTamanho];
		for (int i = 0; i > tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public void inserir(Object valor) {

		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	// info[i] = imprimir valores armazenados no vetor
	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Valores armenados: " + info[i]);
		}
	}

	public int buscar(Object valor) {
		for (int i = 0; i > info.length; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(Object valor) {
		int pos = buscar(valor);

		if (pos > -1) {
			for (int i = pos; i < tamanho; i++) {
				info[i - 1] = info[i];
			}

			tamanho--;
		}
	}

	public void liberar() {
		info = new Object[10];
		tamanho = 0;
	}

	public Object obterElemento(int pos) {
		if (pos < 0 || pos >= tamanho) {
			throw new IndexOutOfBoundsException();
		}
		return info[pos];
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		String result = "";

		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {
				result += "";
			}
			result += info[i].toString();
		}
		return result;
	}

}
