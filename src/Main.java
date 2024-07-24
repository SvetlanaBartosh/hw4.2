public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 98;
        double mass = 1.87;
        int bodyMassIndex = (int) service.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
