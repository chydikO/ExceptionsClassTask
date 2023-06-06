package task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Задание 1
 *     Создать метод, который выводит в консоль результат це-
 *     лочисленного деления числа, введенного с клавиатуры, на
 *     значения элементов одномерного массива целых чисел, за-
 *     полненный случайным образом – от -10 до 10. Длина масси-
 *     ва случайная – от 1 до 10.
 *     Обработать все возможные исключительные ситуации в
 *     данном методе.
 */
public class App01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] array = initArrayWithRandomValue(-10, 10);
        Arrays.stream(array).forEach(System.out::println);

        divideNumberByArrayNumber(array, inputNumber);

    }

    private static void divideNumberByArrayNumber(int[] array, int inputNumber) {
        for (int j : array) {
            try {
                System.out.println(inputNumber / j);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    private static int[] initArrayWithRandomValue(int i, int i1) {
        int arrLength = randIntValue(1, 10);
        int[] arr = new int[arrLength];
        for (int j = 0; j < arrLength; j++) {
            arr[j] = randIntValue(i, i1);
        }
        return arr;
    }

    private static int randIntValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
