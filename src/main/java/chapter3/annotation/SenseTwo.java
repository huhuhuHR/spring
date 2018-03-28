package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SenseTwo {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        System.out.println("SenseTwo1");
        this.person = person;
    }

    @Autowired
    public void anyFunction(Person person) {
        System.out.println("SenseTwo2");
        this.person = person;
    }

    @Override
    public String toString() {
        return "SenseTwo{" + "person=" + person + '}';
    }
}
