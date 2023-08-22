//coded by kavindu sandaruwan
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

        int[] array = {20, 3, 45, 1, 56,100, 87, 34,12,50,100,2};
        System.out.println("Before sorting = " + Arrays.toString(array));

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--){
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        System.out.println("After sorting = " + Arrays.toString(array));
    }
}
