package leetcode;

public class compareStrings {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        
        int i = 0, j = 0;
        while (i < str1.length && j < str2.length) {
            if (str1[i].compareTo(str2[j]) != 0) {
                return str1[i].compareTo(str2[j]);
            }
            i++;
            j++;
        }
        if (i < str1.length) {
            return 1;
        }
        if (j < str2.length) {
            return -1;
        } 
        return 0;
    }
    
    public String[] convert (String strs) {
        if (strs.contains(".")) {
            return strs.split(".");
        }
        return new String[]{strs};
    }
}