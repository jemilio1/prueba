package numeros;

import code.InicializarEstrategia;

public class Estrategia {
	
		
	public static TipoNumero devolverEstrategia(int numero){
		for (TipoNumero tipoNumero : InicializarEstrategia.inicializarEstrategia()) {
			if(tipoNumero.esMultiplo(numero)){
				return tipoNumero;
			}
		}
		TipoNumero tiposNumero = new NumeroGeneral(numero);		
		return tiposNumero;
	}
}
