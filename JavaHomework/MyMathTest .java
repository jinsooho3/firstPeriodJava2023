public class MyMathTest {
    public static void main(String[] args) {
      int sum;  // 합계
  
      // MyMath 클래스 멤버함수에 인자값으로 2, 3을 넣고 더한 값 리턴 받기
      sum = MyMath.add(2, 3);
      System.out.println("2와 3의 합은 " + sum);
  
      // MyMath 클래스 멤버함수에 인자값으로 2, 3을 넣고 더한 값 리턴 받기
      sum = MyMath.add(7, 8);
      System.out.println("7과 8의 합은 " + sum);
    }
  
  }