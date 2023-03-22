public class Box {
    private int width, length,height;
    private int volume;
    public Box(int w, int len, int h){
        width = w;
        length = len;
        height = h;
    }
    boolean isSameBox (Box obj){
        if((obj.width == width)&&(obj.length == length)&&(obj.height==height)){
            return true;
        }else{
            return false;
        }          
    }
}
        
    
    
//     public int getVolume(){
//         return width*height*length;
//     }

//     public static Box whoIsLargerBox(Box box1, Box box2){
//         if(box1.getVolume() > box2.getVolume()){
//             return box1;
//         }
//         return box2;
//     }

//     public static void main(String[] args) {
//         Box b1 = new Box(10, 20, 50);
//         Box b2 = new Box(10, 30, 30);
//         Box bigBox = Box.whoIsLargerBox(b1,b2);
//         System.out.println(bigBox.getVolume());
       
//     }
// }
