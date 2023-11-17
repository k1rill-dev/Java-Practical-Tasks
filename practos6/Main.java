package practos6;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int width = 5; int height = 5;
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = generateMatrix(width, height);
        showMatrix(matrix, width, height);
        try{
            System.out.println("Enter column:");
            int col = scanner.nextInt();
            showColumnMatrix(matrix, col);
        }catch (ArrayIndexOutOfBoundsException arrayException){
            System.out.println("There is no column with such index!");
        }catch (InputMismatchException inputException){
            System.out.println("Value must be integer!");
        }
    }
    public static int[][] generateMatrix(int width, int height){
        Random random = new Random();
        int[][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = random.nextInt(1, 20);
            }
        }
        return matrix;
    }
    public static void showMatrix(int[][] matrix, int width, int height){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static void showColumnMatrix(int[][] matrix, int column){
        for (int[] ints : matrix) {
            System.out.println(ints[column]);
        }
    }
}
