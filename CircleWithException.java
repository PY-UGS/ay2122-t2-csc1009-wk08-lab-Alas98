import java.util.Scanner;
import static java.lang.Math.PI;

public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

public CircleWithException(double radius){
    this.radius = radius;
}

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = PI * radius * radius;
        return area;

    }

    public double getDiameter() {
        double diameter = radius + radius;
        return diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter the radius of a circle: ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius); //declare circle for future use
            double area = circle.getArea();
            double diameter = circle.getDiameter();

            System.out.println("Radius of circle is : " + circle.getRadius() );
            System.out.println("Area of circle is : " + circle.getArea() );
            System.out.println("Diameter of circle is : " + circle.getDiameter() );

            if (radius <0 ){
                throw new IllegalArgumentException();
            }
            if (area > 1000){
                throw new Exception();
            }

        }
        catch (IllegalArgumentException e) {
            System.out.println("Radius must be greater than 0!");
        }
        catch (Exception e){
            System.out.println("Area cannot be greater than 1000!");
        }
    }
}
