package Section_6;

import Section_6.Animal.Animal;
import Section_6.Animal.Dog;
import Section_6.Challenge_vehicle.Outlander;
import Section_6.Cylinder.Circle;
import Section_6.Cylinder.Cylinder;
import Section_6.PoolArea.Cuboid;
import Section_6.PoolArea.Rectangle;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //ComplexNumber one = new ComplexNumber(1.0D, 1.0D);
        //ComplexNumber number = new ComplexNumber(2.5D, -1.5D);
        //one.add(1.0D, 1.0D);
        //System.out.println("one.real= " + one.getReal());
        //System.out.println("one.imaginary= " + one.getImaginary());
        //one.subtract(number);
        //System.out.println("one.real= " + one.getReal());
        //System.out.println("one.imaginary= " + one.getImaginary());
        //number.subtract(one);
        //System.out.println("number.real= " + number.getReal());
        //System.out.println("number.imaginary= " + number.getImaginary());
        //Animal animal = new Animal("itsName",1,1,5,5);
        //Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
        //dog.eat();
        //dog.run();
        //dog.walk();
        //Outlander outlander = new Outlander(36);
        //outlander.steer(45);
        //outlander.accelerate(30);
        //outlander.accelerate(-20);
        //Circle circle = new Circle(3.75);
        //System.out.println("circle.radius= " + circle.getRadius());
        //System.out.println("circle.area= " + circle.getArea());
        //Cylinder cylinder = new Cylinder(5.55, 7.25);
        //System.out.println("cylinder.radius= " + cylinder.getRadius());
        //System.out.println("cylinder.height= " + cylinder.getHeight());
        //System.out.println("cylinder.area= " + cylinder.getArea());
        //System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }
}
