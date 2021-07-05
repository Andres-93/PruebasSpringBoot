package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Tambor extends Instrumento {

	
	@Override
	@Value("nada")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}
	
	
	
}
