public class SelectionSort {
    public static void selectionSort(int[] items) {
        for (var i = 0; i < items.length - 1; i++) {
            var indexMin = i;
            for (var j = i + 1; j < items.length; j++) {
                if (items[j] < items[indexMin]) {
                    indexMin = j;
                }
            }

            var temporary = items[i];
            items[i] = items[indexMin];
            items[indexMin] = temporary;
        }
    }
}

//Разбиваем массив на отсортированную и неотсортированную части.
//Находим в неотсортированной части минимальный элемент.
//Меняем его местами с тем элементом, который находится на нулевой позиции —
//в конец отсортированного массива.
//Далее находим следующий по величине элемент и меняем его с элементом на первой позиции, etc., пока не закончатся неотсортированные значения.
