package numeros;

public class MultiploTres extends TipoNumero {

	@Override
	public String devolverValor() {
		return "Fizz";
	}

	@Override
	public boolean esMultiplo(int numero) {
		return numero%3==0;
	}
}
