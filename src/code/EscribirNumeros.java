package code;

import numeros.Estrategia;

public class EscribirNumeros {
	public static int PRIMERO = 1;
	public static String SEPARADOR = ",";
	
	public String escribeNumeros(int numerosAImprimir) {
		String numeros = "";
		if(numerosAImprimir >= PRIMERO){
			numeros = devolverFizzBuzz(PRIMERO-1);
		}		
		numeros = numeros+devolverNumerosSeparados(numerosAImprimir);
		return numeros;
	}

	private String devolverNumerosSeparados(int numerosAImprimir) {
		String numeros ="";
		for(int i = 1; i<numerosAImprimir; i++){
			numeros = numeros + SEPARADOR+ devolverFizzBuzz(i);
		}
		return numeros;
	}
	
	public String devolverFizzBuzz(int numero){
		Estrategia estrategia = new Estrategia(numero);
		return estrategia.devolverEstrategia().devolverValor();
	}
	
}
