public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone " + merk + " " + model + " sedang dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone " + merk + " " + model + " sedang dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim Pesan: " + pesan + " Ke Nomor: " + nomorTujuan);
    }

    public void kirimPesan1(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim Pesan: " + pesan + " ke Nomor: " + nomorTujuan1 + " dan " + nomorTujuan2 + ".");
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        System.out.print("Mengirim Pesan: " + pesan + ", dengan Daftar Nomor: [");
        for (int i = 0; i < daftarNomor.length; i++) {
            System.out.print(daftarNomor[i]);
            if (i < daftarNomor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("].");
    }
}
