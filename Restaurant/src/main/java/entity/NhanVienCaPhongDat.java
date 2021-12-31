package entity;

public class NhanVienCaPhongDat {

    private int id;
    private NhanVienCa nvca;
    private PhongDat phongdat;

    public NhanVienCaPhongDat() {
    }

    public NhanVienCaPhongDat(int id, NhanVienCa nvca, PhongDat phongdat) {
        this.id = id;
        this.nvca = nvca;
        this.phongdat = phongdat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVienCa getNvca() {
        return nvca;
    }

    public void setNvca(NhanVienCa nvca) {
        this.nvca = nvca;
    }

    public PhongDat getPhongdat() {
        return phongdat;
    }

    public void setPhongdat(PhongDat phongdat) {
        this.phongdat = phongdat;
    }

}
