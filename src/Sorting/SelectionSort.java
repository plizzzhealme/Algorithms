package Sorting;

/**
 * Сортировка выбором
 */
public class SelectionSort
{
    public static void sort(int[] array)
    {
        int length = array.length;

        /**
         * С каждым проходом по массиву
         * ищем минимальный элемент и
         * ставим его на свое место.
         * Затем ищем минимальный
         * из оставшихся и так далее...
         */
        for (int i = 0; i < length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }

            int temp = array [min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
