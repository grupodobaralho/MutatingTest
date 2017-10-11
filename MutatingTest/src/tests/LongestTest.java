package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Longest;
import mainPackage.VetorOrdenado;

public class LongestTest {
	
	private Longest bin;

	@Before
	public void init(){
		bin = new Longest();
		
	}
	
	@Test
	public void testGetBinaryValido() {
		assertEquals("111", bin.getBinary(7));
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
	public void testGetLengthLongSeqsZero() {
		assertEquals(0, bin.getLengthLongSeq("1111"));
	}
	
	@Test
	public void testGetLengthLongSeqZero2() {
		assertEquals(0, bin.getLengthLongSeq("1000"));
	}
	
	@Test
	public void testGetLengthLongValido() {
		assertEquals(2, bin.getLengthLongSeq("1001"));
	}



}
