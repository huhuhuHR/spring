package chapter3.annotation1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeatMain {
    @Test
    public void teatOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation2.xml");
        Guitar guitar = context.getBean("guitar", Guitar.class);
        assert guitar != null;
        guitar.play();
    }

    @Test
    public void testTwo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation2.xml");
        Guitar guitar = context.getBean("guitar", Guitar.class);
        assert guitar != null;
        Guitar guitar1 = context.getBean("performGuitar", Guitar.class);
        assert guitar1 != null;
        guitar1.play();
        // xml 和配置的@bean不是一个
        assert guitar != guitar1;
        Guitar guitar2 = context.getBean("performGuitar", Guitar.class);
        // 依旧是单例
        assert guitar1 == guitar2;
    }
}
