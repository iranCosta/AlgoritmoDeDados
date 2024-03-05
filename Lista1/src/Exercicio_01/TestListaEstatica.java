package Exercicio_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestListaEstatica {

	public void testToString() {

		ListaEstatica lista = new ListaEstatica();

        // Adicionando os dados 5, 10, 15 e 20 à lista
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        // Imprimindo a lista utilizando o método toString()
        System.out.println(lista.toString());
	}
}
