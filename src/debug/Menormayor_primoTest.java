package debug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class menormayor_primoTest {

	@Test
	public void test() {

		int numero = 12;
		int resultado[] = new int[] { 5, 7, 11 };

		int primos[] = Menormayor_primo.primos(numero);
		assertArrayEquals(resultado, primos);
	}

	@Test
	public void testMayorMenor() {
		int resultado[] = Menormayor_primo.mayorMenor(3, 2, 1); 
		int resultado2[] = Menormayor_primo.mayorMenor(1, 2, 3);
		int esperado[] = new int[] { 3, 1 };

		assertArrayEquals(resultado, esperado);
		assertArrayEquals(resultado2, esperado);
	}

}
