package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Vigilado;
import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;

//@Component
public class Solista extends Musico {
	
	
	@Override
	//@Autowired
	//@Qualifier("tambor")
	public void setInstrumento(Instrumento instrumento) {
	
		super.setInstrumento(instrumento);
	}
	
	
	@Override
	@Vigilado
	public void tocar() throws InstrumentoRotoException {
		
		System.out.println(instrumento.sonar());
	}

}
