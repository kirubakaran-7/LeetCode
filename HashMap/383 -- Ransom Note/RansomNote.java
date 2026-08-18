import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        int n = ransomNote.length();

        int m = magazine.length();

        for(int i = 0 ; i < n ; i++){
            char ch = ransomNote.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0 ; i < m ; i++){
            char ch = magazine.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for(char ch : map.keySet()){
            int required = map.get(ch);
            int available = map2.getOrDefault(ch,0);

            if(available < required ){
                return false;
            }
        }

        return true;

    }
}

