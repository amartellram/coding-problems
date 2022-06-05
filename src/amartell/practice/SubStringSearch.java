package amartell.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubStringSearch {
    public static int findSubstrings(String s) {

        List<String> set = new ArrayList<>();

        for (int i = 0; i< s.length();i++){
            boolean[] letters = new boolean[26];

            String result = "";
            for (int j = i;j<s.length();j++)
            {
                int pos = s.charAt(j)-'a';
                if(letters[pos])
                    break;
                letters[pos] = true;

                result+=s.charAt(j);
                System.out.println(result);
                set.add(result);
            }
        }

        return set.size();

    }

    public static void main(String[] args) {
        System.out.println(findSubstrings("bcada"));
    }
}
