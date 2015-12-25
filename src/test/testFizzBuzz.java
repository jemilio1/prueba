package test;

import org.junit.Assert;
import org.junit.Test;

import code.EscribirNumeros;

public class testFizzBuzz {

	private EscribirNumeros escribirNumeros = new EscribirNumeros();
	
	@Test
	public void testPrintNumero1(){
		"FIZZBuzz".equals(escribirNumeros.escribeNumeros(1));
	}

	@Test
	public void testPrintNumero2(){
		"FizzBuzz,1".equals(escribirNumeros.escribeNumeros(2));
	}
	
	@Test
	public void testPrintNumero3(){
		"FizzBuzz,1,Dos".equals(escribirNumeros.escribeNumeros(3));
	}

	@Test
	public void testPrintNumero4(){
		"FizzBuzz,1,Dos,Buzz".equals(escribirNumeros.escribeNumeros(3));
	}
	
	@Test
	public void testFizzBuzz0(){
		System.out.println(escribirNumeros.devolverFizzBuzz(0));
		Assert.assertTrue(escribirNumeros.devolverFizzBuzz(0).equals("FizzBuzz"));
	}
	
	@Test
	public void testFizzBuzz1(){
		System.out.println(escribirNumeros.devolverFizzBuzz(1));
		Assert.assertTrue(escribirNumeros.devolverFizzBuzz(1).equals("1"));
	}
	@Test
	public void testFizzBuzz2(){
		System.out.println(escribirNumeros.devolverFizzBuzz(2));
		Assert.assertTrue(escribirNumeros.devolverFizzBuzz(2).equals("Dos"));
	}
	@Test
	public void testFizzBuzz3(){
		System.out.println(escribirNumeros.devolverFizzBuzz(3));
		Assert.assertTrue(escribirNumeros.devolverFizzBuzz(3).equals("Fizz"));
	}
	@Test
	public void testFizzBuzz5(){
		System.out.println(escribirNumeros.devolverFizzBuzz(5));
		Assert.assertTrue(escribirNumeros.devolverFizzBuzz(5).equals("Buzz"));
	}
}
