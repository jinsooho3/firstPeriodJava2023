public class Car1 {
    private String model;
    private String color;
    private int speed;

    //상수란 한번 초기화되면 절대 값을 변경할 수 없는 값
    // 자바에서는 상수를 어떻게 만드냐?  final keyword 사용.
    static final int MAX_SPEED = 350;
    //상수는 대문자로 사용하는것이 관례

    // 자동차의 시리얼 넘버
    private int id;

    // 정적 맴버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록
    private static int numbers = 0;
    //생성자?
    public Car1(String m, String c, int s){
        model = m;
        color = c;
        speed = s;
        id = ++numbers; // 생성자에서 id = ++number;
    }

    public static void main(String[] args) {
        Car1 c1, c2, c3;
        c1 = new Car1("S600", "white", 80);
        c2 = new Car1("E500", "blue", 20);
        c3 = new Car1("E300", "gray", 160);

        System.out.println("생성된 자동차 수 : " + c1.numbers);
        System.out.println("생성된 자동차 수 : " + c2.numbers);
        System.out.println("생성된 자동차 수 : " + c3.numbers);
        int n = Car1.numbers;
        
    }
}