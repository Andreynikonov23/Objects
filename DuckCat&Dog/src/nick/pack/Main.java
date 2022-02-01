package nick.pack;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck();
        Cat cat = new Cat();
        Dog dog = new Dog();

        duck.setName("Дональд");
        duck.setWeight(5);
        cat.setName("Тимон");
        cat.setWeight(7);
        dog.setName("Лайер");
        dog.setWeight(20);
        System.out.printf("Getters: \n%s %d\n%s %d\n%s %d\n", duck.getName(), duck.getWeight(), cat.getName(), cat.getWeight(), dog.getName(), dog.getWeight());
        System.out.println("================================================");
        System.out.println("toString:\n" + duck.toStrings() + "\n" + cat.toStrings() + "\n" + dog.toStrings());
    }
}
