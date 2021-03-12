package com.everis.marcelo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.everis.marcelo.repository.UserRepository;
import com.everis.marcelo.resorces.ReadFilesCsV;

public class SaveBank {
	
	//Save
	public void save(String filePath, UserRepository repository) throws FileNotFoundException, IOException {
		List<String> list = ReadFilesCsV.readArchive(filePath);
		ReadFilesCsV.createUserFileCsv(list , repository);
	}
	

}
