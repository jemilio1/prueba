package numeros;

public class NumeroGeneral extends TipoNumero {

	private String valor;
	public NumeroGeneral(int numero){
		valor = String.valueOf(numero);
	}
	@Override
	public String devolverValor() {
		return valor;
	}
	@Override
	public boolean esMultiplo(int numero) {
		return true;
	}
	@Override
	public Integer[] devolverMultiplos() {
		return new Integer[]{};
	}
	
}
