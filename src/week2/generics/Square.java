package week2.generics;

public class Square extends Shape{
    @Override
    public double area() {
        return 2;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public int compareTo(Square o) {
        return (int) (area() - o.area());
    }
}
