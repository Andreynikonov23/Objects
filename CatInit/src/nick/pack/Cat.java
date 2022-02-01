package nick.pack;

public class Cat {
    public String name;
    public double age;
    public double weight;
    public String color;
    public String address;



    public void initName(String name){
        this.name = name;
    }
    public void initNameWeightAge(String name, double weight, double age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initNameAge (String name, double age){
        this.name = name;
        this.age = age;
        if (age >= 2.0){
            this.weight = 5.0;
        } else if (age < 0.5){
            this.weight = 0.4;
        } else if (age >=0.5){
            this.weight = 2.6;
        } else if (age >= 1.0){
            this.weight = 4.6;
        }
    }
    public void initWeightColor (double weight, String color){
        this.weight = weight;
        this.color = color;
        if (this.name == null) {
            this.name = "Бездомный кот";
        }
    }
    public void initWeightColorAddress(double weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        if (this.name == null) {
            this.name = "Чей-то домашний кот";
        }
    }
}
