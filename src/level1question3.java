import java.util.Scanner;
public class Level1Question3{
public static double roundsToComplete5Km(double side1,double side2,double side3){double perimeter=side1+side2+side3;return 5000.0/perimeter;}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("Enter side1 (meters): ");
double side1=input.nextDouble();
System.out.print("Enter side2 (meters): ");
double side2=input.nextDouble();
System.out.print("Enter side3 (meters): ");
double side3=input.nextDouble();
if(side1<=0||side2<=0||side3<=0){System.out.println("Invalid side lengths.");input.close();return;}
double rounds=roundsToComplete5Km(side1,side2,side3);
System.out.println("Number of rounds to complete 5 km is "+rounds);
input.close();
}
}