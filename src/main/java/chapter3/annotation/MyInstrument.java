package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyInstrument {
    // 自动注入并且通过Qualifier来缩减范围，因为Instrument有多个bean的实现类
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
        return "MyInstrument{" + "instrument1=" + instrument1 + ", instrument2=" + instrument2 + ", instrument3="
                + instrument3 + '}';
    }
}
