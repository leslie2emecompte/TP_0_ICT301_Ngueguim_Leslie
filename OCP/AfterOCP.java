public class AfterOCP {

    // Interface commune
    interface Shape {
        double calculateArea();
    }

    // Chaque forme implémente sa propre logique
    static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // La calculatrice n'a PLUS BESOIN d'être modifiée !
    static class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        System.out.println("Aire rectangle : " + calculator.calculateArea(rect));
        System.out.println("Aire cercle : " + calculator.calculateArea(circle));

        // On pourrait ajouter Triangle, Pentagon, etc. SANS toucher à AreaCalculator !
    }
}