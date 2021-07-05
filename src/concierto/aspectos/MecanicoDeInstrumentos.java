package concierto.aspectos;

import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.Musico;
import concierto.musicos.Solista;

@Component
@Aspect
public class MecanicoDeInstrumentos {
	
	@Autowired
	private Map<String, String> sonidos;
	
	public Map<String, String> getSonidos() {
		return sonidos;
	}

	public void setSonidos(Map<String, String> sonidos) {
		this.sonidos = sonidos;
	}

	@Pointcut("execution(@concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {
		
	}
	
	@Around("sujetador()")
	public Object hacerTodo(ProceedingJoinPoint joinPoint) throws InstrumentoRotoException {
		
		Object salida = null;
		
		Musico musico = (Musico) joinPoint.getTarget();
		
		try {
			//Before
			System.out.println("SEÑORES VA A EMPEZAR EL CONCIERTO APAGUEN LOS MOVILES");
			salida = joinPoint.proceed();
			
			//AfterReturning
			
		} catch (Throwable e) {
			//AfterThrowing
			
			System.out.println("SEÑORES SE HA ROTO EL INSTRUMENTO , LO VOY A ARREGLAR Y CONTINUAMOS");
			if(musico.getClass().isInstance(new Solista())) {
				Solista solista = (Solista) musico;
				
				String nombreInstrumento = solista.getInstrumento().getClass().getSimpleName().toLowerCase();
				
				solista.getInstrumento().setSonido(getSonidos().get(nombreInstrumento));
				
				
			}
			else {
				
				HombreOrquesta hombreOrquesta = (HombreOrquesta) musico;
				
				for (Instrumento instrumento : hombreOrquesta.getInstrumentos()) {
					
					String nombreInstrumento = instrumento.getClass().getSimpleName().toLowerCase();
					
					if(instrumento.getSonido().equals("nada")) {
						instrumento.setSonido(getSonidos().get(nombreInstrumento));
					}
				}
				
			}	
			System.out.println("SEÑORES HE ARREGLADO EL INSTRUMENTO CONTINUAMOS EL CONCIERTO");
			
			
			musico.tocar();
			
			
		}
		finally {
			//After
			System.out.println("SEÑORES EL CONCIERTO A TERMINADO YA PUEDEN ENCENDER LOS MOVILES");
		}
		
		return salida;
	}

}
