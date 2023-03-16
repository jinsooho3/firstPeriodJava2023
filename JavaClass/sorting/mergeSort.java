public class mergeSort {
    public static void main(String[] args) {
        int[] targetArray = {3,44,38,5,47,15,36,26};
        // 이걸 이제 [3,44,38,5],[47,15,36,26]로 나누고
        // 또        [3,44],[38,5],,[47,15],[36,26] 또다시
        //           [3],[44],,[38],[5],,,[47],[15],,[36],[2]
        //이렇게 재귀함수로 나누고 나눈것들끼리 비교하면서 정렬하는건데
        //진짜 하나도 감이 안온다
        float med = targetArray.length / 2;
        if(med - (int)med != 0){
            med += 1;
        }
        System.out.println(med);
    }
}
