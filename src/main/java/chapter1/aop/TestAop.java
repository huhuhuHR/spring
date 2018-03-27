package chapter1.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext contenxt = new ClassPathXmlApplicationContext("chapter1.xml");
        Quest quest = contenxt.getBean("quest",Quest.class);
        quest.kill();
    }
}
