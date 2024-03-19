package exercicio_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteListEncadeada {

	ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//	@Test
//	void test1() {
//		assertTrue(lista.estaVazia()); // Verifica se a lista está vazia
//		System.out.println("Teste 1 - Lista esta vazia: " + lista.estaVazia());
//	}
//
//	@Test
//	void test2() {
//		lista.inserir(5);
//		assertFalse(lista.estaVazia()); // Verifica se a lista não está vazia após inserir um elemento
//		System.out.println("Teste 2 - Lista nao esta vazia apos inserir um elemento: " + lista.estaVazia());
//	}
//
//	@Test
//	void test3() {
//		lista.inserir(5);
//
//		NoLista<Integer> listaRef = lista.obterNo(0);
//
//		assertEquals(5, listaRef.getInfo());// Verifica se o nó contém 5
//		System.out.println("valores armazenados: " + listaRef.getInfo());
//	}

	void test4() {

		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);

		// Verificando o primeiro nó
		NoLista<Integer> primeiroNo = lista.obterNo(0);
		assertEquals(15, primeiroNo.getInfo()); // Verifica se o nó contém o valor 15
		System.out.println("valores: " + primeiroNo.getInfo());
		// Verificando o segundo nó
		NoLista<Integer> segundoNo = lista.obterNo(1);
		assertEquals(10, segundoNo.getInfo()); // Verifica se o nó contém o valor 10
		System.out.println("valores: " + segundoNo.getInfo());
		// Verificando o terceiro nó
		NoLista<Integer> terceiroNo = lista.obterNo(2);
		assertEquals(5, terceiroNo.getInfo()); // Verifica se o nó contém o valor 5
		System.out.println("valores: " + terceiroNo.getInfo());
		assertFalse(lista.estaVazia()); // Verifica se a lista não está vazia
		assertEquals(3, lista.obterComprimento()); // Verifica se a lista tem tamanho 3
		System.out.println("valores: " + lista.obterComprimento());
	}

}
