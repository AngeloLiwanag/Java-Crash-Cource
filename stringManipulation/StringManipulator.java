public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String trim1 = str1.trim();
        String trim2 = str2.trim();
        return trim1.concat(trim2);
    }

    public String getIndexOrNull(String str1, char char1) {
        int index = str1.indexOf(char1);
        if (index >= 0) {
            return String.format("%x", index);
        } else {
            return null;
        }
    }

    // Example of method overloading
    public String getIndexOrNull(String str1, String str2) {
        int index = str1.indexOf(str2);
        if (index >= 0) {
            return String.format("%x", index);
        } else {
            return null;
        }
    }

    public String concatSubstring(String str1, int startIndex, int endIndex, String str2) {
        String subString = str1.substring(startIndex, endIndex);
        return subString.concat(str2);
    }
}