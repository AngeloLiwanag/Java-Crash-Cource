import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main (String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("Amazon SDE", "Angelo Liwanag");
        userMap.put("Google Analyst", "Antony Liwanag");
        userMap.put("Oracle Analytics", "Antony Liwanag");

        String Name = userMap.get("Amazon SDE");
        // System.out.println(Name);

        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println("userMap key : " + key + " userMap value : " + userMap.get(key));
        }
    }
}