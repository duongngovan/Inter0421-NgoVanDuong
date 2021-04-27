-- SELECT * FROM ql_furama.nhan_vien;

use ql_furama;

-- câu 2
select * from nhan_vien where (Ho_Ten like '%H%' OR Ho_Ten like '%T%' OR Ho_Ten like '%K%') and (LENGTH(Ho_Ten) < 15);

#select * from khach_hang where ();
-- câu 3
SELECT * FROM khach_hang where (YEAR(CURRENT_TIMESTAMP) - YEAR(Ngay_Sinh) - (RIGHT(CURRENT_TIMESTAMP, 5) < RIGHT(Ngay_Sinh, 5)) between 18 and 50 ) and (Dia_Chi in ("Đà Nẵng","Quảng Trị")) ;

-- câu 4 Đến xem tương ứng vơi mỗi  khách hàng đã từng đặt phòng bao nhiêu lần kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng
-- của khách hàng . Chỉ đếm những khách hàng nào  có Tên Loại kHác hàng là "Diamond"

select khach_hang.Ho_Ten, khach_hang.SDT, khach_hang.Dia_Chi, hop_dong_chi_tiet.So_Luong from ((khach_hang 
	inner join hop_dong on khach_hang.Id_KH = hop_dong.Id_KH)	
	inner join hop_dong_chi_tiet on hop_dong.Id_HD = hop_dong_chi_tiet.Id_HD 
	join loai_kh on khach_hang.Id_Loai_KH = loai_kh.Id_Loai_KH) 
where loai_kh.Ten_Loai_KH = "Diamond" order by hop_dong_chi_tiet.So_Luong asc  ;

