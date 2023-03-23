import java.util.Random;
import java.util.random;
public class UpAndDownSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int i;
        int y;
        int temp;
        int[] wantToSortArray = {4,7,6,2,8,3,5,1};
        int maxNum = 0;//rand.nextInt(8); // maxNum = 
        int minNum = 0;//rand.nextInt(8);
        for(int k = 0, j=wantToSortArray.length-1;k<j;k++,j--){
            // maxNum애는 가장큰수의 인덱스번호 minNum가장작은수의 인덱스번호가 들어감
            //처음부터 끝까지 스캔하는것
            for(i = k,y=j;i<wantToSortArray.length;i++){
                //만약 maxNum인덱스의 요소보다 크면 인덱스 숫자변경
                if(wantToSortArray[maxNum]<wantToSortArray[i]){
                    maxNum = i;
                }
                //만약 minNum인덱스의 요소보다 작으면 인덱스 숫자변경
                if(wantToSortArray[minNum]>wantToSortArray[i]){
                    minNum = i;
                }
            }
            temp =wantToSortArray[k];
            wantToSortArray[k] = wantToSortArray[minNum];
            wantToSortArray[minNum] = temp;

            temp = wantToSortArray[j];
            wantToSortArray[j] = wantToSortArray[maxNum];
            wantToSortArray[maxNum] = temp;
        }
        for(i = 0;i<wantToSortArray.length;i++){
            System.out.println(wantToSortArray[i]);
        }


    }
}
