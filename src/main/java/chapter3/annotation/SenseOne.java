package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SenseOne {
    private Person person;

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(Person person) {
        System.out.println("SenseOne1");
        this.person = person;
    }

    @Override
    public String toString() {
        return "SenseOne{" + "person=" + person + '}';
    }
}
