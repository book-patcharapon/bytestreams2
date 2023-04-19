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
public class LAB3 {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream ("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
} 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
} 
        catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
}
        
    }
}
