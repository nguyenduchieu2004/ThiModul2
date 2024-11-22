package Model;

import java.time.LocalDate;

public class ThongTin {
    private int Nhomcuadanhba ;
    private String ten;
    private String Gioitinh ;
    private String Diachi ;
    private LocalDate NgaySinh ;
    private String Email ;

    public ThongTin(int nhomcuadanhba, String ten, String gioitinh, String diachi, LocalDate ngaySinh, String email) {
        Nhomcuadanhba = nhomcuadanhba;
        this.ten = ten;
        Gioitinh = gioitinh;
        Diachi = diachi;
        NgaySinh = ngaySinh;
        Email = email;
    }

    public int getNhomcuadanhba() {
        return Nhomcuadanhba;
    }

    public void setNhomcuadanhba(int nhomcuadanhba) {
        Nhomcuadanhba = nhomcuadanhba;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return
                "Nhomcuadanhba='" + Nhomcuadanhba + '\'' +
                ", ten='" + ten + '\'' +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", Email='" + Email + '\'' +
                '}';
    }
}
