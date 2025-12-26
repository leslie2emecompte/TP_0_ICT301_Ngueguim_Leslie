public class BeforeOCP {

    // Classes de formes
    static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() { return width; }
        public double getHeight() { return height; }
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() { return radius; }
    }

    // Calculatrice qui doit être MODIFIÉE à chaque nouvelle forme
    static class AreaCalculator {
        public double calculateArea(Object shape) {
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape;
                return rect.getWidth() * rect.getHeight();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                return Math.PI * circle.getRadius() * circle.getRadius();
            } else {
                throw new IllegalArgumentException("Forme inconnue");
            }
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rect = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Aire rectangle : " + calculator.calculateArea(rect));
        System.out.println("Aire cercle : " + calculator.calculateArea(circle));
    }
}