import java.lang.reflect.Array;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        final int ArrayLength = 6;
        int[]wantToSortArray = new int[ArrayLength];
        // put  random number to wantToSortArray
        for(int i = 0;i<wantToSortArray.length;i++){
            wantToSortArray[i] = rand.nextInt(100);
        }
        // Just want to see random numbers  #not important
        for(int i = 0;i<wantToSortArray.length;i++){
            System.out.println(wantToSortArray[i]);
        }
        System.out.println("-------------------------");
        //Sorting algorithm
        for(int i = 0;i<wantToSortArray.length ;i++){
            for(int j = 1;j<wantToSortArray.length;j++){
                if(wantToSortArray[j-1] > wantToSortArray[j]){
                    int temp;
                    temp = wantToSortArray[j-1];
                    wantToSortArray[j-1] = wantToSortArray[j];
                    wantToSortArray[j] = temp;
                }
            }
        }
        // Just want to see random numbers  #not important
        for(int i = 0;i<wantToSortArray.length;i++){
            System.out.println(wantToSortArray[i]);
        }
    }
}
