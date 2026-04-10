import java.util.Scanner;
public class Level2Question1{
public static int[]findFactors(int n){
int count=0;
for(int i=1;i<=n;i++){if(n%i==0){count++;}}
int[]factors=new int[count];
int index=0;
for(int i=1;i<=n;i++){if(n%i==0){factors[index]=i;index++;}}
return factors;
}
public static long sumOfFactors(int[]factors){long sum=0;for(int f:factors){sum+=f;}return sum;}
public static double sumOfSquaresOfFactors(int[]factors){double sum=0;for(int f:factors){sum+=Math.pow(f,2);}return sum;}
public static double productOfFactors(int[]factors){double product=1;for(int f:factors){product*=f;}return product;}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a number: ");
int number=input.nextInt();
if(number<=0){System.out.println("Invalid number.");input.close();return;}
int[]factors=findFactors(number);
System.out.println("Factors of "+number+":");
for(int f:factors){System.out.print(f+" ");}System.out.println();
long sum=sumOfFactors(factors);
double sumSquares=sumOfSquaresOfFactors(factors);
double product=productOfFactors(factors);
System.out.println("Sum of factors: "+sum);
System.out.println("Sum of squares of factors: "+sumSquares);
System.out.println("Product of factors: "+product);
input.close();
}
}