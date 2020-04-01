import java.util.Scanner;
public class Bmi{
    public static void main(string args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nInput height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
 
    }
}