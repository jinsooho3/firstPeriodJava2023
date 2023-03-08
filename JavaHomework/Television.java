public class Television {
    int channel;    // 채널번호
    int volume;     // 볼륨
    boolean onOff;  // 전원 상태

    void print() {
        System.out.println("채널은" + channel + "이고 볼륨은 " + volume + "입니다");
    }

    // 채널 변수값 반환하는 메소드
    int getChannel() {
        return channel; 
    }
}