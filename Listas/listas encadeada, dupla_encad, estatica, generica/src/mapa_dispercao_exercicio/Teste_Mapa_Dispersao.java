package mapa_dispercao_exercicio;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Teste_Mapa_Dispersao {

	MapaDispersao<Aluno> map = new MapaDispersao<Aluno>(53);

	@Test
	void test1() {
		Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, 01, 01));

		map.equals(obj1);

		map.buscar(12000).toString();
	}

}
