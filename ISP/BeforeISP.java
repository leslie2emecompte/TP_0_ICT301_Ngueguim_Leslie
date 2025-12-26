public class BeforeISP {

    // Interface trop grosse
    interface Worker {
        void work();
        void eat();
    }

    // Humain : OK pour les deux méthodes
    static class HumanWorker implements Worker {
        @Override
        public void work() {
            System.out.println("L'humain travaille dur.");
        }

        @Override
        public void eat() {
            System.out.println("L'humain mange pendant la pause.");
        }
    }

    // Robot : ne mange pas → méthode inutile ou exception
    static class RobotWorker implements Worker {
        @Override
        public void work() {
            System.out.println("Le robot travaille 24h/24 sans fatigue.");
        }

        @Override
        public void eat() {
            // Mauvaise pratique : méthode vide ou exception
            throw new UnsupportedOperationException("Les robots ne mangent pas !");
        }
    }

    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // ← Décommenter pour voir l'exception
    }
}