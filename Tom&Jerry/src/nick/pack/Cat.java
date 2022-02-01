package nick.pack;

public class Cat {
    private String name;
    private int age;


    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toStrings(){
        return String.format("%s - %d", name, age);
    }
}
