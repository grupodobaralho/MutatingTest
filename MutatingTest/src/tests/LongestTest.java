package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Longest;

public class LongestTest {
	
	private Longest bin, binAux;

	@Before
	public void init(){
		bin = new Longest();
		binAux = new Longest();
		
	}
	
	@Test
	public void testGetBinaryValido() {
		assertEquals("1010", Longest.getBinary(10));
	}
	
	@Test
	public void testGetBinaryInvalidoZero() {
		assertEquals("erro", Longest.getBinary(0));
	}
	
	@Test
	public void testGetBinaryInvalidoNegativo() {
		assertEquals("erro", Longest.getBinary(-1));
	}
	
	@Test
	public void testGetLengthLongSeqsSemZero() {
		assertEquals(0, Longest.getLengthLongSeq("1111"));
	}
	
	@Test
	public void testGetLengthLongSeqSemUmFinal() {
		assertEquals(0, Longest.getLengthLongSeq("1000"));
	}
	
	@Test
	public void testGetLengthLongValido() {
		assertEquals(2, Longest.getLengthLongSeq("1001"));
	}
	
	@Test
	public void testGetLengthLongInvalido() {
		assertEquals(-1, Longest.getLengthLongSeq("2871"));
	}
	
	@Test
	public void testGetLengthLongVazio() {
		assertEquals(-1, Longest.getLengthLongSeq(""));
	}
	
	@Test
	public void testGetLengthInvalidoZero() {
		assertEquals(-1, Longest.getLengthLongSeq("0"));
	}

}
