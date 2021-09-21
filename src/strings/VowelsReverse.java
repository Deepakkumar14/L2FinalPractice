package strings;

import java.util.Arrays;

public class VowelsReverse {
    public static void main(String[] args) {
        String s="practice";
        char[] str=s.toCharArray();
        for(int i=0,j=s.length()-1;i<s.length()/2;){
            if(!(str[i]=='a' ||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')){
                i++;
                continue;
            }
            if(!(str[j]=='a' ||str[j]=='e'||str[j]=='i'||str[j]=='o'||str[j]=='u')){
                j--;
                continue;
            }
            char t = str[i];
            str[i]= str[j];
            str[j]= t;
            i++;j--;
        }
        s="";
        for(int i=0;i< str.length;i++)
         s+=str[i];
        System.out.println(s);
        }
    }

