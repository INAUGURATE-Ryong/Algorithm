import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> colOrder = new HashMap<>();
        colOrder.put("code", 0);
        colOrder.put("date", 1);
        colOrder.put("maximum", 2);
        colOrder.put("remain", 3);
        
        int extCol = colOrder.get(ext);
        int sortByCol = colOrder.get(sort_by);

        List<int[]> filteredList = new ArrayList<>();
        for (int[] row : data) {
            if (row[extCol] < val_ext) {
                filteredList.add(row);
            }
        }

        int[][] filteredData = new int[filteredList.size()][];
        filteredList.toArray(filteredData);

        Arrays.sort(filteredData, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[sortByCol] - o2[sortByCol];
            }
        });

        return filteredData;
    }
}
