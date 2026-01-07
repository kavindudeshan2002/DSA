/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

// File: RabbitProblem.java
import java.util.Scanner;

public class RabbitProblem {

    // Function to calculate the number of rabbit pairs after n months
    public static long rabbitPairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev = 1; // month 1
        long curr = 1; // month 2

        for (int i = 3; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of months: ");
        int months = sc.nextInt();
        
        long totalPairs = rabbitPairs(months);
        System.out.println("Total rabbit pairs after " + months + " month(s): " + totalPairs);

        sc.close();
    }
}

