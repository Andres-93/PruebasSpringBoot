package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.configuracion.ConfiguracionConcierto;
import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoSolistaSpring {

	public static void main(String[] args) {
		
		//ApplicationContext contexto = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionConcierto.class);
		
		MusicoInterface solista = (MusicoInterface) contexto.getBean("solista");
		
		try {
			solista.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("SEÑORES HE ARREGLADO EL INSTRUMENTO");
		}
		
		

	}

}
