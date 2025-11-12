public class Book {

    private double price;
    private String title;
    private String author;

    public Book() {
        this.price = 0;
        this.title = "";
        this.author = "";
    }

    public Book(double price, String title, String author) {
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Book(Book bk){
        this.price = bk.price;
        this.title = bk.title;
        this.author = bk.author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
