class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m=grid.length;
        int n=grid[0].length;
      
        k%=m*n;
        List<Integer>arr=new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                arr.add(num);
            }
        }
        int size=m*n;
        ArrayList<Integer> shifted = new ArrayList<>(Collections.nCopies(size, 0));

        for (int i = 0; i < size; i++) {
            int newIndex = (i + k) % size;
            shifted.set(newIndex, arr.get(i));
        }
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < size; i += n) {
            List<Integer> row = new ArrayList<>();
            for (int j = i; j < i + n; j++) {
                row.add(shifted.get(j));
            }
            ans.add(row);
        }

        return ans;
    }
}