/*
class Solution {
    static int distinct(int M[][], int N) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < N; j++) {
                rowSet.add(M[i][j]);
            }
            for (int num : rowSet) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int count = 0;
        for (int val : map.values()) {
            if (val == N) count++;
        }

        return count;
    }
}

*/



