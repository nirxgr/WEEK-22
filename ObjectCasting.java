//creating a class Shape (not public because there can be only one public class)
class Shapee{
    public void draw(){
        System.out.println("Draw a shape.");
    }
}

//creating a class child class Circle which extends parent class Shape (not public because there can be only one public class)
class Circle extends Shapee{
    @Override
    public void draw(){
        System.out.println("The shape is a circle.");
    }
    
    //creating a method setRadius
    public void setRadius(int radius){
        System.out.println("The new radius of circle is "+radius);
    }
}

//object casting
public class ObjectCasting{
    public static void main(String[]args){
        //s1 circle class ko object name or reference var 
        //parent class ko reference s1 ley
        //upcasting
        Shapee s1 = new Circle();
        //child class version of draw() method is called here
        s1.draw();
        
        //downcasting
        //to ensure that the object is indeed an instance of the subclass
        //avoid ClassCastException at runtime
        if(s1 instanceof Circle){
          //c1 object name or reference var of circle
          //(circle) to denote s1 is reference of circle
          Circle c1 = (Circle) s1;
          c1.draw();
          c1.setRadius(5);
        }
        
    }
}