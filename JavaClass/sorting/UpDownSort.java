import javax.swing.event.ChangeEvent;

/**
 * SortingAlgorithm
 */
public class SortingAlgorithm {
    public static void changeNum(int arg1,int arg2){
        int temp;
        temp = wantToSortArray[arg1];
        wantToSortArray[arg1] = wantToSortArray[arg2];
        wantToSortArray[arg2] = temp;
    }
    
}
public class UpDownSort {
    public static void main(String[] args) {
        int[] wantToSortArray = {6,4,1,7,3,2,5};
        int minNum = 0;//가장 작은수가 들어갈 인덱스번호
        int maxNum = 0;//가장 큰수가 들어갈 인덱스번호
        int i;
        int k;
        for(i = 0,k=wantToSortArray.length-1;i<wantToSortArray.length;i++,k--){//i는 맨앞 k는 맨위 정렬되면 한칸씩 전,후진
            for(int j = 0, l=0;j<wantToSortArray.length;j++,l++){
                //원래번호보다 더 작은수가있으면 인덱스교체
                if(minNum > wantToSortArray[j]){
                    minNum = j; 
                }
                //원래 수보다 더 큰수가있으면 인덱스 교체
                if(maxNum<wantToSortArray[l]){
                    maxNum = l;
                }
            }
            SortingAlgorithm.changeNum(minNum, i);
            SortingAlgorithm.changeNum(maxNum, k);
        }
        for(int ai = 0;i<wantToSortArray.length;ai++){
            if(ai != 0){
                System.out.print(",");
            }
            System.out.print(wantToSortArray[i]);
        }
    }
}
