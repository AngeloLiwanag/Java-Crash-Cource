import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public ArrayList<Integer> printAndGreaterThan10(int[] arr) {
        ArrayList<Integer> greaterThan10 = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] > 10) {
                greaterThan10.add(arr[i]);
            }
        }

        return greaterThan10;
    }

    public ArrayList<String> shuffleAndLongerNames(ArrayList<String> arr) {
        ArrayList<String> longNames = new ArrayList();
        
        for (String s: arr) {
            System.out.println(s);
            if (s.length() > 5) { 
                longNames.add(s);
            }
        }
        
        return longNames;
    }

    public static void alphabet(ArrayList<Character> arr) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int lastIndex = arr.size() - 1;
        System.out.println(arr.get(lastIndex));
        System.out.println(arr.get(0));
        char first = arr.get(0);

        for (int i = 0; i < vowels.length; i++) {
            if (first == vowels[i]) {
                System.out.println("First index is a vowel!");
            }
        }
    }   

    public ArrayList<Integer> Random55To100() {
        Random r = new Random();
        ArrayList<Integer> random10 = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            random10.add(r.nextInt(45)+ 55);
        }

        return random10;
    }

    public ArrayList<Integer> Random55To100Sort() {
        Random r = new Random();
        ArrayList<Integer> random10 = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            random10.add(r.nextInt(45)+ 55);
        }

        Collections.sort(random10);
        return random10;
    }

    public String RandomStr() {
        ArrayList<Character> randomChar = new ArrayList<Character>();

        StringBuilder random = new StringBuilder();
        randomChar.add('a');
        randomChar.add('b');
        randomChar.add('c');
        randomChar.add('d');
        randomChar.add('e');
        randomChar.add('f');
        randomChar.add('g');
        randomChar.add('h');
        randomChar.add('i');
        randomChar.add('j');
        randomChar.add('k');
        randomChar.add('l');
        randomChar.add('m');
        randomChar.add('n');
        randomChar.add('o');
        randomChar.add('p');
        randomChar.add('q');
        randomChar.add('r');
        randomChar.add('s');
        randomChar.add('t');
        randomChar.add('u');
        randomChar.add('v');
        randomChar.add('w');
        randomChar.add('x');
        randomChar.add('y');
        randomChar.add('z');

        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            int randomIndex = r.nextInt(26);
            char someCharacter = randomChar.get(randomIndex);
            random.append(someCharacter);
        }

        String myString = random.toString();
        return myString;
    }

}