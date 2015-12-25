package numeros;

public class MultiploTresYCinco extends TipoNumero {

	@Override
	public String devolverValor() {
		return "FizzBuzz";
	}

	@Override
	public boolean esMultiplo(int numero) {
		return (numero%3==0)&&(numero%5==0);
	}
}
