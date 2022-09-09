package com.sonata.sreams.sep7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EmployeeSerializ {
	
	public static void main(String[] args) throws IOException {
		
		Empolyee obj =new Empolyee(112,"shiva","ITI layout");
        ObjectOutputStream oos = null;
        FileOutputStream fos =null;
        Empolyee ob =null;
        try {
            fos = new FileOutputStream("D:\\Empolyee.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        
        
        }
        finally {
        	oos.close();
        	fos.close();
        }
        System.out.println("serialzation done!!");
        
        FileInputStream fis = new FileInputStream("D:\\Empolyee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            ob = (Empolyee)ois.readObject();
            ois.close();
            fis.close();
        }catch(ClassNotFoundException s) {System.out.println(s);}
        System.out.println("Employee ID is"+ob.getEmpId());
        System.out.println("Emplye Adrdress is"+ob.getEmpAdd());
	}
}


   
	

