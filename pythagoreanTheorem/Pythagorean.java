import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double baseA = legA;
        double baseB = legB;
        double exponent = 2;

        double hypotenuse = Math.sqrt((Math.pow(baseA, exponent) + Math.pow(baseB, exponent)));
        
        return hypotenuse;
    }
}