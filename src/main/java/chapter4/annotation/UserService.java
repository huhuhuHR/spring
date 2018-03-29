package chapter4.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    @LogAnnotation(desc = "this is user service")
    public void add() {
        System.out.println("user service add");
    }

    public void delete() {
        System.out.println("user service delete");
    }

    public void update(String message) {
        System.out.println("user service" + message);
    }
}
