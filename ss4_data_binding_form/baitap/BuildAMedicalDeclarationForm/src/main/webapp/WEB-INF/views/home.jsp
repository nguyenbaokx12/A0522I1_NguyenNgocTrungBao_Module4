<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Khai báo y tế</title>
</head>
<body>
<h3>Tờ Khai báo y tế</h3>

<form:form modelAttribute="md" action="/add" method="post" >
    <fieldset>
        <legend>Tờ khai ý tế</legend>
        <table>
            <tr>
                <td><form:label path="hoTen">Họ tên (ghi chữ IN HOA):(*) </form:label></td>
                <td><form:input path="hoTen"/></td>
            </tr>
            <tr>
                <td><form:label path="namSinh">Năm Sinh </form:label></td>
                <td>
                    <form:select  path="namSinh">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <c:forEach step="1" begin="1990" end="2023" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="gioiTinh">Giới Tính: </form:label></td>
                <td>
                    <form:select  path="gioiTinh">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="Nam">Nam</form:option>
                        <form:option value="Nu">Nu</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="quocTich">Quốc Tịch:</form:label></td>
                <td>
                    <form:select  path="quocTich">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="VietNam">Việt Nam</form:option>
                        <form:option value="ThaiLan">Thái Lan</form:option>
                        <form:option value="US">US</form:option>
                        <form:option value="Canada">Canada</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="hoChieu">Hộ chiếu:(*) </form:label></td>
                <td><form:input path="hoChieu"/></td>
            </tr>
            <tr>
                <td><form:label path="phuongTien">Thông tin đi lại:(*) </form:label></td>
                <td><form:radiobuttons path="phuongTien" items="${pt}"/></td>
            </tr>
            <tr>
                <td><form:label path="soHieu">Số hiệu phương tiện:(*) </form:label></td>
                <td><form:input path="soHieu"/></td>
            </tr>
            <tr>
                <td><form:label path="soGhe">Số ghế:(*) </form:label></td>
                <td><form:input path="soGhe"/></td>
            </tr>
            <tr>
                <td><form:label path="ngayKhoiHanh">Ngày khởi hành (ngày):(*) </form:label></td>
                <td>
                    <form:select  path="ngayKhoiHanh">
                        <c:forEach step="1" begin="1" end="31" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="thangKhoiHanh">Tháng khởi hành (tháng):(*) </form:label></td>
                <td>
                    <form:select  path="thangKhoiHanh">
                        <c:forEach step="1" begin="1" end="12" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="namKhoiHanh">Năm khởi hành (năm):(*) </form:label></td>
                <td>
                    <form:select  path="namKhoiHanh">
                        <c:forEach step="1" begin="2015" end="2022" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="ngayKetThuc">Ngày kết thúc (ngày):(*) </form:label></td>
                <td>
                    <form:select  path="ngayKetThuc">
                        <c:forEach step="1" begin="1" end="31" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="thangKetThuc">Tháng kết thúc (tháng):(*) </form:label></td>
                <td>
                    <form:select  path="thangKetThuc">
                        <c:forEach step="1" begin="1" end="12" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="namKetThuc">Năm kết thúc (năm):(*) </form:label></td>
                <td>
                    <form:select  path="namKetThuc">
                        <c:forEach step="1" begin="2015" end="2022" var="item">
                            <form:option value="${item}">${item}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="diThanhPhoNao">Trong 14 ngày qua anh chị có đến thành phố nào khum:(*) </form:label></td>
                <td><form:textarea path="diThanhPhoNao"/></td>
            </tr>
            <tr>
                <td colspan="2"><h1>Địa chỉ liên lạc</h1></td>
            </tr>
            <tr>

                <td><form:label path="tinh">Tỉnh/Thành:(*) </form:label></td>
                <td>
                    <form:select  path="tinh">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="75">Huế</form:option>
                        <form:option value="43">Đà Nẵng</form:option>
                        <form:option value="74">Quảng Trị</form:option>
                        <form:option value="95">Quảng Nam</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="quan">Tỉnh/Thành:(*) </form:label></td>
                <td>
                    <form:select  path="quan">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="NguHanhSon">Ngũ Hành SƠn</form:option>
                        <form:option value="HaiChau">Hải Châu</form:option>
                        <form:option value="LienChieu">Liên Chiểu</form:option>
                        <form:option value="SonTra">Sơn Trà</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="phuong">Phường/Xã:(*) </form:label></td>
                <td>
                    <form:select  path="phuong">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="HoaHai">Hòa Hải</form:option>
                        <form:option value="HoaQuy">Hòa Quý</form:option>
                        <form:option value="XuanPhu">Xuân Phú</form:option>
                        <form:option value="VyDa">Vỹ Dạ</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="diaChi">Địa chỉ nơi ở:(*) </form:label></td>
                <td><form:input path="diaChi"/></td>
            </tr>
            <tr>
                <td><form:label path="dienThoai">Điện Thoại:(*) </form:label></td>
                <td><form:input path="dienThoai"/></td>
            </tr>
            <tr>
                <td><form:label path="email">Email:(*) </form:label></td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td colspan="2"><h1>Trong vòng 14 ngày qua anh chị có cảm thấy các trường hợp nào sau đây không</h1></td>
            </tr>
            <tr>

                <td><form:label path="sot">Sốt:(*) </form:label></td>
                <td>
                    <form:radiobutton path="sot" value="true" label="Có"/>
                    <form:radiobutton path="sot" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="ho">Ho:(*) </form:label></td>
                <td>
                    <form:radiobutton path="ho" value="true" label="Có"/>
                    <form:radiobutton path="ho" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="khoTho">Khó thở:(*) </form:label></td>
                <td>
                    <form:radiobutton path="khoTho" value="true" label="Có"/>
                    <form:radiobutton path="khoTho" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="dauHong">Đau họng:(*) </form:label></td>
                <td>
                    <form:radiobutton path="dauHong" value="true" label="Có"/>
                    <form:radiobutton path="dauHong" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="non">Nôn/ buồn nôn:(*) </form:label></td>
                <td>
                    <form:radiobutton path="non" value="true" label="Có"/>
                    <form:radiobutton path="non" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="tieuChay">Tiêu chảy:(*) </form:label></td>
                <td>
                    <form:radiobutton path="tieuChay" value="true" label="Có"/>
                    <form:radiobutton path="tieuChay" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="xuatHuyet">Xuất huyết ngoài da:(*) </form:label></td>
                <td>
                    <form:radiobutton path="xuatHuyet" value="true" label="Có"/>
                    <form:radiobutton path="xuatHuyet" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="noiBan">Nổi ban ngoài da:(*) </form:label></td>
                <td>
                    <form:radiobutton path="noiBan" value="true" label="Có"/>
                    <form:radiobutton path="noiBan" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <h1>Lịch sử phơi nhiễm trong 14 ngày qua</h1>
                <td><form:label path="trangTrai">Đến trang trại chăn nuôi/ chợ buôn bán
                    động vật sống / cở sở mổ giết động vật/ tiếp xúc động vật:(*) </form:label></td>
                <td>
                    <form:radiobutton path="trangTrai" value="true" label="Có"/>
                    <form:radiobutton path="trangTrai" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="tiepXuc">Tiếp xúc gần (<2m) với người mắc bệnh
                    viêm đường hô hấp do nCoV (*)</form:label></td>
                <td>
                    <form:radiobutton path="tiepXuc" value="true" label="Có"/>
                    <form:radiobutton path="tiepXuc" value="false" label="Không"/>
                </td>
            </tr>
            <tr>
                <td><form:button>Cancel</form:button></td>
                <td><form:button>Add</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>