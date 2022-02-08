package nick.pack;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int tail;

    public Cat(String name, int age, int weight, int tail){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
    }

    public String toStringFormat(){
        String str = String.format("Cat's name: %s, age: %d, weight: %d, tail: %d", name, age, weight, tail);
        return str;
    }
}
