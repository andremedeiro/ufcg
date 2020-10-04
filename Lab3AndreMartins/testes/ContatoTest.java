import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Contato;

class ContatoTest {
	
	/**
	 * Contato, vai apontar para o Contato padr�o na mem�ria
	 */
	private Contato contato;
	
	/**
	 * Inicia um Contato Padr�o
	 */
	@BeforeEach
	public void initContato() {
		contato = new Contato(1, "Matheus", "Gaud�ncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
	}
	
	/**
	 * Testacom nome nulo
	 */
	@Test
	void TestNomeNulo() {
		try {
			new Contato(1, null, "Gaud�ncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
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
			new Contato(1, "   ", "Gaud�ncio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
			fail("Esperado iae quando nome for vazio.");
		} catch(IllegalArgumentException iae) {
			
		}
	}
	
	/**
	 * Testa contatos iguais 
	 */
	@Test
	void TestEquals() {
		Contato novoContato = new Contato (100, "Matheus", "Gaud�ncio", "(83) 9 96128134", "(83) 9 96128134", "", 2, 2);
		assertTrue(contato.equals(novoContato));
	}
	
	/**
	 * Testa contatos n�o iguais
	 */
	@Test
	void TestNotEquals() {
		Contato novoContato = new Contato (2, "matheus", "gaudencio", "98788-8979", "3213-2131", "3213-7873", 1, 1);
		assertFalse(contato.equals(novoContato));
	}
	
	/**
	 * Teste contato vazio com contato n�o vazio
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
		String novoContato = "Matheus Gaud�ncio";
		assertFalse(contato.equals(novoContato));
	}
	
	/**
	 * Teste hashCodes iguais
	 */
	@Test
	void TestHashCodeIgual() {
		Contato novoContato = new Contato (100, "Matheus", "Gaud�ncio", "(83) 9 96128134", "(83) 9 96128134", "", 2, 2);
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
		assertEquals("\nMatheus Gaud�ncio\n" + 
				" 98788-8979 (priorit�rio)\n" + 
				" 98788-8979 (zap)\n" + 
				" 3213-7873 (contato secund�rio)", contato.exibir());
	}
	
	/**
	 * Teste exibir com contato secund�rio vazio
	 */
	@Test
	void TestExibirSecudarioVazio() {
		Contato novoContato = new Contato (2, "matheus", "gaudencio", "98788-8979", "3213-2131", "", 1, 1);
		assertEquals("\nmatheus gaudencio\n" + 
				" 98788-8979 (priorit�rio)\n" + 
				" 98788-8979 (zap)", novoContato.exibir());
	}
	
	/**
	 * Teste toString
	 */
	@Test
	void TestToString() {
		assertEquals("1 - Matheus Gaud�ncio", contato.toString());
	}
	
	/**
	 * Testa M�todo priorit�rio 
	 */
	@Test
	void TestPrioritatio() {
		assertEquals("Matheus Gaud�ncio - 98788-8979", contato.prioritario());
	}
	
	/**
	 * Testa M�todo zap
	 */
	@Test
	void TestZap() {
		assertEquals("Matheus Gaud�ncio - 98788-8979", contato.zap());
	}

}
