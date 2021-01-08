public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Coding dojo is meh";
        int length = ninja.length();
        System.out.println("The string length is: " + length);

        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        String blurb = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(blurb);

        String phrase = "Welcome to Coding Dojo!";
        int a = phrase.indexOf("Coding"); // a is 11
        int b = phrase.indexOf("co"); // b is 3
        int c = phrase.indexOf("pizza"); // c is -1, "pizza" is not found

        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        String tempA = "HELLO";
        String tempB = "world";
        System.out.println(tempA.toLowerCase()); // hello
        System.out.println(tempB.toUpperCase()); // WORLD

        String testA = new String("word");
        String testB = new String("word");
        System.out.println(testA == testB); // false. not the same exact object.
        System.out.println(testA.equals(testB)); // true. same exact characters.
    }
}