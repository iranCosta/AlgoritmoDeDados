package arvore_n_area_exercicio;

public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public String toString() {
		if (raiz == null)
			return "";
		else
			return obterRepresentacaoTextual(raiz);
	}

	private String obterRepresentacaoTextual(NoArvore<T> no) {
		String s = "<";
		s += no.getInfo();

		NoArvore<T> p = no.getPrimeiro();

		while (p != null) {
			s += obterRepresentacaoTextual(p);
			p.setProximo(p);
		}
		s += ">";
		return s;
	}

	public boolean pertence(T info) {
		if (raiz == null)
			return false;
		else
			return pertence(raiz, info);
	}

	private boolean pertence(NoArvore<T> no, T info) {
		if (no.getInfo() == info) {
			return true;
		} else {
			NoArvore<T> p;
			p = no.getPrimeiro();

			while (p != null) {
				if (pertence(p, info)) {
					return true;
				}
				p.setProximo(p);
			}
			return false;
		}
	}

	private int ContarNos(NoArvore<T> no) {
		int i = 0;

		NoArvore<T> p = no.getPrimeiro();

		while (p != null) {
			i += ContarNos(p);
			p = p.getProximo();
		}

		return i + 1;
	}

	public int ContarNos() {
		if (getRaiz() == null) {
			return 0;
		}
		return ContarNos(getRaiz());
	}
}
