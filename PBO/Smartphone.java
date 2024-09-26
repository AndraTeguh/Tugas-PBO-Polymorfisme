public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang menyala.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim Pesan: " + pesan + " Ke Nomor: " + nomorTujuan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim Pesan ke: " + emailTujuan + "\nSubjek: " + subjek + "\nIsi Pesan: " + pesan);
    }

    public void aksesInternet() {
        System.out.println("Smartphone " + merk + "" + model + " mengakses internet.");
    }
}
