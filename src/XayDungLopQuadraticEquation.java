import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    double a, b, c;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao gia tri a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao gia tri b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao gia tri c: ");
        double c = scanner.nextDouble();
        XayDungLopQuadraticEquation xayDungLopQuadraticEquation = new XayDungLopQuadraticEquation(a,b,c);
        if (xayDungLopQuadraticEquation.getDiscriminant()>0){
            System.out.print("PT Co 2 nhiem la r1 = "+ xayDungLopQuadraticEquation.getRoot1()+" va r2 = " +xayDungLopQuadraticEquation.getRoot2());
        }else if (xayDungLopQuadraticEquation.getDiscriminant()==0){
            System.out.print("PT co nhiem kep "+ xayDungLopQuadraticEquation.getRoot1());
        }else {
            System.out.print("pt vo nhiem");
        }

    }
    public XayDungLopQuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - (4*this.a*this.c);
        return delta;
    }
    public double getRoot1(){
        double b2 = Math.pow(this.b,2) -(4*this.a*this.c);
        double b3 = Math.pow(b2,0.5);
        double r1 = (-this.b + b3)/(2*this.a);
        return r1;
    }
    public double getRoot2(){
        double b2 = Math.pow(this.b,2)-(4*this.a*this.c);
        double b3 = Math.pow(b2,0.5);
        double r2 = (-this.b - b3)/(2*this.a);
        return r2;
    }
}
