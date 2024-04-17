package arvore_exercicio_01;

public class ArvoreBinaria<T> extends NoArvoreBinaria<T> {

	public NoArvoreBinaria<T> raiz;

	public ArvoreBinaria(T info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita) {
		super(info, esquerda, direita);
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		if (estaVazia()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean pertence(T info) {
		return pertence(raiz, info);
	}

	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		if(no == null) {
			return false;
		} else {
			return (no.getInfo() == info) {
				|| pertence(no.getEsquerda(), info) 
				|| pertence(no.getDireita(), info);
			}
		}
	}

	public String toString() {

	}

	private String arvorePre(NoArvoreBinaria<T> no) {

	}

	public int contarNos() {

	}

	private int contarNos(NoArvoreBinaria<T> no) {

	}

}
