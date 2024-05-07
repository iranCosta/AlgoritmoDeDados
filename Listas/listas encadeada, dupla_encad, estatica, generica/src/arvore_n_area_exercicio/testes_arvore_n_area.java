package arvore_n_area_exercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testes_arvore_n_area {

	private Arvore<Integer> arvore;

//	@BeforeEach
//	void setUp() {
//		arvore = new Arvore<>();
//		criarArvore();
//	}

	@Test
	void testToString() {
		assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>>", arvore.toString());
	}

//	private void criarArvore() {
//
//	}
}
