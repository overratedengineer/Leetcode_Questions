 import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
      

        if (numRows == 1 || numRows >= s.length()) return s;
        int n = s.length();
        char[][] mat = new char[numRows][n];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(mat[i], '\0');
        }
        int r = 0, c = 0;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            mat[r][c] = s.charAt(i);
            if (flag) {
                if (r == numRows - 1) {
                    flag = false;
                    r--;
                    c++;
                } else {
                    r++;
                }
            } else {
                if (r == 0) {
                    flag = true;
                    r++;
                } else {
                    r--;
                    c++;
                }
            }
        }

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != '\0') {
                    result.append(mat[i][j]);
                }
            }
        }

        return result.toString();
    
    }
}