package Q0003;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set1=new HashSet<>();
        int left=0,right=1;
        int MaxLen=0;
        if(s.isEmpty()){
            return 0;
        }
        set1.add(s.charAt(left));
        int len=1;
        while(true){
        while(right<s.length()&&set1.add(s.charAt(right))){
            len++;
            right++;
        }
        if(MaxLen<len){
            MaxLen=len;
        }
        if(right==s.length()){
            break;
        }
        set1.remove(s.charAt(left));
        len--;
        left++;}

        return MaxLen;
    }
}
