package models;

public class Villa extends Services implements Comparable<Villa> {

    String tieuChuanPhong;
    String moTaTienNghi;
    int dienTichHoBoi;
    int soTang;


    public Villa() {
    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, int dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String id, String name, int dienTich, int soNguoiToiDa, double chiPhiThue, String trangThai, String tieuChuanPhong, String moTaTienNghi, int dienTichHoBoi, int soTang) {
        super(id, name, dienTich, soNguoiToiDa, chiPhiThue, trangThai);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, int dienTichHoBoi) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
    }


    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "ID: " + id + " - " + "Name: " + name + " - " + "Diện Tích: " + dienTich + " - " + " Số Tầng: " + soTang + " - " + "Số Người Tối Đa: " + soNguoiToiDa + " - " + "Chi Phí Thuê: " + chiPhiThue + " - " + "Trạng Thái: " + trangThai
                + " - " + "Mô Tả Tiện Nghi: " + moTaTienNghi + " - " + "Tiêu Chuẩn Phòng: " + tieuChuanPhong + " - " + "Diện tích hồ bơi: " + dienTichHoBoi;
    }

    @Override
    public int compareTo(Villa o) {
        if (super.getName().compareTo(o.getName()) > 0) {
            return 1;
        } else if (super.getName().compareTo(o.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
