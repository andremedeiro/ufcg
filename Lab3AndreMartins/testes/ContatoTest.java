import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Contato;

class ContatoTest {
	
	/**
	 * Contato, vai apontar para o Contato padrão na memória
	 */
	private Contato contato;
	
	/**
	 * Inicia um Contato Padrão
	 */
	@BeforeEach
	public void initContato() {
		contato = new Contato(1, "Matheus", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
	}
	
	/**
	 * Testacom nome nulo
	 */
	@Test
	void TestNomeNulo() {
		try {
			new Contato(1, null, "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
			fail("Esperado NPE quando nome for nulo");
		} catch(NullPointerException npe) {
			
		}
	}
	
	/**
	 * Testa  com nome vazio
	 */
	@Test
	void TestNomeVazio() {
		try {
			new Contato(1, "   ", "Gaudêncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
			fail("Esperado iae quando nome for vazio.");
		} catch(IllegalArgumentException iae) {
			
		}
	}
	
	/**
	 * Testa contatos iguais 
	 */
	@Test
	void TestEquals() {
		Contato novoContato = new Contato (100, "Matheus", "Gaudêncio", "(83) 9 96128134", "(83) 9 96128134", "", 2, 2);
		assertTrue(contato.equals(novoContato));
	}
	
	/**
	 * Testa contatos não iguais
	 */
	@Test
	void TestNotEquals() {
		Contato novoContato = new Contato (2, "matheus", "gaudencio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertFalse(contato.equals(novoContato));
	}
	
	/**
	 * Teste contato vazio com contato não vazio
	 */
	@Test
	void TestNotEqualsNull() {
		Contato novoContato = null;
		assertFalse(contato.equals(novoContato));
	}
	
	/**
	 * Testa com classes diferentes
	 */
	@Test
	void TestNotEqualsDiferent() {
		String novoContato = "Matheus Gaudêncio";
		assertFalse(contato.equals(novoContato));
	}
	
	/**
	 * Teste hashCodes iguais
	 */
	@Test
	void TestHashCodeIgual() {
		Contato novoContato = new Contato (100, "Matheus", "Gaudêncio", "(83) 9 96128134", "(83) 9 96128134", "", 2, 2);
		assertEquals(contato.hashCode(), novoContato.hashCode());
	}
	
	/**
	 * Testa hashCodes diferentes
	 */
	@Test
	void TestHashCodeDiferentes() {
		Contato novoContato = new Contato (2, "matheus", "gaudencio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertNotEquals(contato.hashCode(), novoContato.hashCode());
	}
	
	/**
	 * Teste exibir
	 */
	@Test
	void TestExibir() {
		assertEquals("\nMatheus Gaudêncio\n" + 
				" 98788-8979 (prioritário)\n" + 
				" 98788-8979 (zap)\n" + 
				" 3213-7873 (contato secundário)", contato.exibir());
	}
	
	/**
	 * Teste exibir com contato secundário vazio
	 */
	@Test
	void TestExibirSecudarioVazio() {
		Contato novoContato = new Contato (2, "matheus", "gaudencio", "98788-8979", "3213-2131", "", 1, 1);
		assertEquals("\nmatheus gaudencio\n" + 
				" 98788-8979 (prioritário)\n" + 
				" 98788-8979 (zap)", novoContato.exibir());
	}
	
	/**
	 * Teste toString
	 */
	@Test
	void TestToString() {
		assertEquals("1 - Matheus Gaudêncio", contato.toString());
	}
	
	/**
	 * Testa Método prioritário 
	 */
	@Test
	void TestPrioritatio() {
		assertEquals("Matheus Gaudêncio - 98788-8979", contato.prioritario());
	}
	
	/**
	 * Testa Método zap
	 */
	@Test
	void TestZap() {
		assertEquals("Matheus Gaudêncio - 98788-8979", contato.zap());
	}

}
