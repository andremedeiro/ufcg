import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Agenda;

class AgendaTest {
	
	private Agenda agenda;
	
	@BeforeEach
	public void initAgenda() {
		agenda = new Agenda();
	}
	
	/**
	 * Testa criar com nome nulo
	 */
	@Test
	void TestNomeNulo() {
		try {
			agenda.cadastraContato(1, null, "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
			fail("Esperado NPE quando nome for nulo");
		} catch(NullPointerException npe) {
			
		}
	}
	
	/**
	 * Testa criar com nome vazio
	 */
	@Test
	void TestNomeVazio() {
		try {
			agenda.cadastraContato(1, "   ", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
			fail("Esperado iae quando nome for vazio.");
		} catch(IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	void TestCadastraContatoMinima() {
		agenda.cadastraContato(1, "Matheus", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertEquals(agenda.getContato(1), "\nMatheus Gaudêncio\n" + 
											" 98788-8979 (prioritário)\n" + 
											" 98788-8979 (zap)\n" + 
											" 3213-7873 (contato secundário)");
	}
	
	@Test
	void TestCadastraContatoPosicaoOcupada() {
		agenda.cadastraContato(1, "Felipe", "Paulo", "9 9612-8134", "9 9612-8134", "", 2, 2);
		assertEquals(agenda.getContato(1), "\nFelipe Paulo\n" + 
											" 9 9612-8134 (prioritário)\n" + 
											" 9 9612-8134 (zap)");
	}
	
	@Test
	void TestCadastraContatoPosicaoInvalidaAbaixo() {
		try {
			agenda.cadastraContato(0, "Felipe", "Paulo", "9 9612-8134", "9 9612-8134", "", 2, 2);
			fail("Esperado AIO quando posicao for menor que 1 ou acima de 100");
		} catch(ArrayIndexOutOfBoundsException AIO) {
			
		}
	}
	
	@Test
	void TestCadastraContatoPosicaoInvalidaAcima() {
		try {
			agenda.cadastraContato(101, "Felipe", "Paulo", "9 9612-8134", "9 9612-8134", "", 2, 2);
			fail("Esperado AIO quando posicao for menor que 1 ou acima de 100");
		} catch(ArrayIndexOutOfBoundsException AIO) {
			
		}
	}
	
	@Test
	void TestCadastraContatoMaxima() {
		agenda.cadastraContato(100, "Maria", "Flor", "+1 (595) 5555-1234", "+1 (595) 5555-1234", "", 2, 2);
		assertEquals(agenda.getContato(100), "\nMaria Flor\n" + 
											" +1 (595) 5555-1234 (prioritário)\n" + 
											" +1 (595) 5555-1234 (zap)");
	}
	
	@Test
	void TestEqualsNulo() {
		assertFalse(agenda.equals(null));
	}
	
	@Test
	void TestEqualsDiferente() {
		assertFalse(agenda.equals(1));
	}
	
	@Test
	void TestEqualsAgendaDiferente() {
		Agenda agenda1 = new Agenda();
		agenda.cadastraContato(2, "Felipe", "Paulo", "9 9612-8134", "9 9612-8134", "", 2, 2);
		agenda1.cadastraContato(1, "Matheus", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertFalse(agenda.equals(agenda1));
	}
	
	@Test
	void TestEqualsIgualVazia() {
		Agenda agenda1 = new Agenda();
		assertTrue(agenda.equals(agenda1));
	}
	
	@Test
	void TestEqualsAgendaPreenchida() {
		Agenda agenda1 = new Agenda();
		agenda.cadastraContato(1, "Matheus", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		agenda1.cadastraContato(1, "Matheus", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertTrue(agenda.equals(agenda1));
	}
	
}



