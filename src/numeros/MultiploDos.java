package numeros;

public class MultiploDos extends TipoNumero{

	@Override
	public String devolverValor() {
		return "Dos";
	}

	@Override
	public boolean esMultiplo(int numero) {
		return numero%2==0;
	}

}
