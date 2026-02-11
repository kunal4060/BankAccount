public class BANKACC {
    String name;
    String pancard;
    String aadharcard;
    double balance;
    
       
    // for making a new acc
   
    BANKACC(String name, String pancard, String aadharcard, double balance) {
        this.name = name;
        this.pancard = pancard;
        this.aadharcard = aadharcard;
        this.balance = balance;

    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("total amount now is : " + balance);
    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("balance nahi hai bhai aapake pass");
        }
        else{
            balance = balance - amount;
            System.out.println("aapne nikalne ke bad apke paise hai : " + balance);
        }
    }
    void displaydetails(){
        System.out.println("name : " + name);
        System.out.println("pancard : " + pancard);
        System.out.println("aadharcard : " + aadharcard);
        System.out.println("balance : " + balance);
    }
    
    
}
