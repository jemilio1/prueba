package numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Estrategia {
	
	private List<TipoNumero> tipos;
	
	public Estrategia() throws Exception{
		this.tipos = new ArrayList<TipoNumero>();
		tipos.add(new Multiplo("3 y 5", 3,5));
		tipos.add(new Multiplo("2",2));
		tipos.add(new Multiplo("Fizz",3));
		tipos.add(new Multiplo("Buzz",5));
		tipos.add(new Multiplo("Multiplo Siete",7));
		Collections.sort(tipos, new CriterioOrdenacionEstrategias());
	}
	
	public List<TipoNumero> devolverEstrategia(int numero){
		Map<Integer,TipoNumero> multiplos = new TreeMap<Integer,TipoNumero>();
		for (TipoNumero tipoNumero : tipos) {
			if(anadirTipo(numero, multiplos, tipoNumero)){
				aniadirMultiplosTipoNumero(tipoNumero, multiplos);
			}
		}
		return devolverLista(numero, multiplos);
	}

	private boolean anadirTipo(int numero, Map<Integer,TipoNumero> multiplos, TipoNumero tipoNumero) {
		return tipoNumero.esMultiplo(numero) && !estaAñadidoAntes(tipoNumero, multiplos);
	}

	private boolean estaAñadidoAntes(TipoNumero tipoNumero, Map<Integer,TipoNumero> multiplos) {
		Integer[] devolverMultiplos = tipoNumero.devolverMultiplos();
		int iterador = 0;
		boolean encontrado = true; 
		while (iterador < devolverMultiplos.length && encontrado) {
			if(!multiplos.containsKey(devolverMultiplos[iterador])){
				encontrado = false;
			}
			iterador++;
		}
		return encontrado;
	}
	
	private void aniadirMultiplosTipoNumero(TipoNumero tipoNumero, Map<Integer,TipoNumero> multiplos) {
		for (Integer multiplo : tipoNumero.devolverMultiplos()) {
			multiplos.put(multiplo,tipoNumero);
		}
	}
	
	private List<TipoNumero> devolverLista(int numero, Map<Integer, TipoNumero> multiplos) {
		List<TipoNumero> numeros = new ArrayList<TipoNumero>();	
		Set<TipoNumero> tiposNoDuplicados = new LinkedHashSet<TipoNumero>(multiplos.values());
		numeros.addAll(tiposNoDuplicados);
		if(numeros.isEmpty()){
			numeros.add(new NumeroGeneral(numero));
		}
		return numeros;
	}
	
}
