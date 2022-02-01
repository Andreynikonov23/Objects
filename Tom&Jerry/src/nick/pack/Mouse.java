package nick.pack;

public class Mouse {
    private String name;
    private int age;


    public Mouse(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toStrings(){
        return String.format("%s - %d", name, age);
    }
}
