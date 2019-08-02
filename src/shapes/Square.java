package shapes;

import shapes.Quadrilateral;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}

