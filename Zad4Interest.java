import java.util.Scanner;
public class Zad4Interest {
    public static void main(String[] args) {
        double sumOfInv;
        double numOfYear;
        double intRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sum of the investment: ");
        sumOfInv = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        numOfYear = scanner.nextDouble();
        System.out.println("Enter the yearly interest rate in percents: ");
        intRate = scanner.nextDouble();
        System.out.printf("Your investment will amount to : %.2f", interestRateCalc(sumOfInv, numOfYear, intRate));

    }

    private static double interestRateCalc(double sumOfInv, double numOfYear, double intRate) {
        return sumOfInv*Math.pow((1+(intRate/100)/12), numOfYear*12);
    }
}
