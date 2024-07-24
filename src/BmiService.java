public class BmiService {
    public double calculate (double height, double mass) {
        int bodyMassIndex = (int) (mass / (height * height));
        return bodyMassIndex;
    }
}
