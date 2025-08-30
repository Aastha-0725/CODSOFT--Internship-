import java.util.Scanner;

public class CurrencyCalculator {
    
    public static void main(String[]args){
        //Sample exchange rates related to USD
        double usdToEur = 0.91;
        double usdToGbp = 0.78;
        double usdToInr = 82.72;
        double usdToJpy = 144.5;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Calculator!");
        System.out.print("Enter amount in USD:");
        double amount = scanner.nextDouble();
        
        System.out.println("Convert to:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");
        System.out.println("3. Indian Rupee (INR)");
        System.out.println("4. Japanese Yen (JYP)");
        System.out.println("Choose option (1-4):");
        int choice = scanner.nextInt();
        
        double convertedAmount = 0;
        String currency = "";
        
        switch (choice) {
            case 1:
                convertedAmount =amount * usdToEur;
                currency = "EUR";
                break;
            case 2:
                convertedAmount = amount * usdToGbp;
                currency = "GBP";
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                currency = "INR";
                break;
            case 4:
                convertedAmount = amount * usdToJpy;
                currency = "JPY";
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        
        System.out.printf("%.2f USD = %.2f %s\n", amount, convertedAmount, currency);
        scanner.close();
    }
}

#output:-
  Welcome to Currency Calculator!
Enter amount in USD:100
Convert to:
1. Euro (EUR)
2. British Pound (GBP)
3. Indian Rupee (INR)
4. Japanese Yen (JYP)
Choose option (1-4):
3
100.00 USD = 8272.00 INR
