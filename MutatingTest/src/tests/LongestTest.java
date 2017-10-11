package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Longest;
import mainPackage.VetorOrdenado;

public class LongestTest {
	
	private Longest bin, binAux;

	@Before
	public void init(){
		bin = new Longest();
		binAux = new Longest();
		
	}
	
	@Test
	public void testGetBinaryValido() {
		assertEquals("1010", bin.getBinary(10));
	}
	
	@Test
	public void testGetBinaryInvalidoZero() {
		assertEquals("erro", bin.getBinary(0));
	}
	
	@Test
	public void testGetBinaryInvalidoNegativo() {
		assertEquals("erro", bin.getBinary(-1));
	}
	
	@Test
	public void testGetLengthLongSeqsSemZero() {
		assertEquals(0, binAux.getLengthLongSeq("1111"));
	}
	
	@Test
	public void testGetLengthLongSeqSemUmFinal() {
		assertEquals(0, binAux.getLengthLongSeq("1000"));
	}
	
	@Test
	public void testGetLengthLongValido() {
		assertEquals(2, binAux.getLengthLongSeq("1001"));
	}
	
	@Test
	public void testGetLengthLongInvalido() {
		assertEquals(-1, binAux.getLengthLongSeq("2871"));
	}
	
	@Test
	public void testGetLengthInvalidoZero() {
		assertEquals(-1, binAux.getLengthLongSeq("0"));
	}
}
