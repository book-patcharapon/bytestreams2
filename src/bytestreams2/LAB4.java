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
public class LAB4 {
    public static void main(String[] args) {


        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String s = "Hello World";
        byte[] b = s.getBytes();
            output.write(b);
} 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
}       
        catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
}
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
        int ch;
        while ((ch=input.read()) != -1){
            System.out.println((char)ch);
}
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
} 
        catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
}


}
}
