package Code_Capriccio.字符串.找出字符串中第一个匹配项的下标;

public class strStr {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "a";
        System.out.println(strStr(str1, str2));
    }

    public static int strStr(String haystack, String needle) {
        if(needle == "") return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean flag = true;
                int k = i;
                for (int j = 0; j < needle.length(); j++){
                    if (needle.charAt(j) != haystack.charAt(k)) {
                        flag = false;
                        break;
                    }
                    if (k == haystack.length() - 1 && j < needle.length() - 1) return -1;
                    k++;
                }
                if (flag == true) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * KMP解法
     * 构建next数组
     */
    public static void getNext(int[] next, String s) {
        int j = 0; // 前缀末尾
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
    }
    public int strStr2(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        getNext(next, needle);
        // 得到next数组

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }
}
