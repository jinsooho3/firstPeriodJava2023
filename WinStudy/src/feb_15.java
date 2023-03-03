
public class feb_15 {
//	public int getStrToInt(String str) {
//        boolean Sign = true;
//        int result = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == '-')
//                Sign = false;
//            else if(ch !='+')
//                result = result * 10 + (ch - '0');
//        }
//        return Sign?1:-1 * result;
//	}
	public static int solution(String s) {
        int answer = 0;
        String str ="";
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)<48){
                continue;
            }
            str += s.charAt(i);
        }
        
        answer = Integer.parseInt(str);
        
        if(s.charAt(0)<48){
                answer *= -1;
            }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
		System.out.println(solution("718"));
		System.out.println(solution("-3"));
		System.out.println(solution("9874"));

	}

}
