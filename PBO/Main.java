public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Xiaomi", "Redmi");
        daftarHandphone[1] = new FeaturePhone("Motorolla", "M16A4");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("08123456789", "Pesan ini penting.");
            hp.kirimPesan1("08987654321", "0819273645", "Kirimkan pesan ini ke 10 orang");
            String[] daftarNomor = {"1197047", "1197048"};
            hp.kirimPesan(daftarNomor, "Kupon Berhadiah!");
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).nyalakan();
                ((Smartphone) hp).aksesInternet();
                ((Smartphone) hp).kirimPesan("xixixi@gmail.com", "Diskon 10%", "Tukarkan pesan ini ke resto terdekat.");
                ((Smartphone) hp).matikan();
            } else if (hp instanceof FeaturePhone) {
                System.out.println();
                ((FeaturePhone) hp).nyalakan();
                ((FeaturePhone) hp).mainGameSnake();
                ((FeaturePhone) hp).matikan();
            }
        }
    }
}
