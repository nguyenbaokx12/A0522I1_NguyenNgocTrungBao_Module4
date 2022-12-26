<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Complete</h1>
<h3>Họ tên: ${md.hoTen}</h3>
<h3>Năm sinh: ${md.namSinh}</h3>
<h3>Giới tính: ${md.gioiTinh}</h3>
<h3>Quốc tịch: ${md.quocTich}</h3>
<h3>Số hộ chiếu: ${md.hoChieu}</h3>
<h3>Thông tin đi lại: ${md.phuongTien}</h3>
<h3>Số hiệu phương tiện: ${md.soHieu}</h3>
<h3>Số ghế: ${md.soGhe}</h3>
<h3>Ngày khởi hành: ${md.ngayKhoiHanh}/${md.thangKhoiHanh}/${md.namKhoiHanh}</h3>
<h3>Ngày kết thúc: ${md.ngayKetThuc}/${md.thangKetThuc}/${md.namKetThuc}</h3>
<h3>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh nào không: ${md.diThanhPhoNao}</h3>
<h1>Địa chỉ liên lạc</h1>
<h3>Tỉnh / thành: ${md.tinh}</h3>
<h3>Quận / huyện: ${md.quan}</h3>
<h3>Phường/ xã: ${md.phuong}</h3>
<h3>Địa chỉ nơi ở: ${md.diaChi}</h3>
<h3>Điện thoại: ${md.dienThoai}</h3>
<h3>Email: ${md.email}</h3>
<h1>Trong vòng 14 ngày qua có triệu chứng gì không</h1>
<h3>Sốt: ${md.sot}</h3>
<h3>Ho: ${md.ho}</h3>
<h3>Sốt: ${md.sot}</h3>
<h3>Khó thở: ${md.khoTho}</h3>
<h3>Đau họng: ${md.dauHong}</h3>
<h3>Nôn/ buồn nôn: ${md.non}</h3>
<h3>Tiêu chảy: ${md.tieuChay}</h3>
<h3>Xuất huyết ngoài da: ${md.xuatHuyet}</h3>
<h3>Nổi ban ngoài da: ${md.noiBan}</h3>
<h3>Đến trang trại chăn nuôi/ chợ buôn bán
    động vật sống / cở sở mổ giết động vật/ tiếp xúc động vật: ${md.trangTrai}</h3>
<h3>Tiếp xúc gần (<2m) với người mắc bệnh
    viêm đường hô hấp do nCoV (*): ${md.tiepXuc}</h3>
</body>
</html>