
public class feb15_2 {
	public static String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
            answer += s.charAt(s.length()/2) + s.charAt(s.length()/2+1);
        }
        else{
            answer += s.charAt((s.length()-1)/2);
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));

	}

}
