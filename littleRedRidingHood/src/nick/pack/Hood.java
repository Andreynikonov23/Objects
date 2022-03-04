package nick.pack;

import java.util.ArrayList;

public class Hood {
    public ArrayList<Object> killed = new ArrayList<>();;
    public ArrayList<Object> ate = new ArrayList<>();
    public final String NAME = "Красная Шапочка";
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
        String str = NAME;
        String str1 = null;
        int count = 0;
        if (!(killed.isEmpty())){
            for (int i = 0; i < killed.size(); i++) {
                str1 = NAME + " убила" + killed.get(i);
            }
            count++;
            return str1;
        }
        if (!(ate.isEmpty())){
            for (int i = 0; i < killed.size(); i++) {
                str1 = NAME + " убила" + killed.get(i);
            }
            count++;
            return str1;
        }
        return str;
    }
}
