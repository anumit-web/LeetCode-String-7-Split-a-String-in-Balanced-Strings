/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int balancedStringSplit(String s) {

        int substring = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') {
                count++;
            } 

            if (s.charAt(i) == 'L') {
                count--;
            } 

            if (count == 0) {
                substring++;
            }
        }

        return substring;
    }

}
