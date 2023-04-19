/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytestreams2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author book
 */
public class LAB2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
            FileOutputStream output = new FileOutputStream("data.dat");
        String s = "Hello World!";
        byte[] b = s.getBytes();
            try {
                output.write(b);
            } catch (IOException ex) {
                Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        catch (FileNotFoundException ex){
        Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        FileInputStream input = new FileInputStream("data.dat");
        int value;
        while ((value=input.read()) != -1) {
            System.out.println(value);
    }
            input.close();
}           
        catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
}       catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
}
       }
   
      

    }

