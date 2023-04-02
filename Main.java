public class Main {
    public static void main(String[] args) {

        Perpus perpusat = new Perpus();

        perpusat.tambahBuku("1001", "Naruto", 5);
        perpusat.tambahBuku("1002", "Sasuke", 2);
        perpusat.tambahBuku("1003", "Sakura", 1);
        perpusat.tambahBuku("1004", "Hinata", 10);
        perpusat.tambahBuku("1005", "Kakashi", 5);
        perpusat.tambahBuku("1006", "Goku", 0);
        perpusat.tambahBuku("1007", "Phonk", 2);
        perpusat.tambahBuku("1008", "Tsunade", 66);
        perpusat.tambahBuku("1010", "Minato", 8);
        perpusat.tambahBuku("1009", "r34", 3);

        perpusat.caribuku("Naruto");
        perpusat.caribuku("Tsunade");

        perpusat.cekBuku("1005");

        perpusat.cekKetersediaan("1004");

    }
}
