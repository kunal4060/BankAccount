import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        BANKSYS bank = new BANKSYS();
        System.out.println("Welcome to the BANK application!");
        System.out.println("lo bhai option select karo");
        System.out.println("1. khata banaiye ji");
        System.out.println("2. paise jama karna 00");
        System.out.println("3. paise nikal le bhai");
        System.out.println("4. apne details dekh lo");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        if (option == 1) {
            System.out.println("apka naam kya hai ji");
            String name = sc.next();
            System.out.println("apka pancard number kya hai ji");
            String pancard = sc.next();
            System.out.println("apka aadharcard number kya hai ji");
            String aadharcard = sc.next();
            System.out.println("kitna paisa jama karna chahte ho ji");
            double balance = sc.nextDouble();
            bank.createaccount(name, pancard, aadharcard, balance);
            //ji ki mka

        }
    }

    
}
