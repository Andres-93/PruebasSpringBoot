package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.musicos.HombreOrquesta;
import concierto.musicos.Solista;

public class EjemploScope {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("Spring.xml");

		Solista solista = (Solista) contexto.getBean("solista");
		HombreOrquesta hombreOrquesta = (HombreOrquesta) contexto.getBean("hombreOrquesta");
		
		try {
			System.out.println("--------Toca solista-------------");
			solista.tocar();
			System.out.println("-----------Solista cambia sonido al tambor -----------");
			solista.getInstrumento().setSonido("sonido puesto por el solista");
			System.out.println("----------------Solista toca otra vez------------");
			solista.tocar();
			System.out.println("-------------Toca el Hombre Orquesta---------");
			hombreOrquesta.tocar();
		} catch (Exception e) {
			System.out.println("Se ha roto el instrumento");
		}
		
		
		
	}

}
