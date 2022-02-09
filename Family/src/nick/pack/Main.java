package nick.pack;

public class Main {
    /*
    Создай класс Human с полями
    имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    Создай объекты и заполни их так, чтобы получилось:
    Два дедушки, две бабушки, отец, мать, трое детей.
    Вывести объекты на экран.
     */
    public static void main(String[] args) {
        Human grandfa1 = new Human("Владимир", 'м', 71);
        Human grandfa2 = new Human("Владимир", 'м', 65);
        Human grandma1 = new Human("Юлия", 'ж', 70);
        Human grandma2 = new Human("Валентина", 'ж', 64);
        Human father = new Human("Владимир", 'м',38, grandfa1, grandma1);
        Human mother = new Human("Галина", 'ж', 37, grandfa2, grandma2);
        Human son1 = new Human("Никита", 'м', 12, father, mother);
        Human son2 = new Human("Андрей", 'м', 20, father, mother);
        Human daughter = new Human("Елизавета", 'ж', 4, father, mother);
        System.out.println(grandfa1.toStringForGrand());
        System.out.println(grandfa2.toStringForGrand());
        System.out.println(grandma1.toStringForGrand());
        System.out.println(grandma2.toStringForGrand());
        System.out.println(father.toStrings());
        System.out.println(mother.toStrings());
        System.out.println(son1.toStrings());
        System.out.println(son2.toStrings());
        System.out.println(daughter.toStrings());
    }
}
