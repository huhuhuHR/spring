package chapter3.annotation1;

import org.springframework.beans.factory.annotation.Value;

public class Piano implements Instrument {
    @Value("huorong")
    private String name;

    public void play() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "Piano{" + "name='" + name + '\'' + '}';
    }
}
