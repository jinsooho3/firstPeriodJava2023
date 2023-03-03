class Solution2 {
	public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length==1){
            arr[0] = -1;
            return arr;
        }
        int[] test = new int[arr.length-1];
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int k = 0;
        for(int j = 0;j<arr.length;j++,k++){;
            if(arr[j] != min){
                answer[k] = arr[j];
            }
            else{
                k--;
            }
        }
        return answer;
    }
}
public class feb15_6 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int [] listha= {4,3,2,1};
		System.out.println(s.solution(listha));

	}

}
