package nick.pack;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Роман", 33, "Дом 1");
        Woman woman = new Woman("Мария", 32, "Дом 2");
        System.out.println(man.toStrings());
        System.out.println(woman.toStrings());
    }



    public static class Man{
        public String name;
        public int age;
        public String address;


        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toStrings(){
            String str = null;
            return str.format("%s %d %s", name, age, address);
        }
    }
    public static class Woman{
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toStrings(){
            String str = null;
            return str.format("%s %d %s", name, age, address);
        }
    }
}
