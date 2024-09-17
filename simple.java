import java.util.Scanner;
import javax.swing.JOptionPane;
public class simple {
    public static void main(String[]args){
        System.out.println("Hello World!");
        System.out.print("Enter the value you want: ");
        Scanner scanner = new Scanner(System.in);
        String take = scanner.nextLine();
        System.out.println("this is what you have typed: "+take);

        String str = JOptionPane.showInputDialog("Enter your name");
        System.out.println(str);
        JOptionPane.showMessageDialog(null, "your name is "+str);
    }
}
