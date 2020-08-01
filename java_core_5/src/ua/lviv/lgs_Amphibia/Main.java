package ua.lviv.lgs_Amphibia;

public class Main 
{
	public static void main(String[] args)
	{
		Amphibia frog2 = new Frog();
		
		frog2.eat();
		frog2.sleep();
		frog2.walk();
		frog2.swim();
		
		System.out.println();
		
		//Homework for Java_Core_22
		Action eat = () -> System.out.println("I eat");
		frog2.action(eat);
		Action sleep = () -> System.out.println("I sleep");
		frog2.action(sleep);
		Action walk = () -> System.out.println("I walk");
		frog2.action(walk);
		Action swim = () -> System.out.println("I swim");
		frog2.action(swim);
	}
}

interface Action
{
	public void action();
}