public class DIP_Exemple1_After {

    // Abstractions
    interface DataLoader {
        String loadData(String source);
    }

    interface DataStorage {
        void saveData(String data);
    }

    // Implémentations bas niveau
    static class CsvFileLoader implements DataLoader {
        @Override
        public String loadData(String filePath) {
            System.out.println("Chargement depuis CSV : " + filePath);
            return "Données brutes";
        }
    }

    static class DatabaseGateway implements DataStorage {
        @Override
        public void saveData(String data) {
            System.out.println("Sauvegarde en base de données : " + data);
        }
    }

    // Haut niveau dépend des abstractions (injection)
    static class DataImporter {
        private DataLoader loader;
        private DataStorage storage;

        public DataImporter(DataLoader loader, DataStorage storage) {
            this.loader = loader;
            this.storage = storage;
        }

        public void importFromFile(String filePath) {
            String data = loader.loadData(filePath);
            storage.saveData(data);
        }
    }

    public static void main(String[] args) {
        DataImporter importer = new DataImporter(new CsvFileLoader(), new DatabaseGateway());
        importer.importFromFile("donnees.csv");
    }
}