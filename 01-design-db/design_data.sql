create database ql_furama;

use ql_furama;

create table Vi_Tri(
	Id_VT int not null primary key auto_increment,
    Ten_VT varchar(45));
    
create table Trinh_Do(
	Id_TD int not null primary key auto_increment,
    Trinh_Do varchar(45));
    
create table Bo_Phan(
	Id_BP int not null primary key auto_increment,
    Ten_BP varchar(45));   
    
-- drop table Vi_Tri;
-- drop table Trinh_Do;
-- drop table Bo_Phan;
    
create table Nhan_Vien(
	Id_NV int not null primary key auto_increment,
    Id_VT int not null,
    Id_TD int not null,
    Id_BP int not null,
    Ho_Ten varchar(50),
    Ngay_Sinh date,
    So_CMND varchar(45),
    Luong varchar(45),
    SDT varchar(10),
    Email varchar(45),
    Dia_Chi varchar(45),
    foreign key (Id_VT) references vi_tri(Id_VT),
    foreign key (Id_TD) references trinh_do(Id_TD),
    foreign key (Id_BP) references bo_phan(Id_BP)
    );
    
   
    
create table Loai_KH(
	Id_Loai_KH int not null primary key auto_increment,
    Ten_KH varchar(45)
    );
    
create table Khach_Hang(
	Id_KH int not null primary key auto_increment,
    Id_Loai_KH int not null,
    Ho_Ten varchar(45),
    Ngay_Sinh date,
    So_CMND varchar(45),
    SDT varchar(10),
    Email varchar(45),
    Dia_Chi varchar(45),
    
	foreign key (Id_Loai_KH) references loai_kh(Id_Loai_Kh)
    );

create table Kieu_Thue(
	Id_KT int not null primary key auto_increment,
    Ten_KT varchar(50),
    Gia int);
    
    
create table Loai_Dich_Vu(
    Id_Loai_DV int not null primary key auto_increment,
    Ten_Loai_DV varchar(50)
);



create table Dich_Vu(
	Id_DV int not null primary key auto_increment,
    Ten_DV varchar(50),
    Dien_Tich int,
    So_Tang int,
    So_Nguoi_Toi_Da varchar(50),
    Chi_Phi_Thue varchar(50),
    Id_KT int,
    Id_Loai_DV int,
    Trang_Thai varchar(50),
    foreign key (Id_KT) references kieu_thue(Id_KT),
    foreign key (Id_Loai_DV) references loai_dich_vu(Id_Loai_DV));
    
create table Dich_Vu_Kem(
	Id_Dich_Vu_Kem int not null primary key auto_increment,
    Ten_Dich_Vu_Kem varchar(50),
    Gia int,
	Don_Vi int,
    Trang_Thai varchar(50));
create table Hop_Dong(
	Id_HD int not null primary key auto_increment,
    Id_NV int not null,
    Id_KH int,
    Id_DV int,
    Ngay_Lam_Hop_Dong date,
    Ngay_Ket_Thu date,
    Tien_Dat_Coc int,
    Tong_Tien int,
    
    foreign key (Id_NV) references nhan_vien(Id_NV),
    foreign key (Id_KH) references khach_hang(Id_KH),
    foreign key (Id_DV) references dich_vu(Id_DV));
    
create table Hop_Dong_Chi_Tiet(
	Id_Hop_Dong_CT int not null primary key auto_increment,
    Id_HD int,
    Id_Dich_Vu_Kem int,
    So_Luong int,
    foreign key (Id_HD) references hop_dong(Id_HD),
    foreign key (Id_Dich_Vu_Kem) references dich_vu_kem(Id_Dich_Vu_Kem));

    
-- Thêm dữ liệu
-- Vị trí
insert into vi_tri(Ten_VT) value("Lễ Tân");
insert into vi_tri(Ten_VT) value("Phục Vụ");
insert into vi_tri(Ten_VT) value("Giám Sát");
insert into vi_tri(Ten_VT) value("Chuyên Viên");
insert into vi_tri(Ten_VT) value("Quản Lý");
insert into vi_tri(Ten_VT) value("Giám Đốc");
-- Trình độ

insert into trinh_do(Trinh_Do) value("Trung Cấp");
insert into trinh_do(Trinh_Do) value("Cao Đẳng");
insert into trinh_do(Trinh_Do) value("Đại Học");
insert into trinh_do(Trinh_Do) value("Sau Đại Học");

