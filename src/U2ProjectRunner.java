import java.util.Scanner;
public class U2ProjectRunner {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Welcome to notDesmos, enter your first coordinate point (x,y): ");
        String input1 = s.nextLine();
        System.out.print("Enter your second coordinate point (as (x,y): ");
        String input2 = s.nextLine();
        LinearEquation a = new LinearEquation(input1, input2);;
        System.out.println(a.toString());
        System.out.print(System.lineSeparator() + "Enter an x value: ");
        int x = s.nextInt();
        System.out.println("(" + x + "," + Double.toString(a.yCalc(x)) + ")");
    }
}
