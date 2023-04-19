/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytestreams2;

/**
 *
 * @author book
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape){
        
    super(shape);
}
     @Override
    public void draw(){
        shape.draw();
        System.out.println("Bordor Color: Red");
    }
}
