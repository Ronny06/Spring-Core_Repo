package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.stereotype.Component;

@Component
public class Email implements ComunicacionI{
@Override
public void enviar() {
	System.out.println("Email enviar.........");
}
}
