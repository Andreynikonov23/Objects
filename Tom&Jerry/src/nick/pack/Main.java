package nick.pack;

public class Main {

    public static void main(String[] args) {
	Cat tom = new Cat("Tom", 12);
    Mouse jerry = new Mouse("Jerry", 12);
    Dog spike = new Dog("Spike", 30);
    Cat butch = new Cat("Butch", 13);
    Mouse nibbls = new Mouse("Nibbls", 5);
    Dog tike = new Dog("Tike", 8);
    System.out.println(tom.toStrings());
        System.out.println(jerry.toStrings());
        System.out.println(spike.toStrings());
        System.out.println(butch.toStrings());
        System.out.println(nibbls.toStrings());
        System.out.println(tike.toStrings());
    }
}
