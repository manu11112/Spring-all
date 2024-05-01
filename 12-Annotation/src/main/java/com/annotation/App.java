package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        Car car= context.getBean("car",Car.class);
        car.carStarted();
    }
}
