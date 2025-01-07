package springbean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.*;
import org.springframework.context.support.AbstractApplicationContext;


public class App {
    public static void main(String[] args) {
    	
    	
//    	With this code only init method has been start 
//  	ApplicationContext context = new ClassPathXmlApplicationContext("springbean/config.xml");
//   	BeanLifeCycle st1 = context.getBean("st1", BeanLifeCycle.class);
//   	System.out.println(st1);

    	
//    	to start destroy as well we have to use this
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbean/config.xml");
    	context.registerShutdownHook();
       	BeanLifeCycle st1 = context.getBean("st1", BeanLifeCycle.class);
       	System.out.println(st1);
    	
    }
}
