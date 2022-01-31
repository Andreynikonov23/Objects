package nick.pack;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;


    public boolean fight(Cat anotherCat){
        boolean meaning = false;
        int thisCount = 0;
        int anotherCount = 0;
        boolean oldCat = false;
        if (anotherCat.age >=6) {
            oldCat = true;
        }
        if (this.age < 6){
            if (this.age > anotherCat.age || oldCat == true){
                thisCount++;
            } else if(this.age == anotherCat.age){
            } else anotherCount++;
        } else if (this.age < anotherCat.age && oldCat == true){
            thisCount++;
        } else anotherCount++;
        boolean fatCat = false;
        if (anotherCat.weight > 4){
            fatCat = true;
        }
        if (this.weight < 4){
            if (this.weight > anotherCat.weight || fatCat == true){
                thisCount++;
            } else if(this.weight == anotherCat.weight){
            } else anotherCount++;
        } else if (this.weight < anotherCat.weight && fatCat == true){
            thisCount++;
        } else anotherCount++;
        if (this.strength > anotherCat.strength){
            thisCount++;
        } else if (this.strength == anotherCat.weight){

        }else anotherCount++;
        if (thisCount > anotherCount){
            meaning = true;
        } else if (thisCount == anotherCount){
            System.out.println("Ничья");
        }
        return meaning;
    }
}
