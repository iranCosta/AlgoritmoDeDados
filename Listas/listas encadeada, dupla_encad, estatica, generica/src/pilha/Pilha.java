package pilha;

public interface Pilha<T> {

	void push(int v);

	int pop();

	int peek();

	boolean estaVazia();

	void liberar();
}
