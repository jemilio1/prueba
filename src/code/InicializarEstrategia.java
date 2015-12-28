package code;

import java.util.ArrayList;
import java.util.List;

import numeros.Multiplo;
import numeros.TipoNumero;

public class InicializarEstrategia {

	public static List<TipoNumero>  inicializarEstrategia(){
		List<TipoNumero> tipos = new ArrayList<TipoNumero>();
		tipos.add(new Multiplo("FizzBuzz", 3,5));
		tipos.add(new Multiplo("Dos",2));
		tipos.add(new Multiplo("Fizz",3));
		tipos.add(new Multiplo("Buzz",5));
		tipos.add(new Multiplo("Multiplo Siete",7));
		return tipos;
	}
}
