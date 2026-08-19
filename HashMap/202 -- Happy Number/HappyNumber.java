import java.util.HashMap;

public class HappyNumber {
     
    public boolean isHappy(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (n != 1){
            
           if(map.containsKey(n)){
            return false;
           }

            map.put(n,1);

            int sum = 0;

            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
           n = sum;
        }
        return true;
    }
}
