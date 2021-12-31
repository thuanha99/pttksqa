package entity;

public class NhanVienCa {

    private int id;
    private NhanVien nv;
    private CaLam calam;

    public NhanVienCa() {
    }

    public NhanVienCa(int id, NhanVien nv, CaLam calam) {
        this.id = id;
        this.nv = nv;
        this.calam = calam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public CaLam getCalam() {
        return calam;
    }

    public void setCalam(CaLam calam) {
        this.calam = calam;
    }

}
