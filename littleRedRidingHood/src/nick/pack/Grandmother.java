package nick.pack;

import java.util.ArrayList;

public class Grandmother {
    public ArrayList<Object> killed = new ArrayList<>();
    public ArrayList<Object> ate = new ArrayList<>();
    public final String NAME = "Бабушка";

    public String getNAME() {
        return NAME;
    }

    public ArrayList<Object> killed(Object obj){
        killed.add(obj);
        return killed;
    }
    public ArrayList<Object> ate(Object obj){
        ate.add(obj);
        return ate;
    }
    public String toString(){
        String str = "Бабушка";
        if (!(killed.isEmpty())){
            str = "Бабушка убила" + killed;
        }
        if (!(ate.isEmpty())){
            str = "Бабушка съела" + ate;
        }
        return str;
    }
}
