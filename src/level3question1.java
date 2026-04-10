import java.util.Random;
public class Level3Question1{
public static int sumHeights(int[]heights){int sum=0;for(int h:heights){sum+=h;}return sum;}
public static double meanHeight(int[]heights){return(double)sumHeights(heights)/heights.length;}
public static int shortestHeight(int[]heights){int min=heights[0];for(int h:heights){if(h<min){min=h;}}return min;}
public static int tallestHeight(int[]heights){int max=heights[0];for(int h:heights){if(h>max){max=h;}}return max;}
public static void main(String[]args){
int[]heights=new int[11];
Random random=new Random();
for(int i=0;i<heights.length;i++){heights[i]=150+random.nextInt(101);}
int sum=sumHeights(heights);
double mean=meanHeight(heights);
int shortest=shortestHeight(heights);
int tallest=tallestHeight(heights);
System.out.println("Heights of players (cm):");
for(int h:heights){System.out.print(h+" ");}System.out.println();
System.out.println("Sum of heights: "+sum);
System.out.println("Mean height: "+mean);
System.out.println("Shortest height: "+shortest);
System.out.println("Tallest height: "+tallest);
}
}