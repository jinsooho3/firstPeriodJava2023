public class mergeSort {
    static int[] targetArray = {3,44,38,5,47,15,36,26};
        // 이걸 이제 [3,44,38,5],[47,15,36,26]로 나누고
        // 또        [3,44],[38,5],,[47,15],[36,26] 또다시
        //           [3],[44],,[38],[5],,,[47],[15],,[36],[2]
        //이렇게 재귀함수로 나누고 나눈것들끼리 비교하면서 정렬하는건데
        //진짜 하나도 감이 안온다
    public void merge(int[]args) {
        float med = targetArray.length / 2;
        if(med - (int)med != 0){
            med += 1;
        }
        int intMed = (int)med;
        System.out.println(intMed);
        System.out.println(args.length - intMed);
        //중간지점부분으로 배열 나누기
        int[]firstArray = new int[intMed];
        //남은부분도 배열로 나누기 즉 2등분하는것(홀수면 당연히 등분은 아님)
        int[]secondArray = new int[args.length-intMed];
        //이걸 그 모든 원소가 1이될때까지 반복해야하는데 재귀함수 어떻게하더라
        for(int i = 0;i<args.length;i++){
            if(i<intMed){
                firstArray[i] = targetArray[i];
            }
            else{
                secondArray[i-intMed] = targetArray[i];
            }
        }

    }
    public static void main(String[] args) {
        mergeSort ms = new mergeSort();
        ms.merge(targetArray);
        
        
    }
}
