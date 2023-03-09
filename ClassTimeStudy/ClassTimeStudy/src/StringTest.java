public class StringTest {
    public static void main(String[] args) {
        String proverb = "A barking dog";
        String s1, s2, s3, s4;

        System.out.println(proverb.length());
        proverb.concat(" never Bite!");
        System.out.println(proverb); // String은 바뀌지않음
        s1 = proverb.concat(" never Bite!");
        System.out.println(s1);
        s2 = proverb.replace('b', 'B');
        System.out.println(s2);

        s3 = proverb.substring(2, 3);
        System.out.println(s3);

        s4 = proverb.toUpperCase();
        System.out.println(s4);

        int x = 20;
        String r1 ="결과값은 " + x;
        System.out.println(r1.getClass().getName());

        String number1 = "123";
        int a = (Integer.parseInt(number1));
        System.out.println(a);
    }
}