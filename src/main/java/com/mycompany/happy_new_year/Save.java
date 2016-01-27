package com.mycompany.happy_new_year;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Save {

	public void write( Map<String, Integer> filesDict) throws IOException {
		File file = new File("C:\\Test.txt");
		try {
	        if(!file.exists()){
	            file.createNewFile();
	        } else {
	        	System.out.println("Такой файл уже существует и был перезаписан");
	        }
	        PrintWriter writer = new PrintWriter(file.getAbsoluteFile());
	 
	        try {
	        	for (Map.Entry<String, Integer> entry : filesDict.entrySet()) {
	        	writer.println("Файл - '" + entry.getKey()
    		    + "', повторений: " + entry.getValue());
	        	}
	        } finally {
	        	writer.close();
	        	System.out.println("Результат сохранен в " + file);
	        }
	    } catch(IOException e) {
	    	System.out.println("Не удалось найти указыннй путь");
	    }
	}

}