public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(29.99, "Effective Java", "Joshua Bloch");
        Book book2 = new Book(39.99, "Clean Code", "Robert C. Martin");

        System.out.println("Book 1: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Price: $" + book1.getPrice());
        System.out.println("Book 2: " + book2.getTitle() + ", Author: " + book2.getAuthor() + ", Price: $" + book2.getPrice());
    
    }
}
