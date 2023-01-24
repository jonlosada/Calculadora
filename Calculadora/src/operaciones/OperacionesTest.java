package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacionesTest {

	@Test
	void testSumar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 6, numero2 = 3;
		int resultado = operaciones.sumar(numero1, numero2);
		assertEquals(resultado, 9);
	}

	@Test
	void testRestar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 6, numero2 = 3;
		int resultado = operaciones.restar(numero1, numero2);
		assertEquals(resultado, 3);
	}

	@Test
	void testMultiplicar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 6, numero2 = 3;
		int resultado = operaciones.multiplicar(numero1, numero2);
		assertEquals(resultado, 18);
	}

	@Test
	void testDividir() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 6, numero2 = 3;
		int resultado = operaciones.dividir(numero1, numero2);
		assertEquals(resultado, 2);
	}

	@Test
	void testResto() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 6, numero2 = 3;
		int resultado = operaciones.resto(numero1, numero2);
		assertEquals(resultado, 0);
	}

}
