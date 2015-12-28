package test;

import org.junit.Assert;
import org.junit.Test;

import code.EscribirNumeros;

public class TestPrintNumeros {

	private EscribirNumeros escribirNumeros = new EscribirNumeros();
	
	@Test
	public void testPrintNumero1(){
		System.out.println("|"+escribirNumeros.escribeNumeros(1)+"|");
		Assert.assertTrue("FizzBuzz".equals(escribirNumeros.escribeNumeros(1)));
	}

	@Test
	public void testPrintNumero2(){
		System.out.println(escribirNumeros.escribeNumeros(2));
		Assert.assertTrue("FizzBuzz,1".equals(escribirNumeros.escribeNumeros(2)));
	}
	
	@Test
	public void testPrintNumero3(){
		System.out.println(escribirNumeros.escribeNumeros(3));
		Assert.assertTrue("FizzBuzz,1,Dos".equals(escribirNumeros.escribeNumeros(3)));
	}

	@Test
	public void testPrintNumero4(){
		System.out.println(escribirNumeros.escribeNumeros(4));
		Assert.assertTrue("FizzBuzz,1,Dos,Fizz".equals(escribirNumeros.escribeNumeros(4)));
	}
}
