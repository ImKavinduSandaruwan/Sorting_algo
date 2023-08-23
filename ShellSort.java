import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[] array = {20, 3, 45, 1, 56, 87, 34, 12, 50, 100, 2};
        System.out.println("Before sorting = " + Arrays.toString(array));

        for(int gap = array.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < array.length; i++){
                int newElement = array[i];
                int j = i;

                while(j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        System.out.println("After sorting = " + Arrays.toString(array));
    }
}
