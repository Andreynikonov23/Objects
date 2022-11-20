package nick.pack;

public class Main {

    public static void main(String[] args) {
        print("A", "B", "C", "D", "E", "F");
    }

    public static void print(String... strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
