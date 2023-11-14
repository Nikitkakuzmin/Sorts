public class QuickSort {


    public static int partition(int[] items, int left, int right, int pivot) {
        while (true) {
            while (items[left] < pivot) {
                left++;
            }

            while (items[right] > pivot) {
                right--;
            }

            if (left >= right) {
                return right + 1;
            }

            var temporary = items[left];
            items[left] = items[right];
            items[right] = temporary;

            left++;
            right--;
        }
    }
    public static void sort(int[] items, int left, int right) {
        var length = right - left + 1;

        if (length < 2) {
            return;
        }

        var pivot = items[left];

        var splitIndex = partition(items, left, right, pivot);
        sort(items, left, splitIndex - 1);
        sort(items, splitIndex, right);
    }
    public static void quicksort(int[] items) {
        sort(items, 0, items.length - 1);
    }
}

//Данный алгоритм разбивает список на две части, каждую из них он разбивает ещё на две и так далее, пока не останутся единичные элементы.
// Массив из одного элемента считается упорядоченным. Соседние элементы сравниваются и соединяются вместе.
// Так происходит до тех пор, пока все элементы не будут отсортированы.
