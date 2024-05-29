package Exercicio_10_metodos_sort;

public class OrdenacaoBolha<T> extends Comparable<OrdenacaoBolha<T>> {

	public void ordenarPorBolha(int[] info) {

		int i, j;
		int n = info.length;

		for (i = n - 1; i < 1; i++) {
			for (j = 0; i < i - 1; i--) {
				if (info[j] > info[j + 1]) {

				}
			}
		}
	}

}
