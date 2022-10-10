import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        if (delta>0){
            System.out.println("The solution of the equation is: x1 = "+x1 + ", x2 = " + x2);
        }else if (delta == 0) {
            System.out.println("The solution of the equation is: x = " + x1);
        }else {
            System.out.println("The equation has no roots");
        }
    }
}