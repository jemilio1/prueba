package numeros;

import java.util.ArrayList;
import java.util.List;

public class Estrategia {
	private int numero;
	private List<TipoNumero> tipos;
	public Estrategia(int numero){
		this.numero = numero;
		tipos = new ArrayList<>();
		tipos.add(new MultiploDos());
		tipos.add(new MultiploTres());
		tipos.add(new MultiploCinco());
		tipos.add(new MultiploSiete());
		tipos.add(new MultiploTresYCinco());
	}
	
	public TipoNumero devolverEstrategia(){
		TipoNumero tiposNumero = new NumeroGeneral(numero);		
		for (TipoNumero tipoNumero : tipos) {
			if(tipoNumero.esMultiplo(numero)){
				tiposNumero = tipoNumero;
			}
		}
		return tiposNumero;
	}
}
