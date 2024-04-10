package exercicio_06_fila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste_Fila {

	FilaVetor<Integer> fila = new FilaVetor<Integer>();

	@Test
	void test1() {
		assertTrue(fila.estaVazia());

//		fila.inserir(1);
//		assertFalse(fila.estaVazia());
	}

}
