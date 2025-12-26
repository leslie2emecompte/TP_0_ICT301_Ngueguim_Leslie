public class LSP_Exemple1_After {

    interface Shape {
        int getArea();
    }

    static class Rectangle implements Shape {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getArea() {
            return width * height;
        }
    }

    static class Square implements Shape {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getArea() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape square = new Square(5);

        System.out.println("Aire rectangle : " + rect.getArea());    // 20
        System.out.println("Aire carré : " + square.getArea());       // 25
        // Plus de surprise : chaque forme se comporte comme attendu
    }
}