package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Longest;
import mainPackage.VetorOrdenado;

public class VetorOrdenadoTest {

	VetorOrdenado vet;
	
	@Before
	public void init(){
		vet = new VetorOrdenado(5);
		
	}
	
	@Test
	public void testConstrutorTamMenor0() {
		vet = new VetorOrdenado(-1);
		assertEquals(vet.getTamanho(), 1);
	}
	
	@Test
	public void testConstrutorTam0() {
		vet = new VetorOrdenado(0);
		assertEquals(vet.getTamanho(), 1);
	}
	
	@Test
	public void testConstrutorTamMaior0() {
		vet = new VetorOrdenado(5);
		assertEquals(vet.getTamanho(), 5);
	}
	
	@Test
	public void testIns() {
		assertTrue(vet.ins(-1));	
		assertTrue(vet.ins(0));	
		assertTrue(vet.ins(1));	
		assertTrue(vet.ins(2));
	}
	
	@Test
	public void testInsCheio() {
		assertTrue(vet.ins(1));	
		assertTrue(vet.ins(1));	
		assertTrue(vet.ins(1));	
		assertTrue(vet.ins(1));	
		assertTrue(vet.ins(1));	
		assertFalse(vet.ins(1));	
	}
	
	@Test
	public void testGetNroElemVazio() {
		assertEquals(0,vet.getNroElem());	
	}
	
	@Test
	public void testGetNroElemPos() {
		vet.ins(1);
		assertEquals(1,vet.getNroElem());	
	}
	
	@Test
	public void testGetValido() {
		vet.ins(1);
		vet.ins(2);
		vet.ins(3);
		assertEquals(3 ,vet.get(2));	
		assertEquals(1 ,vet.get(0));	
	}
	
	@Test
	public void testGetInvalido() {
		vet.ins(1);
		vet.ins(2);
		vet.ins(3);
		assertEquals(0 , vet.get(6));	
		assertEquals(1 , vet.get(-1));	
	}
	

}
