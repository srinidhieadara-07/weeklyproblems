import java.util.Scanner;
public class Level1Question1{
public static double simpleInterest(double principal,double rate,double time){return(principal*rate*time)/100.0;}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("Enter Principal: ");
double principal=input.nextDouble();
System.out.print("Enter Rate: ");
double rate=input.nextDouble();
System.out.print("Enter Time: ");
double time=input.nextDouble();
double si=simpleInterest(principal,rate,time);
System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
input.close();
}
}