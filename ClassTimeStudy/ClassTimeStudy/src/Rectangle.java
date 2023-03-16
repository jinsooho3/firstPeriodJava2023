public class Rectangle {
    private int x,y;
    private int width, height;

    public Rectangle(int x,int y, int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int width, int height){
        this(0, 0, width, height);
    }
    public void getRectangle() {
        System.out.println("start point : (" + x +"," + y + ") width = "+ width + " height = " + height);
    }
    
}