package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SenseFour {
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "SenseFour{" +
                "person=" + person +
                '}';
    }
}
