public class Main {
    public static void main(String[] args) {
        Books();
    }

    public static void Books() {
        Library library = new Library();
        Book b = new Book("book1", "Someone");
        Book b1 = new Book("book2", "Brother");
        Book b2 = new Book("book3", "My last cousin");
        Book b3 = new Book("book4", "My another cousin");
        Book b4 = new Book("book5", "My cousin");
        Book b5 = new Book("book6", "My grandmother");
        Book b6 = new Book("book7", "My grandfather");
        Book b7 = new Book("book8", "My sister");
        Book b8 = new Book("book9", "My dad");
        Book b9 = new Book("book10", "My mom");
        library.addBooks(b);
        library.addBooks(b1);
        library.addBooks(b2);
        library.addBooks(b3);
        library.addBooks(b4);
        library.addBooks(b5);
        library.addBooks(b6);
        library.addBooks(b7);
        library.addBooks(b8);
        library.addBooks(b9);

        library.removeBooks("qwe");
        library.removeBooks("book9");
        library.removeBooks("book4");

        library.print();
    }
}