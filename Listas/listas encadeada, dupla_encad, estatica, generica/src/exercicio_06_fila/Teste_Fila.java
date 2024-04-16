package exercicio_06_fila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste_Fila {

	FilaVetor<Integer> fila = new FilaVetor<Integer>();

//	@Test
//	void test1() {
//		assertTrue(fila.estaVazia());
//	}

//	@Test
//	void test2() {
//		fila.FilaVetor(5);
//		assertTrue(fila.estaVazia());
//
//		fila.inserir(10);
//
//		assertFalse(fila.estaVazia());
//	}

	@Test
	void test3() {
		fila.FilaVetor(10);

		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);

		fila.retirar();
//		fila.retirar();

		System.out.println(fila.toString());
		// assertTrue(fila.estaVazia());
	}

}
