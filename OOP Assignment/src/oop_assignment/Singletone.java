package oop_assignment;

public class Singletone {

		// Create private attribute that refers to a singleton object
		private static Singletone single=new Singletone();
		
		//Create private constructor that restricts the object to create object
		//outside the class.
		private Singletone()
		{
			
		}
		//Allows us to create and access the object we created.
		public static Singletone getInstance()
		{
			return single;
		}
		public void getInfo()
		{
			System.out.println("In Singletone class...!!!");
		}
		
}