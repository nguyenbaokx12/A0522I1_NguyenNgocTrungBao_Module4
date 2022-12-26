package com.example.model;

public class MedicalDeclaration {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String quocTich;
    private String hoChieu;
    private String phuongTien;
    private String soHieu;
    private int soGhe;
    private int ngayKhoiHanh;
    private int thangKhoiHanh;
    private int namKhoiHanh;
    private int ngayKetThuc;
    private int thangKetThuc;
    private int namKetThuc;
    private String diThanhPhoNao;
    private String tinh;
    private String quan;
    private String phuong;
    private String diaChi;
    private int dienThoai;
    private String email;
    private boolean sot;
    private boolean ho;
    private boolean khoTho;
    private boolean dauHong;
    private boolean non;
    private boolean tieuChay;
    private boolean xuatHuyet;
    private boolean noiBan;
    private boolean trangTrai;
    private boolean tiepXuc;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String hoTen, String namSinh, String gioiTinh, String quocTich, String hoChieu,
                     String phuongTien, String soHieu, int soGhe, int ngayKhoiHanh, int thangKhoiHanh,
                     int namKhoiHanh, int ngayKetThuc, int thangKetThuc, int namKetThuc, String diThanhPhoNao,
                     String tinh, String quan, String phuong, String diaChi, int dienThoai, String email,
                     boolean sot, boolean ho, boolean khoTho, boolean dauHong, boolean non, boolean tieuChay,
                     boolean xuatHuyet, boolean noiBan, boolean trangTrai, boolean tiepXuc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.hoChieu = hoChieu;
        this.phuongTien = phuongTien;
        this.soHieu = soHieu;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.thangKhoiHanh = thangKhoiHanh;
        this.namKhoiHanh = namKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.thangKetThuc = thangKetThuc;
        this.namKetThuc = namKetThuc;
        this.diThanhPhoNao = diThanhPhoNao;
        this.tinh = tinh;
        this.quan = quan;
        this.phuong = phuong;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.non = non;
        this.tieuChay = tieuChay;
        this.xuatHuyet = xuatHuyet;
        this.noiBan = noiBan;
        this.trangTrai = trangTrai;
        this.tiepXuc = tiepXuc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getHoChieu() {
        return hoChieu;
    }

    public void setHoChieu(String hoChieu) {
        this.hoChieu = hoChieu;
    }

    public String getPhuongTien() {
        return phuongTien;
    }

    public void setPhuongTien(String phuongTien) {
        this.phuongTien = phuongTien;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public int getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(int ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public int getThangKhoiHanh() {
        return thangKhoiHanh;
    }

    public void setThangKhoiHanh(int thangKhoiHanh) {
        this.thangKhoiHanh = thangKhoiHanh;
    }

    public int getNamKhoiHanh() {
        return namKhoiHanh;
    }

    public void setNamKhoiHanh(int namKhoiHanh) {
        this.namKhoiHanh = namKhoiHanh;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getThangKetThuc() {
        return thangKetThuc;
    }

    public void setThangKetThuc(int thangKetThuc) {
        this.thangKetThuc = thangKetThuc;
    }

    public int getNamKetThuc() {
        return namKetThuc;
    }

    public void setNamKetThuc(int namKetThuc) {
        this.namKetThuc = namKetThuc;
    }

    public String getDiThanhPhoNao() {
        return diThanhPhoNao;
    }

    public void setDiThanhPhoNao(String diThanhPhoNao) {
        this.diThanhPhoNao = diThanhPhoNao;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isKhoTho() {
        return khoTho;
    }

    public void setKhoTho(boolean khoTho) {
        this.khoTho = khoTho;
    }

    public boolean isDauHong() {
        return dauHong;
    }

    public void setDauHong(boolean dauHong) {
        this.dauHong = dauHong;
    }

    public boolean isNon() {
        return non;
    }

    public void setNon(boolean non) {
        this.non = non;
    }

    public boolean isTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(boolean tieuChay) {
        this.tieuChay = tieuChay;
    }

    public boolean isXuatHuyet() {
        return xuatHuyet;
    }

    public void setXuatHuyet(boolean xuatHuyet) {
        this.xuatHuyet = xuatHuyet;
    }

    public boolean isNoiBan() {
        return noiBan;
    }

    public void setNoiBan(boolean noiBan) {
        this.noiBan = noiBan;
    }

    public boolean isTrangTrai() {
        return trangTrai;
    }

    public void setTrangTrai(boolean trangTrai) {
        this.trangTrai = trangTrai;
    }

    public boolean isTiepXuc() {
        return tiepXuc;
    }

    public void setTiepXuc(boolean tiepXuc) {
        this.tiepXuc = tiepXuc;
    }
}
