package nick.pack;

public class Main {

    public static void main(String[] args) {
        Friend frodo = new Friend();
        frodo.initialize("Фродо Бэггинс");
        Friend sam = new Friend();
        sam.initialize("Сэмуайз Гэмджи", 38);
        Friend gendalf = new Friend();
        gendalf.initialize("Гендальф Серый", 2000, 'м');
        System.out.println(frodo.name + " " + frodo.age + " " + frodo.gender);
        System.out.println(sam.name + " " + sam.age + " " + sam.gender);
        System.out.println(gendalf.name + " " + gendalf.age + " " + gendalf.gender);
    }
}
