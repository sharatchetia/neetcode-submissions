class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char n: s.toCharArray()){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(char n: t.toCharArray()){
            if(!map.containsKey(n)){
                return false;
            }
            map.put(n, map.get(n)-1);
            if(map.get(n)<0){
                return false;
            }
        }
        return true;
    }
}
