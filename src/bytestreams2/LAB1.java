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
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
        circleDecorator.draw();
             
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle); 
        rectangleDecorator.draw();
    }
    
}
