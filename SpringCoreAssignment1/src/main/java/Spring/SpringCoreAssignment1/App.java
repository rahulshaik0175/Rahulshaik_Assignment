package Spring.SpringCoreAssignment1;

/**
 * Hello world!
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("First.xml");
	Address ad=(Address)context.getBean("Address");
	System.out.println(ad);
	Customer sc=(Customer)context.getBean("Customer");
	System.out.println(sc);
	
  } 
}