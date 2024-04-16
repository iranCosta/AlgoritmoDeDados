package exercicio_07_fila;

import exercicio_03.NoLista;

public class FilaLista<T> {

	private T info;

	FilaLista<T> primeiro;

	private FilaLista<T> proximo;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public FilaLista<T> getProximo() {
		return proximo;
	}

	public void setProximo(FilaLista<T> proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		String result = "[";
		FilaLista<T> p = primeiro;

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

}
