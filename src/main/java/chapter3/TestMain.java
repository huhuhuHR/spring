package chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void testByAutoWireByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter3.xml");
        Instrument instrument = context.getBean("instrument", Instrument.class);
        assert "huhuhuHR".equals(instrument.getName());
        Saxophone saxophone = instrument.getSaxophone();
        assert "sssss".equals(saxophone.getName());
        System.out.println(instrument);
        System.out.println(context.getBean("saxophone"));
    }
}
