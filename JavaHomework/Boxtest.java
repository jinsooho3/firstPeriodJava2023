public class Boxtest {
    public static void main(String[] args) {
  
      Box myBox = new Box(); // 객체 생성
  
      myBox.width = 20; // 가로 20넣기
      myBox.length = 20; // 세로 20 넣기
      myBox.height = 30; // 높이 30넣기
      
      // 출력
      System.out.println("상자의 가로, 세로, 높이는 " + myBox.width + "," + myBox.length + "," + myBox.height );
  
      
    }
  } 