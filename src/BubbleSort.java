import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arrUnsort) {
        int count = 0;
        for (int i = 0; i < arrUnsort.length - 1; i++)
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }
        if (count > 0) {
            bubbleSort(arrUnsort);
        }
    }
    public static void bubbleSortString(String[] array) {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1].toLowerCase().compareTo(array[i].toLowerCase()) < 0) {
                    String tempStr = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempStr;
                    count++;
                }
            }
            if (count > 0) {
                bubbleSortString(array);
            }
        }

}

//Как видим из кода, метод bubbleSort() принимает массив в качестве входных данных для сортировки — sortArr.
// Далее мы создаём внешний цикл for, который перебирает каждый элемент массива, тогда как внутренний цикл for
// начинается с первого элемента массива до предпоследнего индекса: sortArr.length - i - 1. С помощью условия if мы проверяем,
// больше ли элемент слева элемента справа или нет. Если элемент слева действительно больше, он меняется местами с правым элементом.
//Примечание Внешний цикл for будет перебирать все элементы массива, даже если массив уже полностью отсортирован.