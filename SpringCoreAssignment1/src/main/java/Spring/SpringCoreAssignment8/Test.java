package Spring.SpringCoreAssignment8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("Assignment8.xml");
		 
        person myperson = context.getBean("personBean", person.class);
 
        System.out.println("Name= " + myperson.getName());
 
        // Closing the context object.
        context.close();
    }
}
