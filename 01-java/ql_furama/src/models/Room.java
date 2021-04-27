package models;

public class Room extends Services implements Comparable<Room> {

    String dichVuMienPhi;

    public Room() {
    }

    public Room(String id, String name, int dienTich, int soNguoiToiDa, double chiPhiThue, String trangThai, String dichVuMienPhi) {
        super(id, name, dienTich, soNguoiToiDa, chiPhiThue, trangThai);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String showInfor() {
        return "ID: " + id + " - " + "Name: " + name + " - " + "Diện Tích: " + dienTich + " - " + "Số Người Tối Đa: " + soNguoiToiDa + " - " + "Chi Phí Thuê: " + chiPhiThue + " - " + "Trạng Thái: " + trangThai
                + "Dịch vụ miễn phí: " + dichVuMienPhi;
    }

    @Override
    public int compareTo(Room o) {
        if (super.getName().compareTo(o.getName()) > 0) {
            return 1;
        } else if (super.getName().compareTo(o.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
