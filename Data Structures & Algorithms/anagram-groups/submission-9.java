class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> ga = new HashMap<>();

        for (String s: strs){
            // char[] a = s.toCharArray();
            // Arrays.sort(a);
            // String key = Arrays.toString(a);

            char[] alphabets = new char[26];
            for (char c : s.toCharArray()){
                alphabets[c - 'a']++;
            }
            
            String key = Arrays.toString(alphabets);

            ga.putIfAbsent(key, new ArrayList<>());
            ga.get(key).add(s);
        }

        return new ArrayList<>(ga.values());
        
    }
}
