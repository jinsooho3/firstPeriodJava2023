import java.util.Scanner;
public class SafeArrayTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        SafeArray array = new SafeArray(arraySize);
        for(int i = 0;i<(array.length);i++){
            array.put(i, i+10);
        }
        System.out.println("---------------------");
        array.getArray();
    }
}
