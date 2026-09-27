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
