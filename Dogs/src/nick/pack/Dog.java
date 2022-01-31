package nick.pack;

public class Dog {
    public String name;
    public int height;
    public String color;

    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public Dog(){}
}
