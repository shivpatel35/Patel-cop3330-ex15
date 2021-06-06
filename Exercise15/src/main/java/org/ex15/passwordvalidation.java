package org.ex15;

import java.util.Scanner;

public class passwordvalidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Scanner scanner2 =  new Scanner(System.in);

        System.out.print("What is your username?");
        String username = scanner.nextLine();

        System.out.print("What is the password? ");
        String password = scanner.nextLine();

        if(password.equals("abc$123")){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
