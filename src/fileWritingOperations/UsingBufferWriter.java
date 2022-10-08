package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		String location="UsingBufferWriter.txt";

		String content="Winter is coming!!!";
		
		FileWriter fileWriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		
		bufferedWriter.close();


	}

}
