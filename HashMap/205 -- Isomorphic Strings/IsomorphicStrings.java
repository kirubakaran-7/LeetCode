import java.util.HashMap;

public class IsomorphicStrings {
     public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();


        int n = s.length();
        int m = t.length();

        if(n != m){
            return false;
        }

        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i),i);
        }

        for(int i = 0 ; i < m ; i++){
            map2.put(t.charAt(i),i);
        }

        for(int i = 0 ; i < m ; i++){
         if(!map.get(s.charAt(i)).equals(map2.get(t.charAt(i)))){
            return false;
         }
        }
        return true;

    }
}
