import java.util.Scanner;
import javax.swing.JOptionPane;
public class bankapp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance =0;
        while(true) {
            System.out.println("Welcome to banking system!");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposite Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Exit");

            System.out.print("Enter the your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("your Balance is:" + balance);
                    break;
                case 2:
                    System.out.print("Enter money you want:");
                    double money = scanner.nextDouble();
                    if (money > 0) {
                        balance += money;
                        System.out.println("your new balance is: " + balance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (balance > withdraw) {
                        balance -= withdraw;
                        System.out.println("This is your new balance:" + balance);
                    } else {
                        System.out.println("you have Entered more than balance, your balance is:" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice, Please Try again!!");
            }
        }
    }
}
