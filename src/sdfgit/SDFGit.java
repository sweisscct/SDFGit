/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdfgit;

import java.util.Scanner;

/**
 *
 * @author Lecturer
 */
public class SDFGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("What is your first number?");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("What is your second number?");
        int num2 = sc.nextInt();
        System.out.println("Thanks for doing some maths!");


        final double G = 0.0000000000667;
        double M1 = 1000;
        double M2 = 500;
        double R = 1000;
        double F = G*M1*M2/(R*R);
        System.out.println("The force is: " + F);
        System.out.println("Thank you for doing Physics!");

    }

}
