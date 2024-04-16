package exercicio_06_fila;

public class FilaVetor<T> implements Fila<T> {

	private Object[] info;
	private int limite;
	private int tamanho;
	private int inicio;

	public void FilaVetor(int limite) {
		info = new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
	}

	@Override
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new FilaCheiaException();
		}

		int posInserir = (getInicio() + getTamanho()) % getLimite();
		info[posInserir] = valor;
		tamanho++;
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return (T) info[inicio];
	}

	@Override
	public void liberar() {
		try {
			while (estaVazia() != true) {
				retirar();
			}
		} catch (FilaVaziaException e) {

		}
	}

	public T retirar() {

		if (estaVazia()) {
			throw new FilaVaziaException();
		}

		T valor = (T) info[inicio];

		inicio = (inicio + 1) % limite;
		tamanho--;

		return valor;

	}

	public String toString() {
		String str = "";

		for (int i = 0; i < tamanho; i++) {
			if (i != 0) {
				str += ", ";

			}
			str += info[i].toString();
		}

		return str;
	}

	public void criarFilaConcatenada(FilaVetor<T> p2) {

	}

	public Object[] getInfo() {
		return info;
	}

	public void setInfo(Object[] info) {
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

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

}
