import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {

        System.out.print("Enter Temperature In Fahrenheit °F: ");

        Scanner sc = new Scanner(System.in);
        Float Fahrenheit = sc.nextFloat();

        // Formula to convert Fehrenheit to celsius
        Float celsius = (Fahrenheit - 32) * 5 / 9;

        System.out.println("The Temperature in Celsius is: " + celsius + "° C");

    }
}