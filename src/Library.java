public class Library {

    Book[] books = new Book[10];
    int len;

    public void addBooks(Book book) {
        if (len < books.length) {
            books[len] = book;
            len++;
        }
    }
    public void removeBooks(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books != null && bookName == books[i].name) {
                books[i] = null;

                for (int j = 0; j < len+1; j++) {
                    books[i] = books[i+1];
                }
                break;


            }
        }
        len--;
    }
    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.println(i + 1 + " ");
            if (books != null)
                books[i].print();
            System.out.println();
        }
    }
}
