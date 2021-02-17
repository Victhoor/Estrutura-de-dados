package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjo.Arranjo;

class FuncoesPrincipaisTest {

	@Test
	void test() {
		Arranjo arr = new Arranjo();
		
		//assertEquals(510, arr.menor(), "O menor deve ser 510");
		
		// Validação da função maior()
		assertEquals(940, arr.maior(arr.a), "O maior é 940");
		
		// Validação da função soma()
		assertEquals(7540, arr.soma(), "A soma é 7040");
		
		//assertEquals(0, arr.repeticoes(3), "940 aparece 2 vezes");

		//assertEquals(1, arr.repeticoes(790), "940 aparece 2 vezes");

		//assertEquals(2, arr.repeticoes(940), "940 aparece 2 vezes");
	}

}
