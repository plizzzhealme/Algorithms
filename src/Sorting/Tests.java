package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Тесты сортировок
 */
public class Tests
{
    private static final int SIZE = 20;

    public static void main(String[] args) throws IOException
    {
        System.out.println("Choose sort type:\n" +
                "1 - BubbleSort\n" +
                "2 - InsertionSort\n" +
                "3 - SelectionSort\n" +
                "4 - MergeSort");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sortType = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Array:");
        int[] array = createArray(SIZE);
        printArray(array);

        switch (sortType)
        {
            case 1: BubbleSort.sort(array);
                    System.out.println("BubbleSorted:");
                    printArray(array);
                    break;

            case 2: InsertionSort.sort(array);
                    System.out.println("InsertionSorted:");
                    printArray(array);
                    break;

            case 3: SelectionSort.sort(array);
                    System.out.println("SelectionSorted");
                    printArray(array);
                    break;

            case 4: MergeSort.sort(array, 0, array.length - 1);
                    System.out.println("MergeSorted:");
                    printArray(array);
                    break;
        }
    }

    /**
     * Выводим массив на экран
     * @param array массив, который нужно вывести
     */
    public static void printArray(int[] array)
    {
        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Генерирует массив из случайных чисел
     * @param length длина массива
     * @return готовый массив
     */
    public static int[] createArray(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
        {
            array[i] = (int)(Math.random() * length + 1);
        }
        return array;
    }
}
