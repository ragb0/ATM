/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
    int balance = 5000,withdraw , deposit; 
    Scanner input = new Scanner(System.in);
    while(true)
      {
          System.out.println("choose 1 for Withdraw");
          System.out.println("choose 2 for Deposit");
          System.out.println("choose 3 for check Balance");
          System.out.println("choose 4 for EXIT");
          System.out.println("choose the operation you want to perform:");
         
          int choice = input.nextInt();
    switch(choice) 
    {
        case 1:
          System.out.println("Enter money to be Withdrawn");
          withdraw = input.nextInt();
    if(balance >= withdraw)
    {
        balance = balance - withdraw;
          System.out.println("please collect the money");
    }
    else
    {          
          System.out.println("Insufficiet Balance");
    }
          System.out.println("");
    break;
          
       case 2:
          System.out.println("Enter money to be deposited");
        deposit = input.nextInt();
        balance = balance + deposit;
          System.out.println("Your Money has been successfully deposited");
          System.out.println("");
    break;
       case 3:
          System.out.println("Balance" + balance);
          System.out.println("");
    break;
       case 4:
          System.out.println("0");
          
      

       
    }
         System.out.println("error ");
      }
    }
}
