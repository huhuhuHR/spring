package chapter3;

public class Saxophone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Saxophone{" +
                "name='" + name + '\'' +
                '}';
    }
}
