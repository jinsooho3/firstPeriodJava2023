public class Mar09 {
    public static void main(String[] args) {
        String hello = "Hello world";
        char c = hello.charAt(0);
        System.out.println(c);
        String s2 = "Hello world";
        System.out.println(hello == s2);
        String s3 = new String("Hello world");
        System.out.println(hello == s3);// false 왜냐면 s3는 새로 생성했으니까
        System.out.println(s2.equals(s3));
        String h1 = new String("i love you");
        String h2 = new String("I Love You");
        System.out.println(h1==h2);
        System.out.println(h1.equalsIgnoreCase(h2));// 대소문자 구분없이 같은지
        // String 객체는 immutable 입니다 mutable이 아닙니다
        // 이말은 String 객체의 값은 변경할 수 없다.
    }
}
