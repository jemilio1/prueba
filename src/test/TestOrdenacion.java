package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import numeros.CriterioOrdenacionEstrategias;
import numeros.Multiplo;
import numeros.TipoNumero;

import org.junit.Test;

public class TestOrdenacion {

	@Test
	public void testOrdenacion() throws Exception{
		List<TipoNumero> tipos = new ArrayList<TipoNumero>();
		tipos.add(new Multiplo("3 y 5 ", 3,5));
		tipos.add(new Multiplo("1 y 4", 1,4));
		tipos.add(new Multiplo("1 3 y 5", 1,3,5));
		tipos.add(new Multiplo("Dos",2));
		tipos.add(new Multiplo("Fizz",3));
		tipos.add(new Multiplo("Buzz",5));
		tipos.add(new Multiplo("Multiplo Siete",7));
		Collections.sort(tipos, new CriterioOrdenacionEstrategias());
		for (TipoNumero tipoNumero : tipos) {
			System.out.println(tipoNumero.devolverValor());
		}
	}
}
