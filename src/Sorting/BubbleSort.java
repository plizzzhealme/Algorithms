package Sorting;

/**
 * Пузырьковая сортировка
 */
public class BubbleSort
{
    /**
     * Сортирует массив простыми обменами
     * @param array Исходный массив
     */
    public static void sort(int[] array)
    {
        int length = array.length;
        boolean sorted = false;

        while (!sorted)
        {
            sorted = true;

            for (int i = 0; i < length - 1; i++)
            {
                if (array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
