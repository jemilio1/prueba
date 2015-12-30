package numeros;

import java.util.Arrays;


public class Multiplo extends TipoNumero{
	private Integer[] multiplos;
	private String valor;
	
	public Multiplo(String valor,Integer... multiplo) throws Exception{
		this.valor = valor;
		this.multiplos = multiplo;
		Arrays.sort(this.multiplos);
		if(multiplos[0]==0){
			throw new Exception("Multiplo no valido");
		}
	}
	
	@Override
	public String devolverValor() {
		return valor;
	}
	
	@Override
	public boolean esMultiplo(int numero) {
		boolean esMultiplo = true;
		for (Integer multiplo : multiplos) {
			if(!esMultiploDe(numero, multiplo)){
				esMultiplo = false;
			}
		}
		return esMultiplo;
	}
	
	private boolean esMultiploDe(int numero, int multiplo){
		return numero%multiplo==0;
	}

	@Override
	public Integer[] devolverMultiplos() {
		return multiplos;
	}
}
