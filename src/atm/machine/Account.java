/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author codefeak
 */
public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'€'###,##0,00");
    
    // Set Customer Number
    public int setCustomerNumber (int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    
    // Get the customer Number
    public int getCustomerNumber (){
       return customerNumber;
    }
    
    // Set the pin Number
    
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    
    // Get a pin Number
    public int getPinNumber(){
        return pinNumber;
    }
    
    //Get Checking Account Balance
    public double getCheckingBalance(){
        return checkingBalance;
    }
    
    // Get Saving Account Balance
    public double getSavingBalance(){
        return savingBalance;
    }
    
    //Calculate Checking Accout Withdrawl
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    
    //Calculate Saving Account Withdrawl
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    
    // Customer Checing Amount Withdraw input
    
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
                double amount = input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    
    // Customer Saving Amount Withdraw input
    
     public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
                double amount = input.nextDouble();
        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving  Account balance: "+ moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
     
     // Customer Checking Account Deposit
     
     public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit to Checking Account: ");
                double amount = input.nextDouble();
        if((checkingBalance + amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
     
     // Customer Savingn Account Deposit
      public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
                double amount = input.nextDouble();
        if((savingBalance + amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving  Account balance: "+ moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
      
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}
