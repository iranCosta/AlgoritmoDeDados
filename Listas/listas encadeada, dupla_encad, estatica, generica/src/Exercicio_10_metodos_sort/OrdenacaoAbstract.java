package Exercicio_10_metodos_sort;

public abstract class OrdenacaoAbstract<T extends Comparable<T>> {

	private T info[];

	public void ordenar() {

	}

	public void trocar(int a, int b, int[] info) {
		int temp = info[a];
		info[a] = info[b];
		info[b] = temp;
	}

	public T[] getInfo() {
		return info;
	}

	public void setInfo(T[] info) {
		this.info = info;
	}

}
