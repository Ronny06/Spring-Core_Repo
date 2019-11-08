package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoAjencia implements PagoI {
	@Autowired
	public DAoBaseI repositorio;

	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		repositorio.Conectar();

	}

}
