package Oops;

public class day7B_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog moti = new Dog();
		moti.makeSound();
		moti.type();
		
		Cat manu =  new Cat();
		manu.type();
		manu.makeSound();
	}
	}

//abstract class can have abstract as well as normal method

abstract class Animals{
	public abstract void makeSound();
	public void type() {
		System.out.println("i am of animal type");
	}
}

 class Dog extends Animals{

	@Override
	public void makeSound() {
System.out.println("bow bow");		
	}
}
 
 class Cat extends Animals {

		@Override
		public void makeSound() {
			System.out.println("meow meow");
			
		}
		
	}