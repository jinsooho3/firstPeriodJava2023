class Solution1 {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        for(long i = 0;i<n;i++){
            answer[(int)i] = (long)x*(i+1);
        }
        return answer;
    }
}
public class feb15_5 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(-4, 2));

	}

}
