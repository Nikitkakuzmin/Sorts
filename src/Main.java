import javax.management.ObjectName;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        int[] arr = {369, 930, 267, 719, 10, 480, 323, 334, 16, 838, 505, 99, 75, 477, 597, 463, 698, 783, 903, 72, 722,
                518, 272, 836, 550, 338, 98, 189, 218, 898, 557, 148, 165, 276, 157, 644, 598, 490, 659, 435, 995, 758,
                510, 471, 355, 972, 168, 138, 875, 240, 859, 393, 512, 695, 62, 32, 250, 893, 806, 397, 57, 82, 553,
                700, 679, 43, 359, 114, 37, 117, 624, 508, 472, 595, 676, 610, 470, 916, 468, 862, 427, 162, 759, 488,
                194, 753, 737, 443, 646, 543, 839, 702, 392, 402, 303, 760, 417, 877, 40, 979};





        System.out.println("BubbleSort - Пузырьковая Сортировка");
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения операции: " + executionTime + " наносекунд");
        System.out.println();


        System.out.println("SelectionSort - сортировка выбором");
        long startTime2 = System.nanoTime();
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("Время выполнения операции: " + executionTime2 + " наносекунд");
        System.out.println();

        System.out.println("QuickSort - быстрая сортировка");
        long startTime3 = System.nanoTime();
        QuickSort.quicksort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime3 = System.nanoTime();
        long executionTime3 = endTime3 - startTime3;
        System.out.println("Время выполнения операции: " + executionTime3 + " наносекунд");
        System.out.println();

        System.out.println("MergeSort - сортировка слиянием");
        long startTime4 = System.nanoTime();
        MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime4 = System.nanoTime();
        long executionTime4 = endTime4 - startTime4;
        System.out.println("Время выполнения операции: " + executionTime4 + " наносекунд");
        System.out.println();

        System.out.println("InsertionSort - Сортировка вставками");
        long startTime5 = System.nanoTime();
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime5 = System.nanoTime();
        long executionTime5 = endTime5 - startTime5;
        System.out.println("Время выполнения операции: " + executionTime5 + " наносекунд");
        System.out.println();

        System.out.println("HeapSort - Сортировка кучей");
        long startTime6 = System.nanoTime();
        HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime6 = System.nanoTime();
        long executionTime6 = endTime6 - startTime6;
        System.out.println("Время выполнения операции: " + executionTime6 + " наносекунд");
        System.out.println();

        System.out.println("CoctailSort - сортировка перемешиванием");
        long startTime7 = System.nanoTime();
        CoctailSort.cocktailSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime7 = System.nanoTime();
        long executionTime7 = endTime7 - startTime7;
        System.out.println("Время выполнения операции: " + executionTime7 + " наносекунд");
        System.out.println();




    }
}