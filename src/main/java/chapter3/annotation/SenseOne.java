package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 场景一：set方法上的自动注入
 * 
 * setPerson(Person person)
 * 
 * 注入给方法的参数person
 */
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
