package Searching;

/**
 * Бинарный поиск в отсортированном ПО ВОЗРАСТАНИЮ массиве(рекурсия)
 */
public class BinarySearch
{
    /**
     * Вызывает алгоритм рекурсивного бинарного поиска,
     * передавая ему параметры размеров массива
     * @param sortedArray отсортированный массив
     * @param value искомое значение
     * @return индекс найденного значения (-1, если не найдено)
     */
    public static int search(int[] sortedArray, int value)
    {
        return search(sortedArray, value, 0, sortedArray.length - 1);
    }

    /**
     * Сам алгоритм поиска
     * @param sortedArray отсортированный массив
     * @param value искомое значение
     * @param from индекс начала поиска (включительно)
     * @param to индекс конца поиска (включительно)
     * @return индекс найденного значения (-1, если не найдено)
     */
    private static int search(int[] sortedArray, int value, int from, int to)
    {

        /**
         * Индекс начала поиска больше индекса конца поиска.
         * Это значит, что искомого значения в массиве нет.
         * Возвращаем -1
         */
        if (from > to) return -1;

        //Делим массив пополам
        int middle = (to + from) / 2;

        //Если искомое значение меньше значения в середине массива
        if (value < sortedArray[middle])
        {
            //То ищем его рекурсивно в левой половине массива
            return search(sortedArray, value, from, middle - 1);
        }
        //Если искомое значение больше значения в середине массива
        else if (value > sortedArray[middle])
        {
            //То ищем его рекурсивно в правой половине массива
            return search(sortedArray, value, middle + 1, to);
        }
        //Иначе (если искомое значение равно значению в середине массива)
        else
        {
            //Возвращаем его индекс
            return middle;
        }
    }
}
