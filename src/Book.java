public class Book {
    String name;
    String author;
    int publicationYear;

    public void print() {
        System.out.println("name = " + name + " author = " + author);
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
