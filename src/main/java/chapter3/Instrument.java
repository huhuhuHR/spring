package chapter3;

public class Instrument {
    private String name;
    private Saxophone saxophone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Saxophone getSaxophone() {
        return saxophone;
    }

    public void setSaxophone(Saxophone saxophone) {
        this.saxophone = saxophone;
    }

    @Override
    public String toString() {
        return "Instrument{" + "name='" + name + '\'' + ", saxophone=" + saxophone + '}';
    }
}
