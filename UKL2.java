/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class UKL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = {"*", "/", "%"};
        boolean isRunning = true;

        while (isRunning) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            String operator = operators[random.nextInt(operators.length)];

            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            double userAnswer = scanner.nextDouble();
            double correctAnswer = 0;

            switch (operator) {
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    correctAnswer = (double) num1 / num2;
                    break;
                case "%":
                    correctAnswer = num1 % num2;
                    break;
            }

            if (Math.abs(userAnswer - correctAnswer) < 0.0001) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah, jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Ingin melanjutkan kuis? (ya/tidak): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("tidak")) {
                isRunning = false;
            }
        }

        scanner.close();
        System.out.println("Terima kasih telah bermain!");
    }
}

    

