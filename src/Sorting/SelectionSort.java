package Sorting;

/**
 * Сортировка выбором
 */
class SelectionSort {
    public static void sort(int[] array) {
        int length = array.length;

        /*
          Проходим по массиву, ищем минимальный элемент
          и ставим его на первое место. Затем ищем
          минимальный из оставшихся и ставим на второе.
          И так для всех элементов.
         */
        for (int i = 0; i < length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
