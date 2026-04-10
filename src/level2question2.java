import java.util.Scanner;
public class Level2Question2{
public static long sumRecursive(int n){if(n==0){return 0;}return n+sumRecursive(n-1);}
public static long sumFormula(int n){return(long)n*(n+1)/2;}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a natural number: ");
int n=input.nextInt();
if(n<0){System.out.println("Not a natural number.");input.close();return;}
long recursiveSum=sumRecursive(n);
long formulaSum=sumFormula(n);
System.out.println("Sum using recursion: "+recursiveSum);
System.out.println("Sum using formula: "+formulaSum);
if(recursiveSum==formulaSum){System.out.println("Both results are correct and equal.");}
else{System.out.println("Results are not equal.");}
input.close();
}
}