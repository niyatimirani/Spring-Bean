package becoder.First_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
  	ApplicationContext context = new ClassPathXmlApplicationContext("becoder/First_spring/config.xml");
   	Student st1 = context.getBean("st1", Student.class);
   	System.out.println(st1);
//    	ram.eat();
//    	ram.sleep();
//    	System.out.println(System.getProperty("java.class.path"));

    }
}
