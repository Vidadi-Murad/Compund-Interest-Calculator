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
    int yPercent;
    int tYears;

    // Labels for get data from user
    System.out.print("Enter the principal amount:");
    pMoney = scanner.nextDouble();
     
    System.out.print("Enter the interest rate (in %):");
    rPercent = scanner.nextDouble();

    System.out.print("Enter the # of times compounded per year:");
    yPercent = scanner.nextInt();

    System.out.print("Enter the # of years:");
    tYears = scanner.nextInt();
     
    double aMoney = 0;
    double dailyRate = rPercent / 100;

     
    aMoney = pMoney * Math.pow(1 + dailyRate/yPercent, yPercent * tYears);

    System.out.printf("The Balance is: $%.2f", aMoney);
    

    scanner.close();
    }
}