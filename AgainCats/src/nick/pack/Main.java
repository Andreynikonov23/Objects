package nick.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создайте 3х котов");
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int num = i+1;
            System.out.println("Введите имя кота №" + num + ":");
            String name = scanner.nextLine();
            System.out.println("Введите возраст кота №" + num + ":");
            int age = scanner.nextInt();
            System.out.println("Введите вес кота №" + num + ":");
            int weight = scanner.nextInt();
            System.out.println("Введите длинну кота №" + num + " в сантиметрах:");
            int tail = scanner.nextInt();
            Cat cat = new Cat(name, age,weight,tail);
            System.out.println(cat.toStringFormat());
        }
    }
}
