package com.everis.marcelo.resorces;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.everis.marcelo.model.User;
import com.everis.marcelo.repository.UserRepository;



public class ReadFilesCsV {

	public static List<String> readArchive(String filePath) throws FileNotFoundException, IOException {
		InputStream fileInput = new FileInputStream(filePath); // fluxo de arquivo
		Reader inputStream = new InputStreamReader(fileInput); // transformando em bytes
		BufferedReader bufferedReader = new BufferedReader(inputStream); // transformando bytes em caracteres

		String readLine = bufferedReader.readLine().replace(";", " ");
		
		List<String> list = new ArrayList<String>();
		String lines;

		try {

			while (readLine != null) {
				lines = bufferedReader.readLine();
				if (lines != null) {
					list.add(lines.replace(";", " "));
					readLine = lines;
				} else {
					readLine = null;
				}
			}
			bufferedReader.close();
		} catch (NullPointerException e) {
			e.getMessage();
		}
		return list;
	}
	
	
	public static void createUserFileCsv(List<String> list, UserRepository repository) throws NumberFormatException {
		for (int i = 0; i < list.size(); i++) {
	
			try {
				String name = list.get(i).replaceAll("\\d", "").trim();
				String id = list.get(i).replaceAll("[a-zA-Z]", "").trim();
				String age = id.substring(id.length() - 3).trim();
				id = id.substring(0, id.length() - 3).trim();
				
				User user = new User(Long.valueOf(id), name, Integer.valueOf(age));
				
				repository.save(user);//SAVE
				System.out.println(user.toString() + " salvo com sucesso! ");
				
			} catch (StringIndexOutOfBoundsException e) {
				e.getMessage();
			}
			
			
		}
	}
	
}
