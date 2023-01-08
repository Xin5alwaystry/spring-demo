package org.springframework.samples;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreServiceImpl;

/**
 * @author xin5
 * @since 2023年01月07日 09:54:45
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        //GenericApplicationContext context = new GenericApplicationContext();
        //new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml");
        //context.refresh();
        PetStoreServiceImpl bean = context.getBean(PetStoreServiceImpl.class);
        System.out.println(bean);
    }
}
