class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String w : words) {
            cnt.merge(w, 1, Integer::sum);
        }
        int m = s.length(), n = words.length;
        int k = words[0].length();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            Map<String, Integer> cnt1 = new HashMap<>();
            int l = i, r = i;
            int t = 0;
            while (r + k <= m) {
                String w = s.substring(r, r + k);
                r += k;
                if (!cnt.containsKey(w)) {
                    cnt1.clear();
                    l = r;
                    t = 0;
                    con
