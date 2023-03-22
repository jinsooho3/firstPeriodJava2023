import java.util.*;
public class GameCharacter {
    private class GameItem{
        private String name;
        private int type;
        private int price;

        public int getPrice(){
            return price;
        }

        @Override
        public String toString(){
            return "GameIte [name = "+ name +", type=" +type + ", price=" + price+ "]";
        }
    }
    private ArryList<GameItem> list = new ArrayList<>();

    public void add(String name, int type, int price){
        GameItem = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        list.add(item);
    }

    pulic void print(){
        int total = 0 ;

        for(GameItem itme: list)
    }
}
