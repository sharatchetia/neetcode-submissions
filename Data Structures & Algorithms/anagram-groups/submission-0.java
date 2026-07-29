class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();

        for (String words : strs){

            char[] cha = words.toCharArray();

            Arrays.sort(cha);

            String sorted = new String(cha);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(words);

        }
        return new ArrayList<>(map.values());
    }
}
