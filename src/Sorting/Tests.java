package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Тесты сортировок
 */
class Tests {
    private static final int SIZE = 20;

    public static void main(String[] args) throws IOException {
        System.out.println("Choose sort type:\n" +
                "1 - BubbleSort\n" +
                "2 - InsertionSort\n" +
                "3 - SelectionSort\n" +
                "4 - MergeSort");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sortType = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Array:");
        int[] array = createArray();
        printArray(array);

        switch (sortType) {
            case 1:
                BubbleSort.sort(array);
                System.out.println("BubbleSorted:");
                printArray(array);
                break;

            case 2:
                InsertionSort.sort(array);
                System.out.println("InsertionSorted:");
                printArray(array);
                break;

            case 3:
                SelectionSort.sort(array);
                System.out.println("SelectionSorted");
                printArray(array);
                break;

            case 4:
                MergeSort.sort(array, 0, array.length - 1);
                System.out.println("MergeSorted:");
                printArray(array);
                break;
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
