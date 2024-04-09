package pilha;

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
	public void push(T valor) {
		if (tamanho == limite) {
			throw new PilhaCheiaException();
		}

		info[tamanho] = valor;
		tamanho++;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return info[tamanho - 1];
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public T pop() {
		T valor;
		valor = peek();

		info[tamanho - 1] = null;

		tamanho--;
		return valor;
	}

	@Override
	public void liberar() {
		try {
			while (true) {
				pop();
			}
		} catch (PilhaVaziaException e) {

		}
	}

	public String toString() {
		String str = "";

		for (int i = 0; i < getTamanho(); i++) {
			if (i != 0) {
				str += ", ";

			}
			str += getInfo()[i].toString();
		}

		return str;
	}

	public void concatenar(PilhaVetor<T> p) {

		if (p.getTamanho() + getTamanho() > limite) {
			throw new RuntimeException("N�o h� espa�o pra empilhar todos os dados");
		}

		for (int i = 0; i < p.getTamanho(); i++) {
			this.push((T) p.info[i]);
		}
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

}
