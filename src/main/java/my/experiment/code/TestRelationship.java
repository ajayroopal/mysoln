package my.experiment.code;

/*
 * Contents :
 * IS-A relationship in OOP (Inheritance)
 * Has-A relationship (Association)
 * Different type of Association : Aggregation and Composition
 * Example of each type
 *  
 * IS-A (Inheritance) :
 * 
 * In Object oriented programming, IS-A relationship denotes "one object is type of another".
 * IS-A relation denotes Inheritance methodology
 * In Java, Inheritance can be implemented with extends (in case of class) and implements(in case of interface) keywords.
 * A simple example of IS-A relation : Dell IS-A laptop.
 * Unit 2 (Prog 6) : Inheritance in JAVA contains some detailed information about inheritance.
 * If you will check instanceof condition "Dell instanceof Laptop", It is true since Dell IS-A Laptop. 
 * 
 */
class Laptop {
	// Code for Laptop class goes here.
}

interface Formatable {
	// Members of Interface.
}

class Dell extends Laptop implements Formatable {
	// More code related to Dell goes here.
	// Dell class will inherit all accessible members of Laptop class.
	// Dell IS-A Laptop.
	// And Dells class also implements all method of Formatable interface, since
	// Dell is not an abstract class.
	// so Dell IS-A Formatable.
}

/*
 * Note that Object class will be there always on top in every inheritance Hierarchy, 
 * So every class holds IS-A relationship with Object class.
 * and instanceof Object test is always true for all class except Object itself. 
 * 
 * 
 * Has-A :
 * 
 * In Object orientation design, We can say class one is in Has-A relationship with class be if class A holds reference of Claas B.
 * By this reference of class B, A can access all properties of class B which are allowed.
 * Some off topic talk, To use Inheritance and Aggregation in your code is a good programming practice. It reduces the code duplication and increases reusability
 * 
 * Example :
 * 
 */

class HardDisk {
	public void writeData(String data) {
		System.out.println("Data is being written : " + data);
	}
}

class UseDell {
	// segate is referece of HardDisk class in UseDell class.
	// So, UseDell Has-A HardDisk
	HardDisk segate = new HardDisk();
	public void save (String data) {
		segate.writeData(data);
	}
}

 /*
  * Aggregation v/s Composition :
  * 
  * So this is a famous confusing topic, Here we are goes to explain this as simple as possible.
  * 
  * Has-A relationship or Association can be divided in two types :
  * Aggregation and Composition.
  * 
  * Consider above example : HardDisk class and UseDell class.
  * In the example, UseDell HAS-A HardDisk.
  * 
  * If Laptop stops working somehow, you can remove harddisk from that and connect to other laptop, This is Aggregation.
  * In aggregation container class (ALaptop) and referenced class(HardDisk) can have their independent existance.
  * 
  * Now for Composition, consider two different class House and Kitchen.
  */

class House {
	Kitchen kitchen = new Kitchen();
	// More code for House class.
}

class Kitchen {
	// code of Kitchen class.
}
 /* 
  * If House gets destroyed Kitchen also will be destroyed with that House, This is composition.
  * In composition reference class (Kitchen) can not exist if container class (House) gets destroyed.
  * 
  * Reference class has its own existence even if Container class gets destroyed in Aggregation.
  * Reference class can exist with Container class in Composition.
 */

public class TestRelationship {
	public static void main(String[] args) {
		Dell oDell = new Dell();
		if (oDell instanceof Laptop) {
			System.out.println("Dell IS-A Laptop.");
		}
		if (oDell instanceof Formatable) {
			System.out.println("Dell IS-A Formatable.");
		}
		
		// Test HAS-A
		new UseDell().save("This will be stored in segate.");
	}
}
