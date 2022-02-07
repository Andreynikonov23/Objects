package nick.pack;

public class Human {
    private String name;
    private int age;
    private String status;
    private String instrument;
    private int experience;
    private String achievement;

    public Human(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Human(String name, int age, String status, String instrument, int experience) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.instrument = instrument;
        this.experience = experience;
    }

    public Human(String name, int age, String status, int experience, String achievement) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.experience = experience;
        this.achievement = achievement;
    }

    public Human(String name, int age, String status, String achievement) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.achievement = achievement;
    }
    
}
