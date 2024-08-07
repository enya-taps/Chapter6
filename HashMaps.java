import java.util.HashMap;

public class HashMaps
{
    private HashMap<String, String> map;
    public HashMaps(){
        
        map = new HashMap<>();
        
    }
    
    public void nummerEintragen(String name, String nummer){
        map.put(name, nummer);
    }
    
    public String nummerSuchen(String name){
        String nummer = map.get(name);
        return nummer;
    }
    
    public boolean containsName(String name){
        boolean me = map.containsKey(name);
        return me;
    }
    
    public void allKeys(){
        System.out.println(map.keySet());
    }
    
    
}


