package org.objects;

public class Square extends Shape {
    private Double side;

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(Double side) {
        this.side = side;
    }


    @Override
    Double perimeter() {
        return 4 * getSide();
    }

    @Override
    Double area() {
        return getSide() * getSide();
    }
}
