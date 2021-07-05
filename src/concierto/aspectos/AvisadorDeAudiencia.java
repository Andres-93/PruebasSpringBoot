package concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class AvisadorDeAudiencia {
	
	@Pointcut("execution(@concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {
		
	}
	
	@Before("sujetador()")
	public void apagarMoviles() {
		System.out.println("SEÑORES VA A EMPEZAR EL CONCIERTO APAGUEN LOS MOVILES");
	}
	
	
	@AfterReturning("sujetador()")
	public void encenderMoviles() {		
		System.out.println("SEÑORES EL CONCIERTO A TERMINADO YA PUEDEN ENCENDER LOS MOVILES");
	}
	
	

}
