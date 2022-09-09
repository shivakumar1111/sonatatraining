package com.sonata.sreams.sep7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithResource {

	public static void main(String[] args) throws IOException{
		try (BufferedReader br = new BufferedReader(new FileReader("D://SIMPLEJAVA.txt"))) {
			System.out.println(br.readLine());
			
		}

	}

}
