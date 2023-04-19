/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytestreams2;
import java.io.Serializable;
/**
 *
 * @author book
 */
public class Student implements Serializable {
        String id;
        String name;

public Student(String id,String name) {
        this.id = id;
        this.name = name;

}

}
