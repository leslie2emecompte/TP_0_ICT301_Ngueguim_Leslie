public class LSP_Exemple1_Before {

    static class Rectangle {
        protected int width;
        protected int height;

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
            this.height = width;  // Force le carré
        }

        @Override
        public void setHeight(int height) {
            this.width = height;
            this.height = height; // Force le carré
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Aire attendue : 20, mais on obtient : " + rect.getArea());
        // Résultat : 16 au lieu de 20 → BUG !
    }
}