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

    public static void printArray(int[] array)
    {
        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

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
