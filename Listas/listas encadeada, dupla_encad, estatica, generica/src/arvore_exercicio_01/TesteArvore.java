package arvore_exercicio_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteArvore {

	NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
	NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);

	NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
	NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
	NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);

	ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
	
//	@Test
//	void test1() {
//		assertEquals(true, raiz.estaVazia());
//	}
//
//	@Test
//	void test2() {
//		assertEquals(false, raiz.estaVazia());
//	}

	@Test
	void test3() {

	}

}
