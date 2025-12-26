public class AfterISP {

    // Interfaces petites et ciblées
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    // Humain implémente les deux
    static class HumanWorker implements Workable, Eatable {
        @Override
        public void work() {
            System.out.println("L'humain travaille dur.");
        }

        @Override
        public void eat() {
            System.out.println("L'humain mange pendant la pause.");
        }
    }

    // Robot n'implémente que Workable
    static class RobotWorker implements Workable {
        @Override
        public void work() {
            System.out.println("Le robot travaille 24h/24 sans fatigue.");
        }
        // Pas de méthode eat() → plus de problème !
    }

    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();

        human.work();
        robot.work();

        // Si on veut faire manger l'humain :
        ((Eatable) human).eat();
    }
}