public class StringUtils {
    public static boolean equalsString(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();

        return word.equals(searched);
    }
}
