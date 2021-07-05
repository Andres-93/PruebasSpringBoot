package concierto.musicos;

import concierto.excepciones.InstrumentoRotoException;

public interface MusicoInterface {

	public abstract void tocar() throws InstrumentoRotoException;
}
