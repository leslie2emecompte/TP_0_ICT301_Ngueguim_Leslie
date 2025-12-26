public class DIP_Exemple2_After {

    // Abstraction
    interface Database {
        void saveOrder(String order);
    }

    // Implémentations concrètes
    static class MySQLDatabase implements Database {
        @Override
        public void saveOrder(String order) {
            System.out.println("Sauvegarde dans MySQL : " + order);
        }
    }

    static class MongoDatabase implements Database {
        @Override
        public void saveOrder(String order) {
            System.out.println("Sauvegarde dans MongoDB : " + order);
        }
    }

    // Haut niveau dépend de l'abstraction
    static class OrderProcessor {
        private Database database;

        public OrderProcessor(Database database) {
            this.database = database;
        }

        public void process(String order) {
            // Logique métier...
            database.saveOrder(order);
        }
    }

    public static void main(String[] args) {
        OrderProcessor processor1 = new OrderProcessor(new MySQLDatabase());
        processor1.process("Commande #123");

        OrderProcessor processor2 = new OrderProcessor(new MongoDatabase());
        processor2.process("Commande #456");
    }
}