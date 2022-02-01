package nick.pack;

public class Main {
    /*
    Создать класс прямоугольник (Rectangle).
    Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
    Создать для него как можно больше методов конструкторов.
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(700, 300, 400, 300);
        Rectangle rectangle1 = new Rectangle(100, 300);
        Rectangle rectangle2 = new Rectangle(500, 100, 500);
        Rectangle rectangle3 = new Rectangle(rectangle);
        System.out.printf("Первый прямоугольник: %d, %d, %d, %d\n", rectangle.left, rectangle.top, rectangle.width, rectangle.height);
        System.out.printf("Второй прямоугольник: %d, %d, %d, %d\n", rectangle1.left, rectangle1.top, rectangle1.width, rectangle1.height);
        System.out.printf("Третий прямоугольник: %d, %d, %d, %d\n", rectangle2.left, rectangle2.top, rectangle2.width, rectangle2.height);
        System.out.printf("Пятый прямоугольник: %d, %d, %d, %d\n", rectangle3.left, rectangle3.top, rectangle3.width, rectangle3.height);
    }
}
