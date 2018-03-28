package chapter3.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
@Qualifier("huhuhuHR")
public class Guitar implements Instrument {
    @Value("I am guitar")
    private String name;

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                '}';
    }
}
