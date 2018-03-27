package chapter2;

public class Instrument {
    private double price;
    private Song song;
    private Author author;

    public Instrument() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "price=" + price +
                ", song=" + song +
                ", author=" + author +
                '}';
    }
}
