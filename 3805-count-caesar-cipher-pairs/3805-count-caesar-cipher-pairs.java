class Solution {
    public long countPairs(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        long ans = 0;

        for (String s : words) {
            String t = pairs(s);
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (int i : map.values()) {
            if (i > 1) {
                ans += (long)i * (i - 1) / 2; 
            }
        }

        return ans;
    }

    public String pairs(String s) {
        int base = s.charAt(0) - 'a';
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int diff = (c - 'a' - base + 26) % 26;
            sb.append(diff).append(',');
        }

        return sb.toString();
    }
}
