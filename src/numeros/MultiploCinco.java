package numeros;

public class MultiploCinco extends TipoNumero {

	@Override
	public String devolverValor() {
		return "Buzz";
	}

	@Override
	public boolean esMultiplo(int numero) {
		// TODO Auto-generated method stub
		return numero%5==0;
	}
}
