package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAmi")
public class Guitarra extends Instrumento {

	
	@Override
	@Value("rin, rin,rin con anotaciones")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}
}
