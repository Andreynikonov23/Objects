package nick.pack;

import java.util.ArrayList;

public class Woodcutter {
    public ArrayList<Object> killed = new ArrayList<>();;
    public ArrayList<Object> ate = new ArrayList<>();
    public final String NAME = "Дровосек";
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
        String str = "Дровосек";
        if (!(killed.isEmpty())){
            str = "Дровосек убил" + killed;
        }
        if (!(ate.isEmpty())){
            str = "Пирожок съел" + ate;
        }
        return str;
    }
}
