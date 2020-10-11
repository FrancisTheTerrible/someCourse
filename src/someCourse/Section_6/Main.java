package Section_6;

import Section_6.Animal.Animal;
import Section_6.Animal.Dog;

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
        Animal animal = new Animal("itsName",1,1,5,5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
        dog.eat();
        dog.run();
        //dog.walk();
    }
}
