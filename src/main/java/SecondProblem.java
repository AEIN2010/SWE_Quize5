import java.util.ArrayList;
import java.util.List;

public class SecondProblem {


    public String longestSubString(String text){

        String subString = "";
        List<String> substrings = new ArrayList<>();

        char[] textCharArray = text.toCharArray();
        for(int i = 0; i < textCharArray.length; i++){
            if(subString.indexOf(textCharArray[i]) != -1){

                substrings.add(subString);
                i = i-subString.length()+1;
                subString = textCharArray[i]+"";

            }else {
                subString = subString + textCharArray[i];
            }
        }
        substrings.add(subString);
        subString="";


        int length = 0;

        for (String s:substrings){
            if (s.length() > length){
                length = s.length();
                subString = s;
            }
        }

        return subString;
    }
}
