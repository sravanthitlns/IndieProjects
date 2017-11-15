package ransomnote;
import java.util.*;
public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        HashMap<String, Integer> magazineMap = new HashMap<>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            magazineMap.put(magazine[magazine_i], magazineMap.getOrDefault(magazine[magazine_i], 0) + 1);
        }
        String ransom[] = new String[n];
        HashMap<String, Integer> ransomMap = new HashMap<>();
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            ransomMap.put(ransom[ransom_i], ransomMap.getOrDefault(ransom[ransom_i], 0) + 1);
        }
        
        Optional<Integer> res = ransomMap.entrySet().stream().map(e -> magazineMap.getOrDefault(e.getKey(), 0) - e.getValue())
            .filter(e -> e < 0).findFirst();
        System.out.println(res.isPresent() ? "No" : "Yes");
    }
}
