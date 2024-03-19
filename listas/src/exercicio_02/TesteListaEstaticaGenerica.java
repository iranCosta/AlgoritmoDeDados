package exercicio_02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteListaEstaticaGenerica {

	@Test
	void test() {
		ListaEstaticaGenerica<Integer> lista = new ListaEstaticaGenerica<>();

		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.inserir(25);

		//lista.exibir();

		lista.inverter();
		
		//lista.toString();
	}

}
