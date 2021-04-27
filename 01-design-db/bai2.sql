use ql_furama;

-- câu 21: Tạo khung nhìn 
create or replace view  V_NHANVIEN as 
	select 
		Id_NV, Dia_Chi 
    from 
		nhan_vien 
	inner join hop_dong using(Id_NV)
    where hop_dong.Ngay_Lam_Hop_Dong = '2021/04/14' and nhan_vien.Dia_Chi = 'Đà Nẵng';
    
	    
select * from V_NHANVIEN;

-- câu 22: 

update v_nhanvien 
set Dia_Chi = 'Liển Chiểu - Đà Nẵng'
where Dia_Chi = 'Đà Nẵng';

-- câu 23:

create index ix_khachhang on khach_hang(Dia_Chi);



-- câu 24:


-- câu 25:

DELIMITER //

create procedure Sp_1(
	in id_pr int,
    out message varchar(50)
)
if id_pr in(select * from khach_hang) then
begin
	delete from khach_hang where Id_KH = id_pr;
    set message = 'Đã xóa khách hàng';
end;
else
begin
	set message = 'Xóa không thành công';
end;
end if;

//  DELIMITER ;

CALL Sp_1(2, @message);

SELECT @message;

-- câu 26:

DELIMITER //



//  DELIMITER ;


-- câu 27:









	
  
    
    

