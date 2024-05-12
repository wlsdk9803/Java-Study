package oop1.ex;

public class Rectangle {
    int width;
    int height; //속성과

    int calculateArea() { // 기능
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return width == height;
    }
}