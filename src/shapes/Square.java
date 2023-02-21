package shapes;

    public class Square extends Quadrilateral {
        protected double sides;

        public Square(double sides) {
            super(sides, sides);
            this.sides = sides;
            this.length = sides;
            this.width = sides;
        }

        /// MEthods

        @Override
        public void setLength(double sides) {
            this.length = sides;
        }

        @Override
        public void setWidth(double sides) {
            this.width = sides;
        }

        @Override
        public double getPerimeter() {
            return sides + sides * 2;
        }

        @Override
        public double getArea() {
            return sides * sides;
        }
    }

