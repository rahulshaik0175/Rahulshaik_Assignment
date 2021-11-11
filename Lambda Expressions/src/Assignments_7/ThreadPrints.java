package Assignments_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ThreadPrints
{
	public static void main(String[] args)
	{
		Consumer<Integer> display = (i)->System.out.println(i);
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		for (Iterator<Integer> iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			display.accept(integer);
		}
		Thread lambdaThread=new Thread();
		lambdaThread.run();	
	}
}