package praktos9;

//Ввести с клавиатуры список из n целых чисел.
//        а) Найти сумму, количество и среднее значение среди чисел, которые не де-
//        лятся на 5
//        б) Найти среди отрицательных чисел, которые не делятся на 5, минимальное и
//        максимальное значения и их номера и поменять их местами.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        firstTask(list);
        System.out.println();
        secondTask(list);
    }

    public static void firstTask(List<Integer> list){
        int count = 0, sum = 0, avg;
        for (int element: list) {
            System.out.printf("%s\t", element);
            if(element % 5 != 0){
                count++;
                sum += element;
            }
        }
        System.out.println();
        avg = sum / count;
        System.out.printf("Count - %d, sum - %d, avg - %d", count, sum, avg);
    }

    public static void secondTask(List<Integer> list){
        int min = list.get(0), max = list.get(0), minIndex, maxIndex;
        for (int element: list) {
            System.out.printf("%s\t", element);
            if(element < 0 && element % 5 != 0){
                if (min > element) min = element;
                if (max < element) max = element;
            }
        }
        System.out.println();
        System.out.printf("Min element - %d\n",min);
        System.out.printf("Max element - %d\n", max);
        minIndex = list.indexOf(min);
        maxIndex = list.indexOf(max);
        list.remove(minIndex);
        list.add(minIndex, max);
        list.remove(maxIndex);
        list.add(maxIndex, min);
        for (int element:
             list) {
            System.out.printf("%s\t", element);
        }
        System.out.println();
    }
}