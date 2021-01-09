import java.util.ArrayList;
public class Basic {
    public static void print1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd1To255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSum() {
        int sum = 0;

        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public static void iterateArray() {
        int[] myArray = {1, 3, 4, 7, 9, 13};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void findMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void getAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = sum / arr.length;
        System.out.println(average);
    }

    public static void arrayOddNumbers() {
        ArrayList<Integer> oddArray = new ArrayList();

        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                oddArray.add(i);
            }
        }

        System.out.println(oddArray);
    }

    public static void greaterY(int[] arr, int num) {
        int greater = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                greater++;
            }
        }

        System.out.println(greater);
    }

    public static void squareValues(int[] arr) {
        ArrayList<Integer> squareArray = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            squareArray.add(arr[i] * arr[i]);
        }

        System.out.println(squareArray);
    }

    public static void noNegative(int[] arr) {
        ArrayList<Integer> noNegative = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                noNegative.add(arr[i]);
            } else {
                noNegative.add(0);
            }
        }
        
        System.out.println(noNegative);
    }

    public String minMaxAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }

            sum = sum + arr[i];
        }

        int avg = sum / arr.length;
        return ("min: " + min + " max: " + max + " avg: " + avg);
    }

    public static void shiftedArr(int[] arr) {
        ArrayList<Integer> shiftedArr = new ArrayList();
        int lastNumber = 0;

        for (int i = 1; i < arr.length; i++) {
            shiftedArr.add(arr[i]);
        }
        shiftedArr.add(lastNumber);

        System.out.println(shiftedArr);
    }
}