class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}

//Time Complexity : O(n)
// space Complexity : O(n)