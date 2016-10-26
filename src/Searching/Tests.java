package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Тесты поиска
 */
public class Tests
{
    private static final int SIZE = 20;
    public static void main(String[] args) throws IOException
    {
        int[] array = createArray(SIZE);
        Arrays.sort(array);
        printArray(array);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input value for searching");
        int value = Integer.parseInt(bufferedReader.readLine());

        int index = BinarySearch.search(array, value);

        if (index == -1)
        {
            System.out.println("Value " + value + " is not found.");
        }
        else
        {
            System.out.println("Value " + value + " index is " + index + ".");
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
