package idat.edu.pe.daa2.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.daa2.spring.core.di.tradicional.Automovil;
import idat.edu.pe.daa2.spring.core.di.tradicional.Tractor;
import idat.edu.pe.daa2.spring.core.di.tradicional.VehiculoI;
import idat.edu.pe.daa2.spring.core.di.tradicional.ViajarVehiculo;
import idat.edu.pe.daa2.spring.core.ioc.SaludoEspannol;
import idat.edu.pe.daa2.spring.core.ioc.SaludoI;
import idat.edu.pe.daa2.spring.core.ioc.SaludoIngles;
import idat.edu.pe.daa2.spring.core.ioc.SaludoPortugues;

@SpringBootApplication
public class SpringCoreProjectAppApplication {

	public static void main(String[] args) {
		
		
	//	String nombre = "Christian Castillo";
		
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringCoreProjectAppApplication.class, args);
		
		
		ViajarVehiculo viaje = new ViajarVehiculo();
		viaje.setVehiculo(cxt.getBean(Automovil.class));
		viaje.empezarAcelerar();
		
		viaje.setVehiculo((VehiculoI) cxt.getBean("motocicleta"));
		viaje.empezarAcelerar();
		
		viaje.setVehiculo((VehiculoI) cxt.getBean("MiPatin"));
		viaje.empezarAcelerar();
		
		viaje.setVehiculo(cxt.getBean(Tractor.class));
		viaje.empezarAcelerar();
		
	
		
		/*SaludoI saludo1 = (SaludoEspannol)cxt.getBean("saludoEspannol");
		System.out.println("saludo 1 en español : " + saludo1.saludar(nombre));		
				
	    SaludoI saludo2 = (SaludoIngles)cxt.getBean("saludoIngles");
	    System.out.println("saludo 2 en ingles : " + saludo2.saludar(nombre));		
	    
	    SaludoI saludo3 = (SaludoPortugues)cxt.getBean("saludoBrasilero");
	    System.out.println("saludo 3 en portugues : " + saludo3.saludar(nombre));*/	
		
		
	}

}
