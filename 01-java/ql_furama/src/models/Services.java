package models;

public abstract class Services {

    String id;
    String name;
    int dienTich;

    int soNguoiToiDa;
    double chiPhiThue;
    String trangThai;

    public Services() {
    }

    public Services(String id, String name, int dienTich, int soNguoiToiDa, double chiPhiThue, String trangThai) {
        this.id = id;
        this.name = name;
        this.dienTich = dienTich;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }


    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public abstract String showInfor();


}
