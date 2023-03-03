

class feb15{
	public int solution(int[] a, int[] b) {
        int answer = 0;
        int n = a.length;
        for(int i =0;i<n;i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}
public class feb15_3 {
	
	public static void main(String[] args) {
		
		
		feb15 f =new feb15();

		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int list =f.solution(a, b);
		
		System.out.print(list);
	}

}
