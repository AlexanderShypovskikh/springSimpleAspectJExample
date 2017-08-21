package shypovskih.springAspectJ.loggin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shypovskikh.SpringAspectJ.service.SomeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
     ApplicationContext app = new ClassPathXmlApplicationContext("ApplContext.xml");
     SomeService service = (SomeService)app.getBean("someService");
     System.out.println(service.getDoubleValue());
    }
}
