package concierto.instrumentos;

import concierto.excepciones.InstrumentoRotoException;

public class Instrumento implements InstrumentoInterface, Comparable<Instrumento> {
	
	private String sonido;
	
	
	
	public Instrumento() {
		super();
	}

	public Instrumento(String sonido) {
		this.sonido = sonido;
	}
	
	

	@Override
	public String sonar() throws InstrumentoRotoException {	
		
		if(getSonido().equals("nada")) throw new InstrumentoRotoException();
		
		return getSonido();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public int compareTo(Instrumento o) {
		// TODO Auto-generated method stub
		return this.getSonido().compareTo(o.getSonido());
	}
	
	

}
