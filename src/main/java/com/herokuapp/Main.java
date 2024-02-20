package com.herokuapp;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір NxN: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, scanner);
        printRowSums(matrix);
        printMainDiagonal(matrix);

        scanner.close();


    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printRowSums(int[][] matrix) {
        System.out.println("Суми елементів в кожному рядку:");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Рядок " + (i + 1) + ": " + sum);
        }
    }
    public static void printMainDiagonal(int[][] matrix) {
        System.out.print("Елементи головної діагоналі: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}
