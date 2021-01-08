public class StringManipulatorTesting {
    public static void main (String[] args) {
        StringManipulator manipulate = new StringManipulator();
        String str1 = "          Hello            ";
        String str2 = "          World            ";
        System.out.println(manipulate.trimAndConcat(str1, str2));

        String str3 = "Angelo";
        char letter = 'z';
        System.out.println(manipulate.getIndexOrNull(str3, letter));

        String str4 = "yoigs";
        System.out.println(manipulate.getIndexOrNull(str3, str4));

        System.out.println(manipulate.concatSubstring("Hello", 1, 2, "world"));
    }
}