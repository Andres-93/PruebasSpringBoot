package concierto.teatros;

import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
	
		Instrumento tambor = new Instrumento();
		tambor.setSonido("pom,pom,pom");
		
		Solista solista= new Solista();
		
		solista.setInstrumento(tambor);
			
		try {
			solista.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("SEÑORES HE ARREGLADO EL INSTRUMENTO");
		}

	}

}
