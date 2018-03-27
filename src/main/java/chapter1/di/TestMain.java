package chapter1.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter1.xml");
        BetterKnight betterKnight = context.getBean("knightBetter", BetterKnight.class);
        betterKnight.doSomething();
    }
}
