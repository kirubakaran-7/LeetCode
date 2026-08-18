import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int n = s1.length;
        int m = t1.length;

        if(n<m){
            return false;
        }

        for(int i = 0 ; i < n ; i++){
            char ch = s1[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i < m ; i++){
            char ch = t1[i];
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char ch : map.keySet()){
            int required = map.get(ch);
            int available = map2.getOrDefault(ch,0);

            if(available < required){
                return false;
            }
        }

        return true;

    }
}
