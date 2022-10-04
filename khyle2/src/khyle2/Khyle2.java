/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khyle2;

import java.util.Scanner;

/**
 *
 * @author Reyes_CPE112
 */
public class Khyle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("press 1 if you wan to proceed");
        int s = input.nextInt();
        int x = 0;

        while (s == 1) {
            System.out.println("Calulator:          1");
            System.out.println("Odd/Even Checker:   2");
            x = input.nextInt();
            switch (x) {

                case 1:

                    double x1;
                    double x2;
                    String x3;

                    System.out.println("Welcome to Khyle's Calculator");
                    System.out.println("Please enter 2 numbers");

                    while (true){
                        System.out.println("Enter your first number:");
                        x1 = input.nextDouble();
                        System.out.println("Enter your second number:");
                        x2 = input.nextDouble();
                        System.out.println("Please enter your desired operation:");
                        x3 = input.next();

                        if (x3.equals("+")) {
                            System.out.println(x1 + x2);
                            
                        } else if (x3.equals("-")) {
                            System.out.println(x1 - x2);
                            
                        } else if (x3.equals("*")) {
                            System.out.println(x1 * x2);
                            
                        } else if (x3.equals("/")) {
                            System.out.println(x1 / x2);
                            
break;
                        }

                    }

                case 2:
                    System.out.println("Check if it's Odd or Even");
                    double x4 = input.nextDouble();
                    if (x4 % 2 == 0) {
                        System.out.println("Even Number");
                    } else {
                        System.out.println("Odd Number");
                    }

                    break;
            }
            System.out.println("Do you want to try again?");
            System.out.println("If yes then enter 1");
            System.out.println("If no then enter 2");
            s = input.nextInt();

        }
    }
}
