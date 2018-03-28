package chapter3.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void testOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation1.xml");
        SenseOne senseOne = context.getBean("senseone", SenseOne.class);
        System.out.println(senseOne);
        SenseTwo senseTwo = context.getBean("senseTwo", SenseTwo.class);
        System.out.println(senseTwo);
        SenseThree senseThree = context.getBean("senseThree", SenseThree.class);
        System.out.println(senseThree);
        SenseFour senseFour = context.getBean("senseFour", SenseFour.class);
        System.out.println(senseFour);
    }

    @Test
    public void testTwo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation1.xml");
        MyInstrument myInstrument = context.getBean("myInstrument", MyInstrument.class);
        System.out.println(myInstrument);
    }
}
