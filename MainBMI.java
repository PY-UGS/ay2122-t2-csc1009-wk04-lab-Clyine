import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double w = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double h = input.nextDouble();
        input.close();
        
        BMI person = new BMI(w, h);
        System.out.println("BMI is " + person.getBmi());
        System.out.println(person.getBmiclass());
    }
}
