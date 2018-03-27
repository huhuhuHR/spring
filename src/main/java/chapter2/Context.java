package chapter2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Context {
    private List<String> stringList;
    private List<Instrument> instrumentList;
    private Set<Integer> integerSet;
    private Map<String, String> stringMap;
    private Properties properties;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<Integer> getIntegerSet() {
        return integerSet;
    }

    public void setIntegerSet(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Instrument> getInstrumentList() {
        return instrumentList;
    }

    public void setInstrumentList(List<Instrument> instrumentList) {
        this.instrumentList = instrumentList;
    }

    @Override
    public String toString() {
        return "Context{" +
                "stringList=" + stringList +
                ", instrumentList=" + instrumentList +
                ", integerSet=" + integerSet +
                ", stringMap=" + stringMap +
                ", properties=" + properties +
                '}';
    }
}
