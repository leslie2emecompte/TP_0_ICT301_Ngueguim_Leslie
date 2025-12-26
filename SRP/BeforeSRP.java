public class BeforeSRP {

    static class Book {
        private String title;
        private String author;
        private String content;

        public Book(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }

        // Getters
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getContent() { return content; }

        // Responsabilité 1 : Affichage (présentation)
        public void printToScreen() {
            System.out.println("=== Affichage à l'écran ===");
            System.out.println("Titre : " + title);
            System.out.println("Auteur : " + author);
            System.out.println("Contenu : " + content);
        }

        // Responsabilité 2 : Persistance
        public void saveToDatabase() {
            System.out.println("Sauvegarde du livre '" + title + "' en base de données...");
            // Simulation de sauvegarde
        }

        // Responsabilité 3 : Logique métier
        public void borrowBook(String borrower) {
            System.out.println("Le livre '" + title + "' a été emprunté par " + borrower);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Principes SOLID", "Robert C. Martin", "Contenu du livre sur la bonne conception...");
        book.printToScreen();
        book.saveToDatabase();
        book.borrowBook("Leslie");
    }
}