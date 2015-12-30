package numeros;

import java.util.Comparator;

public class CriterioOrdenacionEstrategias implements Comparator<TipoNumero> {

	@Override
	public int compare(TipoNumero tipoNumero1, TipoNumero tipoNumero2) {
		if(tipoNumero1==null && tipoNumero2==null){
			return 0;
		}
		if(tipoNumero1==null && tipoNumero2!=null){
			return 1;
		}
		if(tipoNumero1!=null && tipoNumero2==null){
			return -1;
		}
		Integer numeroMultiplos1 = tipoNumero1.devolverMultiplos().length;
		Integer numeroMultiplos2 = tipoNumero2.devolverMultiplos().length;
		
		return (-1)*numeroMultiplos1.compareTo(numeroMultiplos2);
	}

}
