class Solution {
    public boolean isAnagram(String s, String t) {
       String s1 = s.toLowerCase().replaceAll("\\s", "");
        String s2 = t.toLowerCase().replaceAll("\\s", "");
         boolean isAnagram = false;
        if (s1.length() == s2.length()) {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isAnagram = Arrays.equals(arr1, arr2);
        }
        return isAnagram;
    }
}