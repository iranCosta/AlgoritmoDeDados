package pilha;

import exercicio_03.NoLista;

public class PilhaVetor<T> implements Pilha<T> {

	private T info[];
	private int limite;
	private int tamanho;

	public PilhaVetor(int limite) {
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
	}

	@Override
	public void push(int v) {
		if (limite == tamanho) {
			throw new PilhaCheiaException("Capacidade esgotada da pilha");
		}

	}

	@Override
	public int pop() {
		int valor;
		valor = peek();

		tamanho++;
		return valor;
	}

	@Override
	public int peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException("Pilha esta vazia");
		}
		return 0;
	}

	@Override
	public boolean estaVazia() {
		return estaVazia() == true ? true : false;
	}

	@Override
	public void liberar() {

		while (estaVazia() != true) {
			pop();
		}

	}

//	public String toString() {
//
//	}

	public void concatenar(PilhaVetor<T> p) {

	}

	public T[] getInfo() {
		return info;
	}

	public void setInfo(T[] info) {
		this.info = info;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public static void main(String[] args) {

		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);

		pilha.push(5);
		pilha.push(10);
		pilha.push(15);
		pilha.push(20);
		pilha.push(25);

		//pilha.liberar();

		pilha.peek();
	}

}
