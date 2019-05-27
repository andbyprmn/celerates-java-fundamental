/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author ACER
 */
public class Account {
    public String accountnumber;
    public int balance;
    public String customername;
    public String email;
    public String phonenumber;
    
    public void deposit (double depositAmount){
        this.balance += depositAmount;
    }
    public void withdraw (double depositWithdraw){
        if(this.balance-depositWithdraw<=0){
            System.out.print("Rekening Anda Hanya Tersisa" + balance + "rupiah. Silahkan masukan angka lain");
        }else {
                   // this.balance-depositWithdraw >0;
                                        
                      
                    }
        
    }
    
    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
  
    
}
