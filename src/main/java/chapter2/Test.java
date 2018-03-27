package chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2.xml");
        Instrument instrument = context.getBean("instrument", Instrument.class);
        System.out.println(instrument);
        Context myContext = context.getBean("context", Context.class);
        System.out.println(myContext);
    }
}
