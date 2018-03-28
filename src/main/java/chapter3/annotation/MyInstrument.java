package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyInstrument {
    @Autowired
    @Qualifier("piano")
    private Instrument instrument1;
    @Autowired
    @Qualifier("huhuhuHR")
    private Instrument instrument2;
    @Autowired
    @StringedInstrument
    private Instrument instrument3;

    @Override
    public String toString() {
        return "MyInstrument{" +
                "instrument1=" + instrument1 +
                ", instrument2=" + instrument2 +
                ", instrument3=" + instrument3 +
                '}';
    }
}
