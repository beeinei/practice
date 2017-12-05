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

    public double compareTo(Triangle t) {
        if ((t.getA() / this.a == t.getB() / this.b) && ((t.getB() / this.b) == (t.getC() / this.c)))
          return t.getA() / this.a;
        else
            return 0;
    }


}

