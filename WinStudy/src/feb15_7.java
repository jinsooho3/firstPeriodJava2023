class Solution3 {
	public int solution(int n) {
        int[]numList = new int[n-1];
        for(int i = 2;i<=n;i++){
            numList[i-2] = i;
        }
        for(int i = 0;i<numList.length;i++){
        	int indexNum =0;
            int cnt = 0;
            for(int j = 0;j<numList.length;j++){
                if(numList[j]%numList[i]!=0 || numList[j]/numList[i]==1){
                    cnt++;
                }  
            }
            int[]temp = new int[cnt];
            for(int j = 0;j<numList.length;j++){
                if(numList[j]%numList[i]!=0 || numList[j]/numList[i]==1){
                    temp[indexNum]=numList[j];
                    indexNum++;
                }  
            }
            numList = temp;
        }
        return numList.length;
    }
}
public class feb15_7 {

	public static void main(String[] args) {
//		Solution3 s = new Solution3();
//		System.out.println(s.solution(99999));;
		int cnt = 0;
		for(int i = 2; i <= 100; i++) {
            boolean isPrimeNumber = true;
            
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber) {
                cnt++;
            }
        }
		System.out.println(cnt);

	}

}
