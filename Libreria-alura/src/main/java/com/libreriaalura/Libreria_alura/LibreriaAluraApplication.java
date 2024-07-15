package com.libreriaalura.Libreria_alura;

import com.libreriaalura.Libreria_alura.principal.Principal;
import com.libreriaalura.Libreria_alura.repository.IAutorRepository;
import com.libreriaalura.Libreria_alura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaAluraApplication implements CommandLineRunner {

	@Autowired
	private ILibroRepository libroRepository;
	@Autowired
	IAutorRepository autorRepository;


	public static void main(String[] args) {
		SpringApplication.run(LibreriaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository, autorRepository);
		principal.muestraElMenu();


    }

}
