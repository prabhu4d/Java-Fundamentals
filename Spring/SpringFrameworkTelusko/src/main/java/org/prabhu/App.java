package org.prabhu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Dependency Injection");
        /*
        * main class depend on car and bike, that is dependent
        *
        * we make it independent of that class, by Dependency Injection
        *
        Car car = new Car();
        car.drive();
        Bike bullet = new Bike();
        bullet.drive();

        * */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Vehicle vehicle = (Vehicle) context.getBean("bike");
//        vehicle.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);

//        Car car = (Car) context.getBean("car");
//        car.drive();


        // Annotation based configuration
        // Spring Core Annotations
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);


        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
