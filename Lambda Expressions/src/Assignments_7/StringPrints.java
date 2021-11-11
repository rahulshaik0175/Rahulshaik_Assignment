package Assignments_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StringPrints
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		Consumer<String> letter=(s)->
		{
			sb.append(s.charAt(0)); 
		};
		List<String> li=new ArrayList<>();
		li.add("Rahul");
		li.add("Shaik");
		li.add("Mallikaruna");
		li.add("Jaswanth");
		for (Iterator<String> iterator = li.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
			letter.accept(string);
			
		}
        System.out.println("-----");
		System.out.println(sb);
		System.out.println("-----");
	}
}