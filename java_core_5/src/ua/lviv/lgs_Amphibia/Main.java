package ua.lviv.lgs_Amphibia;

public class Main 
{
	public static void main(String[] args)
	{
		Frog frog1 = new Frog();
		Amphibia frog2 = (Amphibia) frog1;
		
		frog2.eat();
		frog2.sleep();
		frog2.walk();
		frog2.swim();
	}
}
