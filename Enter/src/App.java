// Compound Interest Calculator

// Library for get data from user
import java.util.Scanner;

public class App {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Compound Interest Calculator");
    
    // Variables
    double pMoney;
    double rPercent;
    double yPercent;
    double tYears;

    // Labels for get data from user
    System.out.print("Enter the principal amount:");
    pMoney = scanner.nextDouble();
     
    System.out.print("Enter the interest rate (in %):");
    rPercent = scanner.nextDouble();

    System.out.print("Enter the # of times compounded per year:");
    yPercent = scanner.nextDouble();

    System.out.print("Enter the # of years:");
    tYears = scanner.nextDouble();
     
    double aMoney = 0;
    aMoney = pMoney * (1 + rPercent/yPercent);




    scanner.close();
    }
}
