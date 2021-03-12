package com.everis.marcelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.marcelo.repository.UserRepository;
import com.everis.marcelo.service.SaveBank;

@SpringBootApplication
public class ReadFilesCsvApplication implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	String filePath = "C:\\Users\\mwalther\\OneDrive - everis\\Desktop\\Novo(a) Planilha do Microsoft Excel.csv";

	public static void main(String[] args) {
		SpringApplication.run(ReadFilesCsvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SaveBank bank = new SaveBank();
		
		bank.save(filePath, repository);
		
	}
	
	
}
