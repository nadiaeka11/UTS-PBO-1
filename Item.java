public class Item {
    private double harga;
    private String nama;
    private String rank;
    private String quantity;

    public Item(double harga, String nama, String rank, String quantity){
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }
    public double getharga(){
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString(){
        return "Harga: " + getharga() + "\n" +
                "Nama: " + getNama() + "\n" +
                "Rank: " + getRank() + "\n" +
                "Quantity: " + getQuantity() + "\n";
    }
