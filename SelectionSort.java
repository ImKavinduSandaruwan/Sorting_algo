import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {20, 3, 45, 1, 56,100, 87, 34,12,50,100,2};
        System.out.println("Before sorting = " + Arrays.toString(array));

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 0; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largest]) largest = i;
            }
            swap(array, largest, lastUnsortedIndex);
        }
        System.out.println("After sorting = " + Arrays.toString(array));
    }
    public static void swap(int[] array, int i, int j){
        if(i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Note
    /*
    Selection sort is more efficient than bubble sort. because we did not swap every time.
    once we found the largest one then only we swap the values. But this sort is unstable
    is means we cannot guarente about duplicate values. But bubble sort is stable.
     */
}
