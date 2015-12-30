package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import code.EscribirNumeros;

public class TestPrintNumeros {

	 private EscribirNumeros escribirNumeros;

	   @Before
	   public void setUp() throws Exception{
	      escribirNumeros = new EscribirNumeros();
	   }
	   
	   @Test
	   public void testPrintNumero0(){
		   assertEquals("testPrintNumero1","",escribirNumeros.escribeNumeros(0));
	   }
	   @Test
	   public void testPrintNumero1(){
	      assertEquals("testPrintNumero1","2 3 y 5 Multiplo Siete",escribirNumeros.escribeNumeros(1));
	   }

	   @Test
	   public void testPrintNumero2(){
	      assertEquals("testPrintNumero2", "2 3 y 5 Multiplo Siete,1",escribirNumeros.escribeNumeros(2));
	   }
	   
	   @Test
	   public void testPrintNumero3(){
	      assertEquals("", "2 3 y 5 Multiplo Siete,1,2",escribirNumeros.escribeNumeros(3));
	   }

	   @Test
	   public void testPrintNumero4(){
	      assertEquals("testPrintNumero3", "2 3 y 5 Multiplo Siete,1,2,Fizz",escribirNumeros.escribeNumeros(4));
	   }
}
