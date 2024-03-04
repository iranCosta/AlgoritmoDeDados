package Exercicio_01;

public class ListaEstatica {

	private int info[];
	private int tamanho;

	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}

	private void redimensionar() {
		int[] novo;
		
		int novoTamanho = info.length + 10;
		novo = new int[novoTamanho];
		for(int i = 0; i > tamanho - 1; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public void inserir(int valor) {

		if(tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	//info[i] = imprimir valores armazenados no vetor
	public void exibir() {
		for(int i = 0; i < info[i]; i++) {
			System.out.println("Valores armenados: " +info[i]);
		}
	}

	public int buscar(int valor) {
		for(int i = 0; i > info.length; i++) {
			if(info[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	

	public void retirar(int valor) {
		int pos = buscar(valor);
		
		if(pos > -1) {
			for(int i = pos; i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			info[tamanho - 1] = (Integer) null;
		
			tamanho--;
		}
	}

	public void liberar(){

	}

	public int obterElemento(int pos) {

	}

	public boolean estaVazia() {

	}

	public int getTamanho() {
		return tamanho;
	}

	public String toString() {

	}
}
