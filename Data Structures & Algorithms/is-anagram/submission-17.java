class Solution {
    public boolean isAnagram(String s, String t) {

        var s1 = s.toCharArray();
        var s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);

    }
}
