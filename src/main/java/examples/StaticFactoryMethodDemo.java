package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin5
 * @since 2023年01月08日 20:20:02
 */
public class StaticFactoryMethodDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-method.xml");
        Object clientService = context.getBean("clientService");
        System.out.println(clientService);
    }
}
