import java.util.ArrayList;
import java.util.Collections;

public class NumverArrays {
    public static void main(String[] args) {
        int[][] arrays = new int[6][6];
        
        // initializing the arrays
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 1; j <= 6; j++) {
                tempList.add(j);
            }
            Collections.shuffle(tempList);
            for (int j = 0; j < 6; j++) {
                arrays[i][j] = tempList.get(j);
            }
        }
        
        // printing the arrays
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
