class Solution {
	public int solution(int num) {
        int cnt=0;
        while(num != 1){
        	if(cnt==500) {
        		cnt =-1;
        		break;
        	}
            if(num%2==0){
                num /= 2;
            }
            else{
                num = num*3+1;
            }
            cnt+=1;
            solution(num);
        }
        return cnt;
    }
}
public class feb15_4 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(56));

	}

}
