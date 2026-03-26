/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * instanceof operator
 * and
 * inconvertible types
 */
public class Example_1_05{

  public static void main(String [] args){

    Animal_05 a5 = new Animal_05();

    Cat_05 c5 = new Cat_05();
    Dog_05 d5 = new Dog_05();

    BaseClass_01 bc1 = new BaseClass_01();
    DerivedClass_01 dc1 = new DerivedClass_01();

    System.out.println(a5 instanceof Animal_05); // true
    System.out.println(c5 instanceof Animal_05); // true
    System.out.println(d5 instanceof Animal_05); // true

    System.out.println();

    System.out.println(a5 instanceof Cat_05); // false
    System.out.println(a5 instanceof Dog_05); // false

    System.out.println();

    System.out.println(bc1 instanceof BaseClass_01); // true
    System.out.println(dc1 instanceof DerivedClass_01); // true

    System.out.println();

    System.out.println(dc1 instanceof BaseClass_01); // true
    System.out.println(bc1 instanceof DerivedClass_01); // false

    System.out.println();

    // Errors
    //  - inconvertible types
    // System.out.println(a5 instanceof BaseClass_01);
    // System.out.println(a5 instanceof DerivedClass_01);
    // System.out.println(c5 instanceof BaseClass_01);
    // System.out.println(c5 instanceof DerivedClass_01);

    System.out.println();

    // Errors
    //  - inconvertible types
    // System.out.println(bc1 instanceof Animal_05);
    // System.out.println(bc1 instanceof Cat_05);
    // System.out.println(dc1 instanceof Animal_05);
    // System.out.println(dc1 instanceof Cat_05);
  }
}

class BaseClass_01{}

class DerivedClass_01 extends BaseClass_01{}

class Animal_05{}

class Cat_05 extends Animal_05{}

class Dog_05 extends Animal_05{}