package numeros;

public class MultiploSiete extends TipoNumero {

	@Override
	public String devolverValor() {
		return "Multiplo Siete";
	}

	@Override
	public boolean esMultiplo(int numero) {
		return numero%7==0;
	}

}
