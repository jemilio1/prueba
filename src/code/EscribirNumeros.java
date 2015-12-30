package code;

import java.util.List;

import numeros.Estrategia;
import numeros.TipoNumero;

public class EscribirNumeros {
	private static final String ESPACIO = " ";
	public static final int PRIMERO = 1;
	public static final int NUMERO_INICIAL = PRIMERO -1;
	public static final String SEPARADOR = ",";
	public Estrategia estrategia;
	
	public EscribirNumeros() throws Exception{
		estrategia = new Estrategia();
	}
	
	public String escribeNumeros(int numerosAImprimir) {
		StringBuilder numeros = new StringBuilder();
		if(numerosAImprimir >= PRIMERO){
			numeros.append(devolverNumeros(NUMERO_INICIAL));
		}		
		numeros.append(devolverNumerosSeparados(numerosAImprimir));
		return numeros.toString();
	}

	private String devolverNumerosSeparados(int numerosAImprimir) {
		StringBuilder numeros =new StringBuilder();
		for(int i = PRIMERO; i<numerosAImprimir; i++){
			numeros.append(SEPARADOR).append(devolverNumeros(i));
		}
		return numeros.toString();
	}
	
	public String devolverNumeros(int numero){
		List<TipoNumero> devolverEstrategia = estrategia.devolverEstrategia(numero);
		StringBuffer valoresNumeros = new StringBuffer();
		for (TipoNumero tipoNumero : devolverEstrategia) {
			valoresNumeros.append(tipoNumero.devolverValor()).append(ESPACIO);
		}
		return valoresNumeros.toString().trim();
	}
}
