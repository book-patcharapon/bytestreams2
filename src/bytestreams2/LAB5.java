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
public class LAB5 {
    public static void main(String[] args) {
        Student s = new Student("11111", "Henry");
        
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
            output.writeObject(s);
            output.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
            Student s1 = (Student) input.readObject();
            System.out.println(s1.id + " " + s.name);
            input.close();

        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
