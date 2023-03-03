import java.util.Arrays;
public class Feb07_1 {

	public static long solution(long n) {
        long answer = 0;
        String answers ="";
        String ans = Long.toString(n);
        char []rev =ans.toCharArray();
        Arrays.sort(rev);
        for(int i = ans.length()-1;i>=0;i--){
            answers += rev[i];
        }
        answer = Long.parseLong(answers);
        return Long.parseLong(answers);
    }
    public static void main(String[] args) {
		System.out.println(solution(88947132));;

	}
	

}
