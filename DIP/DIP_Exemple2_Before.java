public class DIP_Exemple2_Before {

    static class MySQLDatabase {
        public void saveOrder(String order) {
            System.out.println("Sauvegarde de la commande dans MySQL : " + order);
        }
    }

    // Haut niveau dépend directement de MySQL
    static class OrderProcessor {
        private MySQLDatabase database = new MySQLDatabase();

        public void process(String order) {
            // Logique métier...
            database.saveOrder(order);
        }
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.process("Commande #123");
    }
}