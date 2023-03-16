import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        final int ArrayLength = 6;
        int[]wantToSortArray = new int[ArrayLength];
        // put  random number to wantToSortArray
        for(int i = 0;i<wantToSortArray.length;i++){
            wantToSortArray[i] = rand.nextInt(100)+ 1;
        }
        // Just want to see random numbers  #not important
        for(int i = 0;i<wantToSortArray.length;i++){
            System.out.println(wantToSortArray[i]);
        }
        System.out.println("-------------------------");
        //Sorting algorithm
        // 어차피 맨뒤로 가장큰수를 보냈으니까 맨뒤는 비교필요 X
        for(int i = 5;i>=0 ;i--){
            for(int j = 1;j<=i;j++){
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
// 이제 메소드 단위로 따개서 만들어보자 새로운 파일로