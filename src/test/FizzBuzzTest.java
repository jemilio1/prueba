package test;

import static org.junit.Assert.assertEquals;
import numeros.Estrategia;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	  private Estrategia estrategia;
	  @Before
	  public void inic() throws Exception{
		  estrategia = new Estrategia();
	  }
	  
	  @Test
	   public void testFizzBuzz0(){
	      assertEquals("No devuelve FizzBuzz",estrategia.devolverEstrategia(0).size(),3);
	   }
	   
	   @Test
	   public void testFizzBuzz1(){
		   assertEquals("testFizzBuzz1",1,estrategia.devolverEstrategia(1).size());
	      assertEquals("testFizzBuzz1","1",estrategia.devolverEstrategia(1).get(0).devolverValor());
	   }


	   @Test
	   public void testFizzBuzz2(){
		  assertEquals("testFizzBuzz2",estrategia.devolverEstrategia(2).get(0).devolverValor(),"2");
	      assertEquals("testFizzBuzz2",estrategia.devolverEstrategia(2).size(),1);
	   }


	   @Test
	   public void testFizzBuzz3(){
	      assertEquals("testFizzBuzz3",estrategia.devolverEstrategia(3).get(0).devolverValor(),"Fizz");
	      assertEquals("testFizzBuzz3",estrategia.devolverEstrategia(3).size(),1);
	   }


	   @Test
	   public void testFizzBuzz5(){
		   assertEquals("testFizzBuzz5",estrategia.devolverEstrategia(5).size(),1);
		   assertEquals("testFizzBuzz5",estrategia.devolverEstrategia(5).get(0).devolverValor(),"Buzz");
	   }
	   @Test
	   public void testFizzBuzz15(){
		   assertEquals("testFizzBuzz15",estrategia.devolverEstrategia(15).size(),1);
		   assertEquals("testFizzBuzz15",estrategia.devolverEstrategia(15).get(0).devolverValor(),"3 y 5");
	   }
	   @Test
	   public void testFizzBuzz30(){
		  assertEquals("testFizzBuzz30",estrategia.devolverEstrategia(30).size(),2);
	      assertEquals("testFizzBuzz30",estrategia.devolverEstrategia(30).get(0).devolverValor(),"2");
	      assertEquals("testFizzBuzz30",estrategia.devolverEstrategia(30).get(1).devolverValor(),"3 y 5");
	   }
	   
}
