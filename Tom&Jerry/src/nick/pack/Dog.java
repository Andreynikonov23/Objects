package nick.pack;

public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toStrings(){
        return String.format("%s - %d", name, age);
    }
}
