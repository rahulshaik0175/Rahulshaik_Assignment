package Spring.SpringCoreAssignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new  ClassPathXmlApplicationContext("Assignment7.xml");
        spel value = context.getBean("spel",spel.class);
        
        System.out.println(value);
	}

}
