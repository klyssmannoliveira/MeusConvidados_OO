package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Controle.*;

class ValidadorControleBanco {
	ControleBancoEvento c = new ControleBancoEvento();

	@Test
	void testValidaData() {
		assertTrue(c.validaData("25/04/2021"));
		assertFalse(c.validaData("31/02/2021"));
		assertFalse(c.validaData("25 04 2021"));
	}

	@Test
	void testValidaHora() {
		assertTrue(c.validaHora("08:00"));
		assertFalse(c.validaHora("08"));
		assertFalse(c.validaHora("08 00"));
	}

	@Test
	void testValidaCEP() {
		assertTrue(c.validaCEP("12345-123"));
		assertFalse(c.validaCEP("12345123"));
		assertFalse(c.validaCEP("12345 123"));
	}

	@Test
	void testValidaCampo() {
		assertTrue(c.validaCampo("Alguma string"));
		assertFalse(c.validaCampo(""));
	}

	@Test
	void testValidaDouble() {
		assertTrue(c.validaDouble("2.50"));
		assertFalse(c.validaDouble("string"));
		assertFalse(c.validaDouble("-2.50"));
	}

	@Test
	void testValidaInteiro() {
		assertTrue(c.validaInteiro("2"));
		assertFalse(c.validaInteiro("string"));
		assertFalse(c.validaInteiro("-2"));
	}

	@Test
	void testValidaEmail() {
		assertTrue(c.validaEmail("pessoa@gmail.com"));
		assertFalse(c.validaEmail("@pessoa.com"));
		assertFalse(c.validaEmail("pessoa@gmail@brcom"));
	}

	@Test
	void testValidaTelefone() {
		assertTrue(c.validaTelefone("(61) 98349-0979"));
		assertFalse(c.validaTelefone("61 98349 0979"));
		assertFalse(c.validaTelefone("(61) 2555 55 55"));
	}

}
