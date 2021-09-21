package strings;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence="onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
        char array1[] = sentence.toLowerCase().toCharArray();

        int[] count = new int[26];

        for(int i = 0; i < array1.length;i++)
        {
            count[array1[i] - 'a']++;
        }
        System.out.println(Arrays.toString(count));
        Boolean bool=true;
        for(int i = 0; i <26; i++){
            if (count[i] == 0)
            {
                bool=false;
                break;
            }
        }

        if(bool) {
            System.out.println("Pangram");
        }else {
            System.out.println("Not");
        }

    }
    }

