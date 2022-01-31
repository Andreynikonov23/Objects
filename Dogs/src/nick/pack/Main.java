package nick.pack;

public class Main {
    /*
    Создай класс Dog (собака) с тремя инициализаторами:
    - Имя; - Имя, рост; - Имя, рост, цвет.
     */
    public static void main(String[] args) {
	Dog barbas = new Dog();
    barbas.name = "Барбас";
    Dog muhtar = new Dog();
    muhtar.initialize("Мухтар", 52);
    Dog sharik = new Dog("Шарик", 52, "Черный");
        System.out.printf("%s\n%s %d\n%s %d %s", barbas.name, muhtar.name, muhtar.height, sharik.name, sharik.height, sharik.color);
    }
}
