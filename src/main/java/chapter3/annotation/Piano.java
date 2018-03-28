package chapter3.annotation;

import org.springframework.beans.factory.annotation.Value;
@StringedInstrument
public class Piano implements Instrument {
    @Value("I am piano")
    private String name;

    @Override
    public String toString() {
        return "Piano{" +
                "name='" + name + '\'' +
                '}';
    }
}
