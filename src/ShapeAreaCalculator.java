interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(6, 5);

        // 각 도형의 넓이 계산 및 출력
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }
}

