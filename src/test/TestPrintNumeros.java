package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import code.EscribirNumeros;

public class TestPrintNumeros {

	 private EscribirNumeros escribirNumeros;

	   @Before
	   public void setUp(){
	      escribirNumeros = new EscribirNumeros();
	   }
	   
	   @Test
	   public void testPrintNumero1(){
	      assertEquals("testPrintNumero1","23 y 5Multiplo Siete",escribirNumeros.escribeNumeros(1));
	   }

	   @Test
	   public void testPrintNumero2(){
	      assertEquals("testPrintNumero2", "23 y 5Multiplo Siete,1",escribirNumeros.escribeNumeros(2));
	   }
	   
	   @Test
	   public void testPrintNumero3(){
	      assertEquals("", "23 y 5Multiplo Siete,1,2",escribirNumeros.escribeNumeros(3));
	   }

	   @Test
	   public void testPrintNumero4(){
	      assertEquals("testPrintNumero3", "23 y 5Multiplo Siete,1,2,Fizz",escribirNumeros.escribeNumeros(4));
	   }
}
