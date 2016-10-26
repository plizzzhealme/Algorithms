package Sorting;

/**
 * Сортировка слиянием
 */
public class MergeSort
{
    /**
     * Сливает два отсортированных подмассива в один
     * @param array исходный массив
     * @param from1 начальный индекс первого подмассива
     * @param to1 последний индекс первого подмассива
     * @param from2 начальный индекс второго подмассива
     * @param to2 последний индекс второго подмассива
     */
    private static void merge (int array[], int from1, int to1, int from2, int to2)
    {
        //Определяем общую длину отсортированных подмассивов
        int length = to2 - from1 + 1;
        //Дополнительный массив, используем его для временного хранения
        int[] temp = new int[length];
        //Запоминаем начальный индекс в исходном массиве
        int arrayIndex = from1;
        //Текущий индекс во временном массиве
        int tempIndex = 0;

        //Пока есть элементы в обоих подмассивах
        while (from1 <= to1 && from2 <= to2)
        {
            //Сравниваем их текущие элементы и меньший
            //заносим во временный массив, смещаем индексы
            if (array[from1] <= array[from2])
            {
                //Если меньший элемент в первом подмассиве
                temp[tempIndex] = array[from1];
                tempIndex++;
                from1++;
            }
            else
            {
                //Если меньший элемент во втором подмассиве
                temp[tempIndex] = array[from2];
                tempIndex++;
                from2++;
            }
        }

        //Если элементы остались в первом подмассиве (а во втором закончились)
        while (from1 <= to1)
        {
            //Заносим их во временный массив
            temp[tempIndex] = array[from1];
            from1++;
            tempIndex++;
        }

        //Если элементы остались во втором подмассиве (а в первом закончились)
        while (from2 <= to2)
        {
            //Заносим их во временный массив
            temp[tempIndex] = array[from2];
            from2++;
            tempIndex++;
        }

        //Копируем элементы из временного массива в исходный
        for (tempIndex = 0; tempIndex < length; tempIndex++)
        {
            array[arrayIndex + tempIndex] = temp[tempIndex];
        }
    }

    /**
     * Сортирует массив в пределах указанных индексов
     * @param array массив
     * @param from Индекс начала сортировки
     * @param to Индекс конца сортировки
     */
    public static void sort (int array[], int from, int to)
    {
        //Если длина сортируемой части массива больше 0
        if (to > from)
        {
            int middle = (from + to) / 2;
            //То рекурсивно вызываемся для сортировки левой
            sort(array, from, middle);
            //и правой половин
            sort(array, middle + 1, to);
            //Сливаем отсортированные подмассивы
            merge(array, from, middle, middle + 1, to);
        }
    }
}
