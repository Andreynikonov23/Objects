package nick.pack;

public class Dog {
    private String name;
    private int weight;


    //constructor with parameters
    public Dog (String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    //no parameters constructor
    public Dog(){}


    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }


    //toString
    public String toStrings(){
        String str = null;
        return str.format("%s, %d", name, weight);
    }
}
