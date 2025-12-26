public class AfterSRP {

    // Classe dédiée aux données du livre (une seule responsabilité)
    static class Book {
        private String title;
        private String author;
        private String content;

        public Book(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getContent() { return content; }
    }

    // Classe dédiée à l'affichage
    static class BookPrinter {
        public void printToScreen(Book book) {
            System.out.println("=== Affichage à l'écran ===");
            System.out.println("Titre : " + book.getTitle());
            System.out.println("Auteur : " + book.getAuthor());
            System.out.println("Contenu : " + book.getContent());
        }
    }

    // Classe dédiée à la persistance
    static class BookRepository {
        public void saveToDatabase(Book book) {
            System.out.println("Sauvegarde du livre '" + book.getTitle() + "' en base de données...");
        }
    }

    // Classe dédiée à la logique métier
    static class BookService {
        public void borrowBook(Book book, String borrower) {
            System.out.println("Le livre '" + book.getTitle() + "' a été emprunté par " + borrower);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Principes SOLID", "Robert C. Martin", "Contenu du livre sur la bonne conception...");

        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);

        BookRepository repo = new BookRepository();
        repo.saveToDatabase(book);

        BookService service = new BookService();
        service.borrowBook(book, "Leslie");
    }
}