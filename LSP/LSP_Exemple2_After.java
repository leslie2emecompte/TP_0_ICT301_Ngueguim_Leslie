public class LSP_Exemple2_After {

    interface Quadrilateral {
        int getArea();
    }

    static class Rectangle implements Quadrilateral {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) { this.width = width; }
        public void setHeight(int height) { this.height = height; }

        public int getArea() {
            return width * height;
        }
    }

    static class Square implements Quadrilateral {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getArea() {
            return side * side;
        }
    }

    public static void testShape(Quadrilateral q) {
        // On ne peut plus faire setWidth/setHeight sur n'importe quel Quadrilateral
        // → on évite le bug dès la conception
        System.out.println("Aire : " + q.getArea());
    }

    public static void main(String[] args) {
        Quadrilateral rect = new Rectangle(5, 4);
        Quadrilateral square = new Square(5);

        System.out.println("Rectangle : " + rect.getArea());  // 20
        System.out.println("Carré : " + square.getArea());     // 25
    }
}