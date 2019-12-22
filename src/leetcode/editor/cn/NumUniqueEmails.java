package leetcode.editor.cn;

/**
 * 929. 独特的电子邮件地址
 *
 * @author shenyw
 **/
public class NumUniqueEmails {

    public static int numUniqueEmails(String[] emails) {
        String[] result = new String[emails.length];
        int size = 0;
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String localName = email.split("@")[0];
            String hostName = email.split("@")[1];

            localName = localName.replaceAll("\\.", "");
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }
            if (!contain(result, localName + "@" + hostName)) {
                result[i] = localName + "@" + hostName;
                size ++;
            }
        }

        return size;
    }

    private static boolean contain(String[] array, String element) {
        for (String email : array) {
            if (element.equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
