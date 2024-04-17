package exercicio_06_fila;

public interface Fila<T> {

	public void inserir(T valor);

	public boolean estaVazia();

	T peek();
	
	T retirar();

	public void liberar();

}
