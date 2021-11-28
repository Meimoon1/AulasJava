package com.capgemini.banco;

import java.util.List;

import com.capgemini.banco.model.Filme;
import com.capgemini.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.init.RepositoryPopulator;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository){
		this.repository = repository;
	}
	public static void main (String[] args) {
		SpringApplication.run(BancoApplication.class, args);
		//classe de start do projeto, por boa prática melhor n startar aq
	}

	@Override
	public void run(String... args) throws Exception {
		Filme model = new Filme();
		model.setNome("Sweneey Todd: O barbeiro demoníacao da rua fleet");
		model.setNomeDiretor("Tim Burton");
		model.setGenero("Musical");

		repository.save(model);

		//List<Filme> lista = (List<Filme>)repository.findAll();
		//System.out.println("\n");
		//for (Filme f : lista) {
		//	System.out.printf("%d - %s", f.getId(),f.getNome());
		//}	
		//System.out.println("\n");
		
		//metodo generico p imprimir lista, fomrma mais fácuil do sysout
		System.out.println("\n");
		repository.findAll().forEach(f -> System.out.printf("%d - %s",f.getId(),f.getNome()));
		System.out.println("\n");
	}

}
