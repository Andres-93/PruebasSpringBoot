package concierto.musicos;

import java.util.HashSet;
import java.util.Set;

import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;

public class Musico implements MusicoInterface {

	protected Instrumento instrumento;
	protected Set<Instrumento> instrumentos;
	
	@Override
	public void tocar() throws InstrumentoRotoException {}
	
	
	public Set<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Set<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

}
