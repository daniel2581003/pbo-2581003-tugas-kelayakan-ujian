import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kehadiran (%) : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Nilai tugas : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Dispensasi : ");
        boolean dispensasi = scanner.nextBoolean();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);
        //Kesimpulan :
        // a dan b selalu sama alasannya operator && punya precedence yang lebih tinggi daripada ||.
        //c berbeda karena kurungnya digeser sehingga urutan nya berubah dan hasilnya berbeda dari a dan b
        // a=true, b=true, c=false

        int cek = 0;
        // cek tetap 0 karena (cek++>=0) tidak dijalankan
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);
        System.out.println();
        System.out.println("cek dipanggil : " + cek);
        // Operator && bersifat short-circuit dimana dimana ketika operand kiri false
        // maka hasil akhir sudah pasti menjadi false apapun nilai yang ada dikanannya, jadi java tidak menjalankan cek++>=0.
        // Operator || juga short-circuit dimana ketika operand kiri true maka hasil akhir akan menjadi true
        //apapun nilai di kanannya, jadi java tidak menjalankan (cek++ >=0).
        //karena (cek++ >=0) keduanya tidak dijalankan maka nilai cek tidak bertambah dan tetap 0

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi : " + dispensasi);
        System.out.println();
        System.out.println("a (tanpa kurung) : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser) : " + c);
        System.out.println("!dispensasi : " + !dispensasi);


    }
}