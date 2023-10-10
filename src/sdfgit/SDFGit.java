/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdfgit;

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
        final double G = 0.0000000000667;
        double M1 = 1000;
        double M2 = 500;
        double R = 1000;
        double F = G*M1*M2/(R*R);
        System.out.println("The force is: " + F);
        System.out.println("Thank you for doing Physics!");
    }
    
}
