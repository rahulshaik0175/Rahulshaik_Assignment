package Spring.SpringCoreAssignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
    {
		@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("Assignment10.xml");
        ApplicationClass n = (ApplicationClass) context.getBean("noob");
       
        
        Build a = (Build) context.getBean("pro");
        a.Slow();
	}

}