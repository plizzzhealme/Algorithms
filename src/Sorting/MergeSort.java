package Sorting;

import java.util.Arrays;

/**
 * Created by analBrutality on 25.10.2016.
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
        //Дополнительный массив, используем его для временного хранения
        int[] temp = new int[array.length];
        int length = to2 - from1 + 1;
        int index = from1;

        //Пока есть элементы в обоих подмассивах
        while (from1 <= to1 && from2 <= to2)
        {
            //Сравниваем их текущие элементы и меньший
            //заносим во временный массив, смещаем индексы
            if (array[from1] <= array[from2])
            {
                //Если меньший элемент в первом подмассиве
                temp[index] = array[from1];
                index++;
                from1++;
            }
            else
            {
                //Если меньший элемент во втором подмассиве
                temp[index] = array[from2];
                index++;
                from2++;
            }
        }

        //Если элементы остались в первом подмассиве (а во втором закончились)
        while (from1 <= to1)
        {
            //Заносим их во временный массив
            temp[index] = array[from1];
            from1++;
            index++;
        }

        //Если элементы остались во втором подмассиве (а в первом закончились)
        while (from2 <= to2)
        {
            //Заносим их во временный массив
            temp[index] = array[from2];
            from2++;
            index++;
        }

        //Копируем элементы из временного массива в исходный
        for (int i = to2, j = 0; j < length; i--, j++)
        {
            array[i] = temp[i];
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
