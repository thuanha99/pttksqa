package entity;

public class Phong {

    private int id;
    private String ten, co, hang;
    private float gia;
    private String mota;
    private NhaHang nhahang;

    public Phong() {
    }

    public Phong(int id, String ten, String co, String hang, float gia, String mota, NhaHang nhahang) {
        this.id = id;
        this.ten = ten;
        this.co = co;
        this.hang = hang;
        this.gia = gia;
        this.mota = mota;
        this.nhahang = nhahang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public NhaHang getNhahang() {
        return nhahang;
    }

    public void setNhahang(NhaHang nhahang) {
        this.nhahang = nhahang;
    }

    @Override
    public String toString() {
        return "Phong{" + "id=" + id + ", ten=" + ten + ", co=" + co + ", hang=" + hang + ", gia=" + gia + '}';
    }
    
}
