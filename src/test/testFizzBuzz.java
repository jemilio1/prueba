package test;

import numeros.Estrategia;

import org.junit.Assert;
import org.junit.Test;

import code.EscribirNumeros;

public class testFizzBuzz {

	@Test
	public void testFizzBuzz0(){
		System.out.println(Estrategia.devolverEstrategia(0).devolverValor());
		Assert.assertTrue(Estrategia.devolverEstrategia(0).devolverValor().equals("FizzBuzz"));
	}
	
	@Test
	public void testFizzBuzz1(){
		System.out.println(Estrategia.devolverEstrategia(1).devolverValor());
		Assert.assertTrue(Estrategia.devolverEstrategia(1).devolverValor().equals("1"));
	}
	@Test
	public void testFizzBuzz2(){
		System.out.println(Estrategia.devolverEstrategia(2).devolverValor());
		Assert.assertTrue(Estrategia.devolverEstrategia(2).devolverValor().equals("Dos"));
	}
	@Test
	public void testFizzBuzz3(){
		System.out.println(Estrategia.devolverEstrategia(3).devolverValor());
		Assert.assertTrue(Estrategia.devolverEstrategia(3).devolverValor().equals("Fizz"));
	}
	@Test
	public void testFizzBuzz5(){
		System.out.println(Estrategia.devolverEstrategia(5).devolverValor());
		Assert.assertTrue(Estrategia.devolverEstrategia(5).devolverValor().equals("Buzz"));
	}
}
