package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Qualifier("tocameAmi")
public class Trompeta extends Instrumento {

	@Override
	@Value("tlun, tlun,tlun  con anotaciones")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}
	
}
