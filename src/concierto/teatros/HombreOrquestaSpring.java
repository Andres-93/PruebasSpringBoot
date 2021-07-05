package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.configuracion.ConfiguracionConcierto;
import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;

public class HombreOrquestaSpring {

	public static void main(String[] args) {
		
		//ApplicationContext contexto = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionConcierto.class);
		MusicoInterface hombreOrquesta = (MusicoInterface) contexto.getBean("hombreOrquesta");
		
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("EL INSTRUMENTO NO TIENE ARREGLO, SE ACABO EL CONCIERTO");
		}
		
	}

}
