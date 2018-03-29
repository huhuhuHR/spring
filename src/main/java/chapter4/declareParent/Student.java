package chapter4.declareParent;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
    public void sayIdentification() {
        System.out.println("i am student");
    }
}
