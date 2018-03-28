package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SenseThree {
    private Person person;

    @Autowired
    public SenseThree(Person person) {
        System.out.println("SenseThree1");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "SenseThree{" + "person=" + person + '}';
    }
}
