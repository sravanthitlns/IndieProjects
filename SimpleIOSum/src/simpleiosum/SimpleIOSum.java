/*
Given two natural numbers (both not greater than 200), each number in the separate line, please print the sum of them.

Example
Input:
2
3

Output:
5 and open the template in the editor.
 */
package simpleiosum;

import java.io.*;

public class SimpleIOSum {
    public static void main(String[] args) {
        // SPOJ : http://www.spoj.com/problems/TESTINT/
        try {
            BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
            String s;
            int sum = 0;
            while (!(s=r.readLine()).equals("")){
                sum = sum + Integer.parseInt(s);
            }
            System.out.println(sum);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
