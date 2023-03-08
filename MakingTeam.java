import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 * MakingTeam
 */
public class MakingTeam {
    public static void main(String[] args) {
        // 주어진 배열
        int[][] array = new int[6][6];
        int num = 101;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = num;
                num++;
            }
        }
        // 기본으로 나눈 배열 (확인용)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

		//배열에 쓸 랜덤순서 정하기?
        int[][] randArrays = new int[6][6];
        
        // initializing the arrays
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 1; j <= 6; j++) {
                tempList.add(j);
            }
            Collections.shuffle(tempList);
            for (int j = 0; j < 6; j++) {
                randArrays[i][j] = tempList.get(j);
            }
        }
        // 랜덤배열 프린트(확인용)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(randArrays[i][j] + " ");
            }
            System.out.println();
        }
        
        
        // 랜덤배열숫자로 각 새로운 배열에 집어넣기
        int[][] newArray = new int[6][6];
        for(int i = 0;i<6;i++){
            for(int j = 0;j<6;j++){
                switch (randArrays[i][j]) {
                    case 1:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                    case 2:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                    case 3:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                    case 4:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                    case 5:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                    case 6:
                        newArray[randArrays[i][j]-1][i] = array[i][j];
                        break;
                }
            }
        }
        // 랜덤으로 배열이 나눠졌는지 확인
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0;i<6;i++){
            System.out.println((i+1) + "조 명단");
            for(int j = 0;j<6;j++){
                System.out.println(newArray[i][j]);
            }
        }
    }
    
}