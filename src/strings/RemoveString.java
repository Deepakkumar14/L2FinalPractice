package strings;

public class RemoveString {
    public static void main(String[] args) {
       String string1 = "computer";
        String string2 = "cat";

        for(int i=0;i<string2.length();i++){
            String temp="";
            for(int j=0;j<string1.length();j++){
                if(string1.charAt(j)==string2.charAt(i)){
                    continue;
                }
                else{
                    temp+=string1.charAt(j);
                }
            }
            string1=temp;

        }
        System.out.println(string1);
    }

}
