package nick.pack;

public class Main {
    
    public static void main(String[] args) {
	Cat cat = new Cat();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Cat cat4 = new Cat();
    cat.initName("Барсик");
    cat.initWeightColor(5, "сырый");
    cat1.initNameWeightAge("Рыжик", 3, 1);
    cat1.initWeightColorAddress(3, "Рыжий", "дом 8");
    cat2.initNameAge("Мурзик", 2.5);
    cat3.initWeightColor(5, "Черный");
    cat4.initWeightColorAddress(7.2, "Белый", "дом 12");
    System.out.printf("Кот 1: %s, %f, %f, %s, %s\n", cat.name, cat.age, cat.weight, cat.color, cat.address);
    System.out.printf("Кот 2: %s, %f, %f, %s, %s\n", cat1.name, cat1.age, cat1.weight, cat1.color, cat1.address);
    System.out.printf("Кот 3: %s, %f, %f, %s, %s\n", cat2.name, cat2.age, cat2.weight, cat2.color, cat2.address);
    System.out.printf("Кот 4: %s, %f, %f, %s, %s\n", cat3.name, cat3.age, cat3.weight, cat3.color, cat3.address);
    System.out.printf("Кот 5: %s, %f, %f, %s, %s\n", cat4.name, cat4.age, cat4.weight, cat4.color, cat4.address);
    }
}
