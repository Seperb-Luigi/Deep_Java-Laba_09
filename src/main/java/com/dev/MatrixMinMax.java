package com.dev;

import java.util.Random;

public class MatrixMinMax {
    public static void main(String[] args) {
        int N = 4; // Розмір матриці
        double[][] matrix = new double[N][N];

        // Генерація матриці випадкових чисел
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = -50 + rand.nextDouble() * 100; // Числа в діапазоні [-50, 50]
            }
        }

        // Вивід матриці
        System.out.println("Матриця:");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }

        // Знаходження мінімального і максимального елементів за один прохід
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                double value = matrix[i][j];
                if (value < min) min = value;
                if (value > max) max = value;
            }
        }

        // Результат
        System.out.printf("\nМінімальний елемент: %.2f\n", min);
        System.out.printf("Максимальний елемент: %.2f\n", max);
    }
}
