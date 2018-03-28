package chapter3.annotation1;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

//@Component("myGuitar")
public class Guitar implements Instrument {
    @Value("huhuhuHr")
    private String name;

    public void play() {
        System.out.println("Strum Strum Strum" + this.name);
    }

    public Guitar() {
    }


    @Override
    public String toString() {
        return "Guitar{" + "name='" + name + '\'' + '}';
    }
}
