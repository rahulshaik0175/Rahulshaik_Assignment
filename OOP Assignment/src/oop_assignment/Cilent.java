package oop_assignment;

//Client.java

public class Cilent 
{
	public static void main(String[] args)
	{
		Persistence fp=new Filepersistence();
		fp.persist();
		Persistence dp=new Datapersistence();
		dp.persist();
	}
}