package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjo.Arranjo;

class FuncoesPrincipaisTest {

	@Test
	void test() {
		Arranjo arr = new Arranjo();
		
		//assertEquals(510, arr.menor(), "O menor deve ser 510");
		
		// Valida��o da fun��o maior()
		assertEquals(940, arr.maior(arr.a), "O maior � 940");
		
		// Valida��o da fun��o soma()
		assertEquals(7540, arr.soma(), "A soma � 7040");
		
		//assertEquals(0, arr.repeticoes(3), "940 aparece 2 vezes");

		//assertEquals(1, arr.repeticoes(790), "940 aparece 2 vezes");

		//assertEquals(2, arr.repeticoes(940), "940 aparece 2 vezes");
	}

}