-- Bộ Phận

insert into bo_phan(Ten_Bp) value("Sale - Marketing");
insert into bo_phan(Ten_Bp) value("Hành Chính");
insert into bo_phan(Ten_Bp) value("Phục Vụ");
insert into bo_phan(Ten_Bp) value("Quản lý");

-- Nhân Viên

insert into nhan_vien value(1,1,1,1,"Ngô Văn H", "1999/07/20","123141312",123,"0398777761","ngovanh@gmail.com","Đà Nẵng");
insert into nhan_vien value(2,2,2,2,"Ngô Văn T", "1999/07/20","123141312",123,"0398777761","ngovant@gmail.com","Đà Nẵng");
insert into nhan_vien value(3,3,3,3,"Ngô Văn K", "1999/07/20","123141312",123,"0398777761","ngovank@gmail.com","Quảng Trị");
insert into nhan_vien value(4,4,4,4,"Ngô Văn V", "1999/07/20","123141312",123,"0398777761","ngovanv@gmail.com","Quảng Trị");



-- Loại khách hàng

insert into loai_kh(Ten_KH) value("Diamond");
insert into loai_kh(Ten_KH) value("Platinium");
insert into loai_kh(Ten_KH) value("Gold");
insert into loai_kh(Ten_KH) value("Silver");
insert into loai_kh(Ten_KH) value("Member");

-- Khách hàng

insert into khach_hang value(1,1,"Ngô Văn A","1995/07/07","123231423","0398666661","ngovana@gmail.com","Đà Nẵng");
insert into khach_hang value(2,2,"Ngô Văn A","1995/07/07","123231423","0398666661","ngovana@gmail.com","Đà Nẵng");
insert into khach_hang value(3,3,"Ngô Văn A","1995/07/07","123231423","0398666661","ngovana@gmail.com","Đà Nẵng");
insert into khach_hang value(4,4,"Ngô Văn A","1995/07/07","123231423","0398666661","ngovana@gmail.com","Đà Nẵng");
insert into khach_hang value(5,5,"Ngô Văn A","1995/07/07","123231423","0398666661","ngovana@gmail.com","Đà Nẵng");



-- Loại Dịch Vụ

insert into loai_dich_vu value(1,"Villa");
insert into loai_dich_vu value(2,"House");
insert into loai_dich_vu value(3,"Room");

-- Kiểu Thuê;

insert into kieu_thue value(1,"Năm",1000);
insert into kieu_thue value(2,"Tháng",1000);
insert into kieu_thue value(3,"Ngày",1000);
insert into kieu_thue value(4,"Giờ",1000);

-- Dịch vụ;

insert into dich_vu value(1,"Dịch Vụ A",1,1,"4","20000",1,1,"yes");
insert into dich_vu value(2,"Dịch Vụ A",1,1,"4","20000",2,2,"yes");
insert into dich_vu value(3,"Dịch Vụ A",1,1,"4","20000",3,3,"yes");
insert into dich_vu value(4,"Dịch Vụ A",1,1,"4","20000",4,1,"yes");

-- hợp đồng

insert into hop_dong value(1,1,1,1,"2021/04/14","2021/05/14",1000,20000);
insert into hop_dong value(2,2,2,2,"2021/04/14","2021/05/14",1000,20000);
insert into hop_dong value(3,3,3,3,"2021/04/14","2021/05/14",1000,20000);
insert into hop_dong value(4,4,4,4,"2021/04/14","2021/05/14",1000,20000);

-- dịch vụ kèm

insert into dich_vu_kem value(1,"massage",1000,1,"yes");
insert into dich_vu_kem value(2,"karaoke",1000,1,"yes");
insert into dich_vu_kem value(3,"thức ăn",1000,1,"yes");
insert into dich_vu_kem value(4,"nước uống",1000,1,"yes");
insert into dich_vu_kem value(5,"thuê xe",1000,1,"yes");

-- hợp đồng chi tiết 

insert into hop_dong_chi_tiet value(1,1,1,1);
insert into hop_dong_chi_tiet value(2,2,2,2);
insert into hop_dong_chi_tiet value(3,3,3,3);
insert into hop_dong_chi_tiet value(4,4,4,4);
