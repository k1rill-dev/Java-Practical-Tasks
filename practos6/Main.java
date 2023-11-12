package practos6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int width = 5; int height = 5;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = random.nextInt(1, 20);
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.print("\n");
        }
        try{
            System.out.println("Enter column:");
            int col = scanner.nextInt();
            for (int i = 0; i < width; i++) {
                System.out.println(matrix[i][col]);
            }
        }catch (ArrayIndexOutOfBoundsException arrayException){
            System.out.println("There is no column with such index!");
        } catch (InputMismatchException inputException){
            System.out.println("Value must be integer!");
        }

    }
}
