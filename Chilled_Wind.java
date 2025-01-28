public class Chilled_Wind {

    public double computeWindChill(double temp, double wind) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind, 0.16);
    }

    public static void main(String[] args) {
        WindChillCalculator calc = new WindChillCalculator();
        double temp = 30.0;
        double wind = 10.0;
        double result = calc.computeWindChill(temp, wind);
        System.out.println("Calculated wind chill: " + result);
    }
}
