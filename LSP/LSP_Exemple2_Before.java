public class LSP_Exemple2_Before {

    static class Rectangle {
        protected int width = 0;
        protected int height = 0;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return width * height;
        }
    }

    static class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }

        @Override
        public void setHeight(int height) {
            this.width = height;
            this.height = height;
        }
    }

    // Méthode de test qui attend un vrai rectangle
    public static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        if (r.getArea() == 20) {
            System.out.println("OK : aire = 20");
        } else {
            System.out.println("BUG : aire = " + r.getArea() + " au lieu de 20");
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        testRectangle(rect);                    // OK

        Rectangle square = new Square();
        testRectangle(square);                  // BUG ! Affiche 16
    }
}