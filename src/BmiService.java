public class BmiService {
    public int calculate (double height, double mass) {
        int bodyMassIndex = (int) (mass / (height * height));
        return bodyMassIndex;
    }
}
