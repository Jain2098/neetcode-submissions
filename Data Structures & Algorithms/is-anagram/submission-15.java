class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        var ca1 = new char[26];

        for (int i=0; i<s.length(); i++){
            ca1[s.charAt(i)-'a']++;
            ca1[t.charAt(i)-'a']--;
        }

        for (char c: ca1){
            if (c!=0){
                return false;
            }
        }
        
        return true;

    }
}
