package Sorting;

/**
 * Сортировка вставками
 */
public class InsertionSort
{
    /**
     * Сортирует массив вставками
     * @param array исходный массив
     */
    public static void sort(int[] array)
    {
        int length = array.length;

        /**
         * Принимаем первый элемент за отсортированный.
         * Берем следующий элемент
         * и ставим его на соответствующее место
         * в отсортированной части массива,
         * двигаясь по ней в обратном направлении
         * и сдвигая все элементы вправо,
         * пока не найдем нужное место для вставки
         */
        for (int i = 1; i < length; i++)
        {
            int j = i - 1;
            int elementToSort = array[i];

            while (j >= 0 && elementToSort < array[j])
            {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = elementToSort;
        }
    }
}
