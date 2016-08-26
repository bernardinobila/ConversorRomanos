package br.com.caelum.conversor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConversorTest {

	Conversor cv;
	
	@Before
	public void incio(){
		cv = new Conversor();
	}


	@Test
	public void deveRotornarValoresDaEsquerdaMenores() {
		String txt= "XXD";
		int m= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",500,m);
	}
	
		
	@Test
	public void deveRotornarValoresDaEsquerdaMaior() {
		String txt= "CLX";
		int m= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",160,m);
	}
	
	@Test
	public void deveRotornarValoresDaDireitaAEquerdaIguais() {
		String txt= "XLX";
		int d= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",50,d);
	}
	
	
	@After
	public void fim(){
		
	}

}
