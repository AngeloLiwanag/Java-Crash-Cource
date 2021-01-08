public class Output {
    public static void main(String[] args) {
        Pythagorean getPythagorean = new Pythagorean();
        int height = 4;
        int width = 5;
        double pythagorean = getPythagorean.calculateHypotenuse(height, width);
        System.out.println(pythagorean);
    }
}