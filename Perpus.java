import java.util.ArrayList;
import java.util.List;

public class Perpus {
    private List<Buku> listBuku;

    //constructor
    Perpus(){
        listBuku = new ArrayList<>();
    }

    //method untuk input buku
    void tambahBuku(String idBuku, String judul, int jumlah){
        Buku buku1 = new Buku(idBuku, judul, jumlah);
        listBuku.add(buku1);
    }

    //cek ketersediaan buku
    void cekKetersediaan(String idBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.getIdBuku() == idBuku) {
                if (currentBuku.bisaDiPinjam()) {
                    System.out.println("Buku " + currentBuku.getJudul() + " ready");
                } else {
                    System.out.println("Buku " + currentBuku.getJudul() + " kosong");
                }
            }
        }
    }

    //cek apakah buku dengan id tertentu ada
    void cekBuku(String idBuku){
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++){
            Buku check = listBuku.get(i);

            if(check.getIdBuku().equals(idBuku)){
                System.out.println("Buku Ada dengan judul : " + check.getJudul());
                bukuDitemukan = true;
                break;
            }
        }
        if (!bukuDitemukan) {
            System.out.println("Buku Tidak Ada");
        }
    }


    //cek buku dengan judul tertentu
    void caribuku(String judul){
        boolean bukuDitemukan = false;
        for (int j = 0; j < listBuku.size(); j++){
            Buku check = listBuku.get(j);

            if ((check.getJudul()).contains(judul)){
                System.out.println("Buku Ada : " + check.getJudul());
                bukuDitemukan = true;
            }
        }
        if (!bukuDitemukan) {
            System.out.println("Buku Tidak Ada");
        }
    }

}