package models;

public class House extends Services implements Comparable<House> {

    String tieuChuanPhong;
    String moTaTienNghi;
    int soTang;


    public House() {
    }

    public House(String tieuChuanPhong, String moTaTienNghi) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
    }

    public House(String id, String name, int dienTich, int soNguoiToiDa, double chiPhiThue, String trangThai, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super(id, name, dienTich, soNguoiToiDa, chiPhiThue, trangThai);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "ID: " + id + " - " + "Name: " + name + " - " + "Diện Tích: " + dienTich + " - " + " Số Tầng: " + soTang + " - " + "Số Người Tối Đa: " + soNguoiToiDa + " - " + "Chi Phí Thuê: " + chiPhiThue + " - " + "Trạng Thái: " + trangThai
                + " - " + " Tiêu chuẩn phòng: " + tieuChuanPhong + " - " + " Mô Tả Tiện Nghi: " + moTaTienNghi;
    }

    @Override
    public int compareTo(House o) {
        if (super.getName().compareTo(o.getName()) > 0) {
            return 1;
        } else if (super.getName().compareTo(o.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }


}
