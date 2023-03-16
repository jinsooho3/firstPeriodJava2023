import java.util.Random;
public class GoBackSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] targetArray = new int[10]; // targetArray를 sort 하는 algorithm
        int maxNumIndex;
        for(int i = 0;i<targetArray.length;i++){ 
            targetArray[i] = rand.nextInt(100) + 1; // 1~100 정수 랜덤
        }
        // 한눈에 보기 편하게 출력
        // 보기 편한지는 모르겠음
        for(int i = 0;i<targetArray.length;i++){
            if(i != 0){
                System.out.print(",");
            }
            System.out.print(targetArray[i]);
        }
        System.out.println();
        for(int i = targetArray.length-1;i>=0;i--){
            maxNumIndex = 0;
            for(int j = 0;j<=i;j++){
                if(targetArray[j]>targetArray[maxNumIndex]){
                    maxNumIndex = j;
                }
            }
            int temp = targetArray[maxNumIndex];
            targetArray[maxNumIndex] = targetArray[i];
            targetArray[i] = temp;
        }
        // sort 결과 출력
        for(int i = 0;i<targetArray.length;i++){
            if(i != 0){
                System.out.print(",");
            }
            System.out.print(targetArray[i]);
        }
    }
}
// 생각보다 오래걸렸다.
// 내일은 클래스, 메소드 별로 따개자
