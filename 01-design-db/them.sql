insert into nhan_vien value(1,1,1,1,"Ngô Văn H","1999/08/12","12324324",12314100,"023423532","ngovanh@gmail.com","Đà Nẵng");
insert into nhan_vien value(2,1,1,1,"Ngô Văn T","1999/09/12","12324678",12314100,"023478979","ngovant@gmail.com","Quảng Trị");
insert into nhan_vien value(3,2,2,2,"Ngô Văn K","1999/10/12","12324567",20314100,"023445666","ngovank@gmail.com","Quảng Trị");
insert into nhan_vien value(4,2,2,2,"Ngô Văn A","1999/11/12","12324987",20314100,"023445679","ngovana@gmail.com","Đà Nẵng");

insert into trinh_do(Id_TrinhDo,Trinh_Do) value (1,"Cao Đẳng");
insert into trinh_do(Id_TrinhDo,Trinh_Do) value (2,"Đại Học");

insert into vitri value(1,"Nhân Viên");
insert into vitri value(2,"Trưởng Phòng");

insert into bo_phan value(1,"Marketing");
insert into bo_phan value(2,"Truyền Thông");


-- khách hàng

insert into loai_khach value(1,"");
insert into loai_khach value(2,"Loại 2");

insert into loai_khach value(3,"Diamond");
insert into loai_khach value(4,"Platinium");
insert into loai_khach value(5,"Gold");
insert into loai_khach value(6,"Silver");
insert into loai_khach value(7,"Member");


insert into khach_hang value(1,1,"Ngô Văn H","1995/03/02","12314234","0123121231","ngovah123@gmail.com","Đà Nẵng");
insert into khach_hang value(2,1,"Ngô Văn T","1995/12/12","12314234","0123121231","ngovat123@gmail.com","Đà Nẵng");
insert into khach_hang value(3,2,"Ngô Văn K","1995/07/07","12314234","0123121231","ngovak123@gmail.com","Quảng Trị");
insert into khach_hang value(4,2,"Ngô Văn V","1995/01/01","42341231","0123121231","ngovav123@gmail.com","Quảng Trị");

insert into khach_hang value(5,3,"Ngô Văn H","1995/03/02","12314234","0123121231","ngovah123@gmail.com","Đà Nẵng");
insert into khach_hang value(6,4,"Ngô Văn T","1995/12/12","12314234","0123121231","ngovat123@gmail.com","Đà Nẵng");
insert into khach_hang value(7,5,"Ngô Văn K","1995/07/07","12314234","0123121231","ngovak123@gmail.com","Quảng Trị");
insert into khach_hang value(8,6,"Ngô Văn V","1995/01/01","42341231","0123121231","ngovav123@gmail.com","Quảng Trị");
insert into khach_hang value(9,7,"Ngô Văn V","1995/01/01","42341231","0123121231","ngovav123@gmail.com","Quảng Trị");



select * from loai_khach;
select * from khach_hang;

-- dịch vụ
insert into loai_dich_vu value(1,"Villa");
insert into loai_dich_vu value(2,"House");
insert into loai_dich_vu value(3,"Room");

insert into kieu_thue value(1,"Theo Tháng",20000000);
insert into kieu_thue value(2,"Theo Ngày",1000000);

insert into dich_vu value(1,"Dich Vu A",10,1,"5",200000,1,1,"yes");
insert into dich_vu value(2,"Dich Vu B",10,1,"5",200000,2,2,"no");
insert into dich_vu value(3,"Dich Vu C",10,1,"5",200000,2,3,"yes");


insert into dich_vu_du_kien value(1,"massage",2000,"Đô","Yes");	
insert into dich_vu_du_kien value(2,"karaoke",2000,"Đô","Yes");	
insert into dich_vu_du_kien value(3,"thức ăn",2000,"Đô","Yes");	
insert into dich_vu_du_kien value(4,"nước uống",2000,"Đô","Yes");	
insert into dich_vu_du_kien value(5,"thuê xe",2000,"Đô","yes");	


-- hợp đồng

insert into hop_dong_chi_tiet value(1,1,1,1);
insert into hop_dong_chi_tiet value(2,2,2,1);
insert into hop_dong_chi_tiet value(3,3,3,1);


insert into hop_dong value(1,1,1,1,"2021/04/14","2021/05/15",2000000,20000000);
insert into hop_dong value(2,2,2,2,"2021/04/14","2021/05/15",2000000,20000000);
insert into hop_dong value(3,1,3,3,"2021/04/14","2021/05/15",2000000,20000000);



select * from nhan_vien;

SELECT * FROM trinh_do;

SELECT * FROM vitri;

SELECT * FROM bo_phan;
