package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingBufferWriter.txt"; 
		
		FileReader fileReader = new FileReader(location);
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		String currentLine;
		
		while((currentLine = reader.readLine())!=null) {
		
		System.out.println(currentLine);
	
		
	}

}

}