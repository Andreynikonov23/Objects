package nick.pack;

public class Main {

    public static void main(String[] args) {
        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 2;
        murzik.weight = 3;
        murzik.strength = 40;
        Cat rizhik = new Cat();
        rizhik.name = "Рыжик";
        rizhik.age = 1;
        rizhik.weight = 1;
        rizhik.strength = 60;
        Cat ugolek = new Cat();
        ugolek.name = "Уголек";
        ugolek.age = 7;
        ugolek.weight = 3;
        ugolek.strength = 70;
        System.out.println(rizhik.fight(ugolek));
    }
}
