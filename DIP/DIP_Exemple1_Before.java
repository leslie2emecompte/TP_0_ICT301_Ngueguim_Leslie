public class DIP_Exemple1_Before {

    // Détails bas niveau
    static class CsvFileLoader {
        public String loadData(String filePath) {
            System.out.println("Chargement des données depuis CSV : " + filePath);
            return "Données brutes";
        }
    }

    static class DatabaseGateway {
        public void saveData(String data) {
            System.out.println("Sauvegarde en base de données : " + data);
        }
    }

    // Haut niveau dépend directement des détails bas niveau
    static class DataImporter {
        private CsvFileLoader loader = new CsvFileLoader();
        private DatabaseGateway gateway = new DatabaseGateway();

        public void importFromFile(String filePath) {
            String data = loader.loadData(filePath);
            gateway.saveData(data);
        }
    }

    public static void main(String[] args) {
        DataImporter importer = new DataImporter();
        importer.importFromFile("donnees.csv");
    }
}