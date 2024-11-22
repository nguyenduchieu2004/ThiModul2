package Model;

import java.time.LocalDate;

public class DanhBa extends ThongTin{
    private String Sodienthoai;

    public DanhBa(int nhomcuadanhba, String ten, String gioitinh, String diachi, LocalDate ngaySinh, String email,String Sodienthoai) {
        super(nhomcuadanhba, ten, gioitinh, diachi, ngaySinh, email);
      this.Sodienthoai = Sodienthoai;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }
    public String convertToLine(){
        return super.getNhomcuadanhba()+","+super.getTen()+","+super.getGioitinh()+","+super.getDiachi()+","+super.getNgaySinh()+","+super.getEmail()+","+Sodienthoai;
    }
    @Override
    public String toString() {
        return "DanhBa{" +
                "Sodienthoai='" + Sodienthoai + '\'' +","+
                super.toString()+ "} " ;
    }
}
