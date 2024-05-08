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
			while (true) {
				retirar();
			}
		} catch (FilaVaziaException e) {

		}
	}

	public T retirar() {

		if (estaVazia()) {
			throw new FilaVaziaException();
		}

		T valor = peek();
		info[inicio] = null;

		inicio = (inicio + 1) % limite;
		tamanho--;

		return valor;

	}

	public String toString() {
		String str = "";

		for (int i = 0; i < tamanho; i++) {
			if (str == null) {
				return "nada";
			}

			if (i > 0) {
				str += ", ";
			}
			str = str + info[i];
			i = (i + 1) % limite;
		}
		return str;
	}

	public void criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>();

		int indice = this.inicio;
		for (int i = 0; i < this.tamanho; i++) {
			f3.inserir((T) this.info[indice]);
			indice = (indice + 1) % this.limite;
		}

		indice = f2.inicio;
		for (int i = 0; i < f2.tamanho; i++) {
			f3.inserir((T) f2.info[indice]);
			indice = (indice + 1) % f2.limite;
		}

	}

	public void encolher() {
		if (tamanho != limite) {
			setLimite(tamanho);
		}
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
