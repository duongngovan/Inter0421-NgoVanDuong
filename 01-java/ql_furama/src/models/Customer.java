package models;

import java.util.Comparator;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    int stt;
    String name;
    String ngaySinh;
    String gioiTinh;
    String cMND;
    String soDienThoai;
    String email;
    String loaiKhach;
    String diaChi;

    Services services;

    public Customer() {
    }

    public Customer(String name, String ngaySinh, String gioiTinh, String cMND, String soDienThoai, String email, String loaiKhach, String diaChi) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String name, String ngaySinh, String gioiTinh, String cMND, String soDienThoai, String email, String loaiKhach, String diaChi, Services services) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.services = services;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor() {
        return "STT: " +stt +" - "+ "Họ Tên: " + name + " - " + " Ngày Sinh: " + ngaySinh + " - " + "Giới Tính: " + " - " + gioiTinh + " Số CMND: " + cMND + " - " + " Số Điện Thoại: "
                + soDienThoai + " - " + " Email: " + email + " - " + " Loại Khách: " + loaiKhach + " - " + " Địa chỉ: " + diaChi ;
    }
    public String showInfors() {
        return "STT: " +stt +" - "+ "Họ Tên: " + name + " - " + " Ngày Sinh: " + ngaySinh + " - " + "Giới Tính: " + " - " + gioiTinh + " Số CMND: " + cMND + " - " + " Số Điện Thoại: "
                + soDienThoai + " - " + " Email: " + email + " - " + " Loại Khách: " + loaiKhach + " - " + " Địa chỉ: " + diaChi +" dịch vụ :"+services.showInfor();
    }


    @Override
    public int compareTo(Customer o) {
//        if (this.name.compareTo(o.getName())>0 ){
//            return 1;
//        } else if (this.name.compareTo(o.getName()) <0 ){
//            return -1;
//        }else if (name.compareTo(o.getName()) == 0){
//            if (ngaySinh.compareTo(o.getNgaySinh()) > 0){
//                return 0;
//            }
//        }
        if (name.compareTo(o.getName()) == 0 && ngaySinh.compareTo(o.getNgaySinh()) > 0) {
            return 0;
        } else if (name.compareTo(o.getName()) > 0) {
            return 1;
        } else
            return -1;

    }
}
