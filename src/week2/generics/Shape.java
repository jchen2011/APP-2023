package week2.generics;

public abstract class Shape implements Comparable<Square> {
    public abstract double area();

    public abstract double perimeter();

    public double semipermiter() {
        return perimeter() / 2;
    }

}
