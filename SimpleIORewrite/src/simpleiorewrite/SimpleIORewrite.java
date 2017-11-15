/*Rewrite small numbers from input to output. 
Stop processing input after reading in the number 42. 
All numbers at input are integers of one or two digits.

Example Input:
1
2
88
42
99

Output:
1
2
88*/

package simpleiorewrite;

import java.io.*;
import java.util.logging.*;

public class SimpleIORewrite {

    public static void main(String[] args) {
        // SPOJ : http://www.spoj.com/problems/TEST/
        try {
            BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
            String s;
            while (!(s=r.readLine()).startsWith("42")){
                System.out.println(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(SimpleIORewrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
