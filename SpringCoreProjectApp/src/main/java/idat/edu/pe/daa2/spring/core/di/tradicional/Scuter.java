package idat.edu.pe.daa2.spring.core.di.tradicional;

import org.springframework.stereotype.Component;
@Component(value = "MiPatin")

public class Scuter implements VehiculoI {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Viajando en Scoter");
		
	}

}
