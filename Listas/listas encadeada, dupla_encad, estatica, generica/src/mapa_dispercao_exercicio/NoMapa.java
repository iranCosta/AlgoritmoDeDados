package mapa_dispercao_exercicio;

public class NoMapa<T> {

	private int chave;
	private T info;

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		NoMapa<?> noMapa = (NoMapa<?>) obj;
		return chave == noMapa.chave;
	}

}
