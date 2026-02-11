public class BANKSYS {
    BANKACC[] accounts = new BANKACC[100]; 
    //hamare yaha itne hi accounts ban sakte hai
    int count = 0; 
    void createaccount(String name, String pancard, String aadharcard, double balance){
       accounts[count] = new BANKACC(name, pancard, aadharcard, balance);
       count++;
       System.out.println("aapke acc ab hamare aur aapke ke bich me aaya hai ji");
    }

   
    
}