-- câu 5 Hiển thị idkhachhang, hoten, loaikhachhang, idhopdong, tendichvu, ngaylamhopdong, ngayketthuc, tongtien( voi tong tien duoc tinh theo công thức như sau : chiphithue + soluong*gia voi soluong va gia  là từ bảng dichvudikem cho tất
--  cả khách hàng đã tường đặt phòng (những khác hàng nào chưa từng đặt phòng cũng hiển thị ra);

select khach_hang.Id_KH, khach_hang.Ho_Ten, loai_kh.Ten_Loai_KH,hop_dong.Id_HD, dich_vu_di_kem.Ten_Dich_Vu_Di_kem, hop_dong.Ngay_Lam_Hop_Dong, hop_dong.Ngay_Ket_Thu , (dich_vu.Chi_Phi_Thue + hop_dong_chi_tiet.So_Luong * dich_vu_di_kem.Gia) as 'Tổng Tiền'  
from ((khach_hang 
	inner join hop_dong on khach_hang.Id_KH = hop_dong.Id_KH) 
	inner join dich_vu on dich_vu.Id_Dv = hop_dong.Id_DV  
	inner join hop_dong_chi_tiet on hop_dong.Id_HD = hop_dong_chi_tiet.Id_HD 
	inner join loai_kh on khach_hang.Id_Loai_KH = loai_kh.Id_Loai_KH 
	inner join dich_vu_di_kem on dich_vu_di_kem.Id_Dich_Vu_Di_Kem = hop_dong_chi_tiet.Id_Dich_Vu_Di_kem);

-- câu 6 
select Id_DV, Ten_DV, Dien_Tich, Chi_Phi_Thue
from dich_vu
where Id_DV not in
(select dich_vu.Id_DV
from dich_vu
	inner join loai_dich_vu on dich_vu.Id_Loai_DV = loai_dich_vu.Id_Loai_DV
	inner join hop_dong on  hop_dong.Id_DV = dich_vu.Id_DV
where (year(hop_dong.Ngay_Lam_Hop_Dong) = '2021' and month(hop_dong.Ngay_Lam_Hop_Dong)  between 1 and 3)) ;

-- câu 7

select dv.Id_DV, dv.Ten_DV, Dien_Tich, dv.So_Nguoi_Toi_Da, dv.Chi_Phi_Thue, ldv.Ten_Loai_DV,hop_dong.Ngay_Lam_Hop_Dong
from dich_vu as dv 
	inner join loai_dich_vu as ldv on dv.Id_Loai_DV = ldv.Id_Loai_DV
    inner join hop_dong on hop_dong.Id_DV = dv.Id_DV
    inner join khach_hang on khach_hang.Id_KH = hop_dong.Id_KH
where year(hop_dong.Ngay_Lam_Hop_Dong) = '2021' and year(hop_dong.Ngay_Lam_Hop_Dong) != '2022';

-- câu 8
-- c1
select distinct  Ho_Ten from khach_hang;
-- c2 
select Ho_Ten from khach_hang group by Ho_Ten;
-- c3
select Ho_Ten from khach_hang 
where Id_KH not in(
SELECT  d2.Id_KH
FROM    khach_hang d1
        INNER JOIN khach_hang d2 ON d2.Ho_Ten=d1.Ho_Ten
WHERE d2.Id_KH > d1.Id_KH);


select * from khach_hang;

-- câu 9:

select month(hd.Ngay_Lam_Hop_Dong) as 'Tháng', sum(hd.Tong_Tien) as 'DoanhThu', count(hd.Id_KH) as 'Khách Hàng' from hop_dong as hd 
where year(hd.Ngay_Lam_Hop_Dong) = '2021' 
group by hd.Ngay_Lam_Hop_Dong; 

-- câu 10:
select hd.Id_HD, hd.Ngay_Lam_Hop_Dong, hd.Ngay_Ket_Thu, hd.Tien_Dat_Coc, count(hop_dong_chi_tiet.ID_Hop_Dong_CT) as 'So_Luong_Dich_Vu_Di_Kem' from hop_dong as hd
	inner join hop_dong_chi_tiet on hd.Id_HD = hop_dong_chi_tiet.Id_HD
group by hd.Id_HD;

-- câu 11:

select * from dich_vu_di_kem
	inner join hop_dong_chi_tiet on dich_vu_di_kem.Id_Dich_Vu_Di_Kem = hop_dong_chi_tiet.Id_Dich_Vu_Di_Kem
    inner join hop_dong on hop_dong.Id_HD = hop_dong_chi_tiet.Id_HD
    inner join khach_hang on khach_hang.Id_KH = hop_dong.Id_KH
    inner join loai_kh on loai_kh.Id_Loai_KH = khach_hang.Id_Loai_KH
where loai_kh.Ten_Loai_KH = 'Diamond' and khach_hang.Dia_Chi in ("Đà Nẵng", "Quảng Trị");


-- Câu 12:

select hop_dong.Id_HD, nhan_vien.Ho_Ten, khach_hang.Ho_Ten, khach_hang.SDT, dich_vu.Ten_DV, hop_dong_chi_tiet.ID_Hop_Dong_CT as 'SoLuongDichVuDiKem' , hop_dong.Tien_Dat_Coc, hop_dong.Ngay_Lam_Hop_Dong from hop_dong 
	inner join nhan_vien on nhan_vien.Id_NV = hop_dong.Id_NV
    inner join khach_hang on khach_hang.Id_KH = hop_dong.Id_KH
    inner join dich_vu on dich_vu.Id_DV = hop_dong.Id_DV
    inner join hop_dong_chi_tiet on hop_dong_chi_tiet.Id_HD = hop_dong.Id_HD
where (not month(hop_dong.Ngay_Lam_Hop_Dong) between 1 and 6) and (year(hop_dong.Ngay_Lam_Hop_Dong) = '2021' and   month(hop_dong.Ngay_Lam_Hop_Dong) between 10 and 12  );

-- câu 13:

select HD.Id_KH, dich_vu_di_kem.Ten_Dich_Vu_Di_Kem, count(hop_dong_chi_tiet.Id_HD) as 'SoLuong' from hop_dong as HD 
	inner join hop_dong_chi_tiet on HD.Id_HD = hop_dong_chi_tiet.Id_HD
    inner join dich_vu_di_kem on dich_vu_di_kem.Id_Dich_Vu_Di_Kem = hop_dong_chi_tiet.Id_Dich_Vu_Di_Kem
group by HD.Id_KH limit 1;

-- câu 14:
select hop_dong.Id_HD, dich_vu_di_kem.Ten_Dich_Vu_Di_Kem, count(hop_dong_chi_tiet.Id_Hop_Dong_CT) as 'SoLanSuDung' from hop_dong 
	inner join hop_dong_chi_tiet on hop_dong.Id_HD = hop_dong_chi_tiet.Id_HD
    inner join dich_vu_di_kem on dich_vu_di_kem.Id_Dich_Vu_Di_Kem = hop_dong_chi_tiet.Id_Dich_Vu_Di_Kem 
group by hop_dong.Id_KH having  SoLanSuDung = 1;

-- câu 15

select nhan_vien.Id_NV, nhan_vien.Ho_Ten, trinh_do.Trinh_Do, bo_phan.Ten_BP, nhan_vien.SDT, nhan_vien.Dia_Chi, count(hop_dong.Id_HD) as 'SoLuong' from nhan_vien
    inner join trinh_do on trinh_do.Id_TD = nhan_vien.Id_TD
    inner join bo_phan on bo_phan.Id_BP = nhan_vien.Id_BP
	inner join hop_dong on hop_dong.Id_NV = nhan_vien.Id_NV
where year(hop_dong.Ngay_Lam_Hop_Dong) between 2021 and 2022 group by hop_dong.Id_NV having SoLuong = 3;

-- câu 16:

delete from nhan_vien 
where not exists(
select * from hop_dong
	inner join nhan_vien on nhan_vien.Id_NV = hop_dong.Id_NV where year(hop_dong.Ngay_Lam_Hop_Dong) between 2017 and 2019) ;
    
-- câu 17:
update khach_hang
set khach_hang.Id_Loai_KH = 1
where Id_KH in 
(select * from hop_dong
	inner join khach_hang on khach_hang.Id_KH = hop_dong.Id_HD
    where year(hop_dong.Ngay_Lam_Hop_Dong) = 2021 and hop_dong.Tong_Tien > 10000000
);
-- câu 18:
delete from khach_hang
where Id_KH in 
(select * from hop_dong
	inner join hop_dong_chi_tiet on hop_dong_chi_tiet.Id_HD = hop_dong.Id_HD
    inner join dich_vu_di_kem on hop_dong_chi_tiet.Id_Dich_Vu_Di_Kem = dich_vu_di_kem.Id_Dich_Vu_Di_Kem
    where year(hop_dong.Ngay_Lam_Hop_Dong) < 2016
);


-- câu 19:
update dich_vu_di_kem
set  dich_vu_di_kem.Gia= dich_vu_di_kem.Gia * 10
where Id_Dich_Vu_Di_Kem in
(select count(hop_dong_chi_tiet.So_Luong) as 'SoLuong' from hop_dong_chi_tiet
	inner join dich_vu_di_kem on dich_vu_di_kem.Id_Dich_Vu_Di_Kem = hop_dong_chi_tiet.Id_Dich_Vu_Di_Kem
    where SoLuong = 10
);


    
-- câu 20:

select Id_NV as id, Ho_Ten, Email, SDT, Ngay_Sinh, Dia_Chi from nhan_vien
union 
select Id_KH as id, Ho_Ten, Email, SDT, Ngay_Sinh, Dia_Chi  from khach_hang;

-- câu 21

    



 