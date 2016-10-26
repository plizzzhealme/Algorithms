package Sorting;

/**
 * Тесты сортировок
 */
public class Tests
{
    private static final int SIZE = 20;

    public static void main(String[] args)
    {
        //Тест пузырьковой сортировки
        int[] array = createArray(SIZE);
        System.out.println("Array:");
        printArray(array);

        BubbleSort.sort(array);
        System.out.println("Bubble Sorted:");
        printArray(array);

        //Тест сортировки слиянием
        array = createArray(SIZE);
        System.out.println("Array:");
        printArray(array);

        MergeSort.sort(array,0,array.length - 1);
        System.out.println("Merge Sorted:");
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
