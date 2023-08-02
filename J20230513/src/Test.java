public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        System.out.println(stringBuilder);
        stringBuilder.append(1);
        stringBuilder.append("po");
        stringBuilder.append("abcd").append(12.5);
        System.out.println(stringBuilder);
        // 在这里只有一个对象 stringBuilder
        // 对象还是这一个对象, 如果用 + 就会一直新建对象
        // String 是不可变的对象 StringBuilder 和 StringBuffer 是可变的

        stringBuilder.setCharAt(0,'j');
        System.out.println(stringBuilder);

        stringBuilder.insert(1, "fefewewfwefwefwefwefewewf");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // 将其转化成字符串
        // StringBuider 和 StringBuffer 差不多
        String str = stringBuilder.toString();
        System.out.println(str);

        String name = "nan";
        //name.getChars();
    }
}

/*
class Solution {

    private boolean islegal(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int left = 0;
        int right = s1.length() - 1;
        while (right < left) {
            while(left < right && !islegal(s1.charAt(left))) {
                left++;
            }
            while (left < right && !islegal(s1.charAt(right))) {
                right--;
            }
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;

    }
}class Solution {

    private boolean islegal(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int left = 0;
        int right = s1.length() - 1;
        while (right < left) {
            while(left < right && !islegal(s1.charAt(left))) {
                left++;
            }
            while (left < right && !islegal(s1.charAt(right))) {
                right--;
            }
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;

    }
}
*/
/*

class Solution {
    public static boolean isValidChar(char ch){
        if((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
// 将大小写统一起来
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
// 1. 从左侧找到一个有效的字符
            while(left < right && !isValidChar(s.charAt(left))){
                left++;
            }
// 2. 从右侧找一个有效的字符
            while(left < right && !isValidChar(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}*/
