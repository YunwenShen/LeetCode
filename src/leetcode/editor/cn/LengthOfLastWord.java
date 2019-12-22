package leetcode.editor.cn;

/**
 * 58. 最后一个单词的长度
 * @author shenyw@citycloud.com.cn
 **/
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] letterArray = s.split(" ");
        if (!s.contains(" ")) {
            if (isLetter(letterArray[0])) {
                return letterArray[0].length();
            } else {
                return 0;
            }
        } else {
            if (letterArray.length >= 1) {
                return letterArray[letterArray.length - 1].length();
            } else {
                return 0;
            }
        }
    }

    private boolean isLetter(String s) {
        try {
            s.toUpperCase();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LengthOfLastWord word = new LengthOfLastWord();
        word.lengthOfLastWord(" ");
    }
}
