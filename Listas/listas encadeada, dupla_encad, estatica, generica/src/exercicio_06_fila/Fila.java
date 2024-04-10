package exercicio_06_fila;

public interface Fila<T> {

	public void inserir(T valor);

	public boolean estaVazia();

	public T peek();

	public void liberar();

}
