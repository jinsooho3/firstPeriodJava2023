public class Cartest {
  public static void main(String[] args) {
    Car myCar = new Car(); // 객체 생성

    myCar.changeGear(1); // changeGear 메서드에 인자값으로 1을 넣어 gear를 1로 변경
    
    myCar.speedup(); // speedup 메서드 실행

    System.out.println(myCar); // toString 출력

  }
}