package chapter4.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        // userService.delete();
        // userService.add();
        userService.update("huhuuhuhuuhHHH");
    }
}
