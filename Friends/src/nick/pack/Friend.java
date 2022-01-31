package nick.pack;

public class Friend {
    public String name;
    public int age;
    public char gender;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
