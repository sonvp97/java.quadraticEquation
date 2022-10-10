public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1(){
        return (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }

    public double getRoot2(){
        return (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
}
