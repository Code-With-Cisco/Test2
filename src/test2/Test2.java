/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;

/**
 *
 * @author mtsguest
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TwoDShape[] myShapes = new TwoDShape[3];
       myShapes[0] = new Circle("red", 3);
       myShapes[1] = new Rectangle("blue", 6, 3);
       myShapes[2] = new Square("white", 4);
       
       for (int i = 0; i < myShapes.length; i++)
       {
           System.out.print(myShapes[i] + " ");
           System.out.printf("area = %.2f ", myShapes[i].getArea());
           System.out.printf("perimeter = %.2f \n", myShapes[i].getPerimeter());
       }
        
    }
    
}
