
package remote;

import java.util.ArrayList;
import java.util.List;

interface Shape{
   void draw();
   float calculate();
}


public class Polymorphism {
    public static void main(String[] args) {
        
        // 1st example
      Shape newShape= new Circle(122, 30);
      Shape newShape2 = new Rectangle(22, (float) 12.2);
      
      newShape.draw();
      System.out.println("Area is :  "+ newShape.calculate());
      newShape2.draw();
      System.out.println("Area is :  "+ newShape2.calculate());
      System.out.println("------");
      
      // using  dynamic or scalable way
      List<Shape> shapeObj = new ArrayList<>();
      
      shapeObj.add(new Circle(100, 30));
      shapeObj.add(new Circle(10, 30));
      shapeObj.add(new Rectangle(333, 66));
            
       printAllData(shapeObj);
      
      
    }
    
   public static void printAllData(Iterable<Shape> shapeObj){
        for (Shape shape: shapeObj) {
           shape.draw();
           float val= shape.calculate();
           System.out.println("Value is : "+ val);
       }
    } 
}

class Circle implements Shape{
     float length;
     float width;
     
     Circle(float len, float wid){
     this.length=len;
     this.width=wid;
     }
     
     
    @Override
    public void draw() {
        System.out.println("Circle is drewing..");
    }

    @Override
    public float calculate() {
     return  length * width;   
    }
}

class Rectangle implements Shape{
     float length;
     float width;
     
     Rectangle(float len, float wid){
     this.length=len;
     this.width=wid;
     }
     
     
    @Override
    public void draw() {
        System.out.println("RecTangle is drewing..");
    }

    @Override
    public float calculate() {
     return  length * width;   
    }
}

