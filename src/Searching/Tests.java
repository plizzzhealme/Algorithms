package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Тесты поиска
 */
class Tests {
    private static final int SIZE = 20;

    public static void main(String[] args) throws IOException {
        int[] array = createArray();
        Arrays.sort(array);
        printArray(array);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input value for searching");
        int value = Integer.parseInt(bufferedReader.readLine());

        int index = BinarySearch.search(array, value);

        if (index == -1) {
            System.out.println("Value " + value + " is not found.");
        } else {
            System.out.println("Value " + value + " index is " + index + ".");
        }
    }

    /**
     * Выводим массив на экран
     *
     * @param array массив, который нужно вывести
     */
    private static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    /**
     * Генерирует массив из случайных чисел
     *
     * @return готовый массив
     */
    private static int[] createArray() {
        int[] array = new int[Tests.SIZE];
        for (int i = 0; i < Tests.SIZE; i++) {
            array[i] = (int) (Math.random() * Tests.SIZE + 1);
        }
        return array;
    }
}
