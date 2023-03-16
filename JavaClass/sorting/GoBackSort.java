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
        //가장 큰수를 맨뒤로 보내는 그런 알고리즘
        System.out.println();
        for(int i = targetArray.length-1;i>=0;i--){
            //첫번째 인덱스를 가장 큰거로 잡고
            maxNumIndex = 0;
            for(int j = 0;j<=i;j++){
                // 첫번째 원소보다 큰수가 있으면 그 수의 인덱스번호를 받음
                if(targetArray[j]>targetArray[maxNumIndex]){
                    maxNumIndex = j;
                }
            }
            // 가장큰수와 현재 정렬되지않은 가장 뒷 원소를 바꾸기
            int temp = targetArray[maxNumIndex];
            targetArray[maxNumIndex] = targetArray[i];
            targetArray[i] = temp;
        }
        // sort 결과 출력
        // 이거 두번쓰니까 무조건 메소드로 나눠버리자
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
// 설명 : 첫번째 숫자부터 맨뒤까지 원소를 보면서 가장 큰수와 현재 맨뒤수를 변경
//        그럼 맨뒤원소는 현재 정렬된거니까, 그 전까지만 다시 확인하면서 큰수랑 변경
//        반복하면서 정렬
// 다행히 생각대로 알고리즘이 짜졌다