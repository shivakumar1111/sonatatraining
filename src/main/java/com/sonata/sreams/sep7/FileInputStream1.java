package com.sonata.sreams.sep7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("D://SIMPLEJAVA.txt");
		FileInputStream fis = new FileInputStream("D://SIMPLEJAVA.txt");
		byte b=68;
		int i =0;
		char c;
		try {
			fos.write(b);
			
			while ((i=fis.read())!=-1) {
				c=(char)i;
				System.out.println(c);
			}
		}finally {
			if(fos!=null)
				fos.close();
			if(fis!=null)
				fis.close();
			
			
		}
	}

	

}
