import java.util.Scanner;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double similarTo(Triangle t) {
        if ((t.getA() / this.a == t.getB() / this.b) && ((t.getB() / this.b) == (t.getC() / this.c)))
            return t.getA() / this.a;
        else {
            return 0;
        }
    }

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean keepOn = true;
        while (keepOn) {
            System.out.println("Triangle 1! Enter 3 Edges");
            Triangle t1 = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
            System.out.println("Triangle 2! Enter 3 more Edges");
            Triangle t2 = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
            if (t1.similarTo(t2) == 0) {
                System.out.println("The triangles are not similar. Try again!");
            } else {
                System.out.println("The triangles are similar. The ratio of similarity is: " + (t1.getA() / t2.getA()));
                keepOn = false;
            }
        }
    }
}

