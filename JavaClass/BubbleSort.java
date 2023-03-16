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
        for(int i = 0;i<wantToSortArray.length -1 ;i++){
            if(wantToSortArray[i] > wantToSortArray[i+1]){
                int temp;
                temp = wantToSortArray[i];
                wantToSortArray[i] = wantToSortArray[i+1];
                wantToSortArray[i+1] = temp;
            }
        }
        // Just want to see random numbers  #not important
        for(int i = 0;i<wantToSortArray.length;i++){
            System.out.println(wantToSortArray[i]);
        }
    }
}
