package concierto.teatros;



import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquesta;

public class ConciertoOrquesta {

	public static void main(String[] args) {
		
		Instrumento tambor = new Instrumento();
		tambor.setSonido("pom,pom,pom");
		
		Instrumento trompeta = new Instrumento();
		trompeta.setSonido("luu,luu,luu");
		
		Instrumento guitarra = new Instrumento();
		guitarra.setSonido("tlan,tlan,tlan");
		
		HombreOrquesta hombre = new HombreOrquesta();
		
		hombre.setInstrumentos(new HashSet<Instrumento>());
		hombre.getInstrumentos().add(tambor);
		hombre.getInstrumentos().add(trompeta);
		hombre.getInstrumentos().add(guitarra);
		hombre.getInstrumentos().add(tambor);
		hombre.getInstrumentos().add(trompeta);
		hombre.getInstrumentos().add(guitarra);
		
		
		try {
			hombre.tocar();
		} catch (InstrumentoRotoException e) {
			
			e.printStackTrace();
		}
		

	}

}
