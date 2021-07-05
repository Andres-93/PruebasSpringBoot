package concierto.configuracion;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import concierto.instrumentos.Tambor;
import concierto.musicos.Solista;

@Configuration
@ComponentScan("concierto")
@EnableAspectJAutoProxy
public class ConfiguracionConcierto {
	
	
	@Bean
	public Solista solista(Tambor tambor) {
		Solista solista= new Solista();
		solista.setInstrumento(tambor);	
		return solista;
	}
	
	@Bean
	public Map<String, String> sonidos(){
		
		Map<String, String> sonidos = new HashMap<String, String>();
		
		sonidos.put("tambor","pom,pom,pom arreglado");
		sonidos.put("trompeta","tuuu,tuuu,tuuuu arreglado");
		sonidos.put("guitarra","tlan,tlan,tlan arreglado");
		
		
		
		return sonidos;
		
		
	}
	

}
