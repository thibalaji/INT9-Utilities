package com.sandbox.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

/**
 * This class is used to decrypt a text that was encoded using a pyramid stack algorithm. 
 * @author thiba
 *
 */


public class PyramidCrypt{

	//top of the pyramid to identify the first word.
	static int SEED_VAL=1;
	//next stack size to start the descending pyramid.
	static int PYRAMID_GENERATOR=2;
			
	
     public Hashtable readAndReturnFile(String fileName)
     {
        String filePath = "coding_qual_input.txt"; // Replace with the actual file path
        Hashtable ht=new Hashtable();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i=0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                //if(words.length >0)
                ht.put(words[0],words[1]);
                //System.out.println(line);
                // You can process the 'line' variable as needed
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }       
        return ht;
     }

     public static void main(String []args)
     {
        System.out.println("Hello, World!");
        PyramidCrypt pTest = new PyramidCrypt();
        java.util.Hashtable al = new java.util.Hashtable();
        al = pTest.readAndReturnFile("coding_qual_input.txt");
        int i=PyramidCrypt.SEED_VAL, j=PyramidCrypt.PYRAMID_GENERATOR;      
        String txt=(String)al.get(String.valueOf(i));
        while(txt != null)
        {
        	System.out.print(txt +" ");
        	i=i+j;
        	j+=PyramidCrypt.PYRAMID_GENERATOR;
        	txt=(String)al.get(String.valueOf(i));
        }
     }
}

