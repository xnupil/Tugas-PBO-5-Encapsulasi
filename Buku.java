public class Buku {
    private String idBuku;
    private double rate;
    private String judul;
    private int jumlah;
    private int denda;
    private int totalRate;
    private int jmlReviewer;

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }

    public int getJmlReviewer() {
        return jmlReviewer;
    }

    public void setJmlReviewer(int jmlReviewer) {
        this.jmlReviewer = jmlReviewer;
    }

    Buku(String idBuku, String judul, int jumlah){
        this.idBuku = idBuku;
        this.judul = judul;
        this.jumlah = jumlah;
        this.rate = 0;
        this.totalRate = 0;
        this.jmlReviewer = 0;
    }

    Buku(){

    }

    boolean bisaDiPinjam(){
        if (jumlah > 0){
            return true;
        }
        return false;
    }
}