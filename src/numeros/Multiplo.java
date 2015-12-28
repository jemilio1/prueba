package numeros;

import java.util.LinkedList;
import java.util.List;

public class Multiplo extends TipoNumero{
	private List<Integer> multiplos = new LinkedList<Integer>();
	private String valor;
	
	public Multiplo(String valor,Integer... multiplo){
		this.valor = valor;
		for (Integer valorMultiplo : multiplo) {
			multiplos.add(valorMultiplo);
		}
	}
	
	@Override
	public String devolverValor() {
		return valor;
	}
	@Override
	public boolean esMultiplo(int numero) {
		for (Integer multiplo : multiplos) {
			if(!ValidacionMultiplos.esMultiplo(numero, multiplo)){
				return false;
			}
		}
		return true;
	}
	
	
}
