package com.company;
import java.io.*;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter matrix size: ");
        int matrixSize = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter fill character: ");
        char fillCharacter = scanner.next().charAt(0);
        scanner.nextLine();

        char[][] matrix = new char[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {

                if (i >= j && ((i < matrixSize / 2 && j < matrixSize / 2) || (i >= matrixSize / 2 && j >= matrixSize / 2))) {
                    matrix[i][j] = fillCharacter;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
        try {
            FileWriter writer = new FileWriter("result.txt");

            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    writer.write(String.valueOf(matrix[i][j])); // Записуємо значення
                    if (j < matrixSize - 1) {
                        writer.write(" "); // Роздільник між значеннями
                    } else {
                        writer.write(System.lineSeparator()); // Перехід на новий рядок
                    }
                }
            }

            writer.close();
            System.out.println("Запис до файлу завершено.");
        } catch (IOException e) {
            System.err.println("Виникла помилка під час запису до файлу: " + e.getMessage());
        }
    }
}


