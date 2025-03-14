
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    private static final char START_CHAR_LOWER = 't';
    private static final char START_CHAR_UPPER = 'T';
    private static final char END_CHAR_LOWER = 'y';
    private static final char END_CHAR_UPPER = 'Y';


    public static String findTYPattern(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (start == -1 && (c == START_CHAR_LOWER || c == START_CHAR_UPPER)) {
                start = i;
            }

            if (start != -1 && (c == END_CHAR_LOWER || c == END_CHAR_UPPER)) {
                return s.substring(start, i + 1);
            }
        }
        return "";
    }

}

