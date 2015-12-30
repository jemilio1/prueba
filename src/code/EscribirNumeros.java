package code;

import java.util.List;

import numeros.Estrategia;
import numeros.TipoNumero;

public class EscribirNumeros {
	public static int PRIMERO = 1;
	public static int NUMERO_INICIAL = PRIMERO -1;
	public static String SEPARADOR = ",";
	public Estrategia estrategia = new Estrategia();
	
	public String escribeNumeros(int numerosAImprimir) {
		String numeros = "";
		if(numerosAImprimir >= PRIMERO){
			numeros = devolverNumeros(NUMERO_INICIAL);
		}		
		numeros = numeros+devolverNumerosSeparados(numerosAImprimir);
		return numeros;
	}

	private String devolverNumerosSeparados(int numerosAImprimir) {
		String numeros ="";
		for(int i = 1; i<numerosAImprimir; i++){
			numeros = numeros + SEPARADOR+ devolverNumeros(i);
		}
		return numeros;
	}
	
	public String devolverNumeros(int numero){
		List<TipoNumero> devolverEstrategia = estrategia.devolverEstrategia(numero);
		StringBuffer valoresNumeros = new StringBuffer();
		for (TipoNumero tipoNumero : devolverEstrategia) {
			valoresNumeros.append(tipoNumero.devolverValor());
		}
		return valoresNumeros.toString();
	}
}
