import java.util.Scanner;
public class Level1Question2{
public static long maxHandshakes(int n){return(long)n*(n-1)/2;}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("Enter number of students: ");
int numberOfStudents=input.nextInt();
if(numberOfStudents<0){System.out.println("Invalid number of students.");input.close();return;}
long handshakes=maxHandshakes(numberOfStudents);
System.out.println("The maximum number of possible handshakes is "+handshakes);
input.close();
}
}