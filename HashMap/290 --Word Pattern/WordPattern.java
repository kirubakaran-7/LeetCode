import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

       HashMap<Character,Integer> map = new HashMap<>();
       HashMap<String,Integer> map2 = new HashMap<>();

       String[] str = s.split(" ");

       int n = pattern.length();
       int m = str.length;

        if(n != m){
            return false;
        }

       for(int i = 0 ; i < n ; i++ ){
        map.put(pattern.charAt(i),i);
       }

       for(int i = 0 ; i < n ; i++ ){
        map2.put(str[i],i);
       }

       for(int i = 0 ; i < n ; i++){
        if(!map.get(pattern.charAt(i)).equals(map2.get(str[i]))){
            return false;
        }
       }
       return true;
    }
}
