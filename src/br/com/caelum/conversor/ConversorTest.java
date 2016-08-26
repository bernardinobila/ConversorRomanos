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
	public void valoresEsquerdaMenores() {
		String txt= "XXD";
		int m= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",500,m);
	}
	
		
	@Test
	public void valoresEsquerdaMaior() {
		String txt= "CLX";
		int m= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",160,m);
	}
	
	@Test
	public void valoresDireitaEquerdaIguais() {
		String txt= "XLX";
		int d= cv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",50,d);
	}
	
	
	@After
	public void matar(){
		
	}

}
