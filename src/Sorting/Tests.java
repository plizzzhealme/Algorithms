package Sorting;

/**
 * Тесты сортировок
 */
public class Tests
{
    public static void main(String[] args)
    {
        int[] array = createArray(20);
        System.out.println("Array:");
        printArray(array);

        BubbleSort.sort(array);
        System.out.println("Sorted:");
        printArray(array);

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
