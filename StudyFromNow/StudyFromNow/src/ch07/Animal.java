package ch07;
public class Animal {
    private double weight;
    private String picture;

    protected void eat(){
        System.out.println("eat()이 호출됨");
    }

    void sleep(){
        System.out.println("sleep()이 호출됨");
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getPicture(){
        return picture;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }
}
