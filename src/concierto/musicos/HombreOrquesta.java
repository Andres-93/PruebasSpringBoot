package concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Vigilado;
import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;


@Component
public class HombreOrquesta extends Musico {

	
	@Override
	@Autowired
	@Qualifier("tambor")
	public void setInstrumentos(Set<Instrumento> instrumentos) {
		
		super.setInstrumentos(instrumentos);
	}
	
	
	
	@Override
	@Vigilado
	public void tocar() throws InstrumentoRotoException {

		for (Instrumento instrumento : instrumentos) {
			
			System.out.println(instrumento.sonar());
			
		}
	}

}
