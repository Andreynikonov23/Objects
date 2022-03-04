package nick.pack;

import java.util.ArrayList;

public class Wolf {
    public ArrayList<Object> killed = new ArrayList<>();
    public ArrayList<Object> ate = new ArrayList<>();
    public final String NAME = "Волк";
    public ArrayList<Object> killed(Object obj){
        killed.add(obj);
        return killed;
    }
    public ArrayList<Object> ate(Object obj){
        ate.add(obj);
        return ate;
    }
    public String getNAME() {
        return NAME;
    }
    public String toString(){
        String str = "Волк";
        if (!(killed.isEmpty())){
            str = "Волк убил" + killed;
        }
        if (!(ate.isEmpty())){
            str = "Волк съел" + ate;
        }
        return str;
    }
}
