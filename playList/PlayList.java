import java.util.HashMap;
import java.util.Set;
public class PlayList {
    public static void main(String[] args) {
        HashMap<String, String> playList = new HashMap<String, String>();

        playList.put("Kid Cudi", "Reborn");
        playList.put("Travis Scott", "Mamacita");

        String firstTrack = playList.get("Kid Cudi");
        System.out.println("First track : " + firstTrack);

        Set<String> keys = playList.keySet();
        System.out.println("List of Keys in Hash Map : " + keys);

        for (String key : keys) {
            System.out.println("Artist Name: " + key + " Track Title: " + playList.get(key));
        }
    }
}