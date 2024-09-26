public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println(merk + " " + model + " feature phone menyala.");
    }

    @Override
    public void matikan() {
        System.out.println(merk + " " + model + " feature phone mati.");
    }

    public void mainGameSnake() {
        System.out.println("Bermain game Snake di " + merk + " " + model);
    }
}
