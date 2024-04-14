/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        String input1 =  "RLRRLLRLRL" ;
        int output1 = solution.balancedStringSplit(input1);
        System.out.println("Output = " + output1);

        String input2 =  "RLRRRLLRLL" ;
        int output2 = solution.balancedStringSplit(input2);
        System.out.println("Output = " + output2);

    }
}
