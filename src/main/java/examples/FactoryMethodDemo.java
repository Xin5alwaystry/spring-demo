package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin5
 * @since 2023年01月08日 20:20:02
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-method.xml");
        //静态工厂方法实例化bean
        //Object clientService = context.getBean("clientService");
        //System.out.println(clientService);

        //实例工厂方法实例化bean
        Object first = context.getBean("first");
        System.out.println(first);
        Object second = context.getBean("second");
        System.out.println(second);
    }
}
