//coded by kavindu sandaruwan
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20, 3, 45, 1, 56, 87, 34,12,50,100,2};
        System.out.println("Before sorting = " + Arrays.toString(array));

        boolean isSorted = true;
        int temp = 0, lastUnsortedIndex = array.length - 1;

        while(isSorted){
            isSorted = false;
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = true;
                }
            }
            lastUnsortedIndex--;
        }
        System.out.println("After sorting = " + Arrays.toString(array));
    }
}
