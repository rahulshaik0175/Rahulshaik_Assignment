package Spring.SpringCoreAssignment3;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Assign3.xml");
		BankAccount  bac=(BankAccount)context.getBean("BankAccount");
		System.out.println(bac);
		BankAccount  bac1=(BankAccount)context.getBean("BankAccount1");
		System.out.println(bac1);
		
	}

}