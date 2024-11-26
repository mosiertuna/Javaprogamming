package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class garbage {
	public static void main(String[] args) {
	        String filename = "E:\\Java programing\\Javaprogamming\\Lab_02\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt";
	        try {
	            byte[] inputBytes = {0};
	            long startTime;
	            inputBytes = Files.readAllBytes(Paths.get(filename));
	            startTime = System.currentTimeMillis();
	            StringBuilder outputString = new StringBuilder();
	            for (byte b : inputBytes) {
	                outputString.append((char) b);
	            }
	            long endTime1 = System.currentTimeMillis();
	            System.out.println(endTime1 - startTime);
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	      }
	    
	}
}
