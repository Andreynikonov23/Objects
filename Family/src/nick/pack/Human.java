package nick.pack;

public class Human {
    private String name;
    private char gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, char gender, int age, Human father, Human mother){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    public Human (String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String toStringForGrand(){
        String str = String.format("Имя: %s, пол: %s, возраст: %d", name, gender, age);
        return str;
    }
    public String toStrings(){
        String str = String.format("Имя: %s, пол: %s, возраст: %d, отец: %s, мать: %s", name, gender, age, father.getName(), mother.getName());
        return str;
    }
}
