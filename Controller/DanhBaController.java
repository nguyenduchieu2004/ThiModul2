package Controller;

import IOStream.IODanhBa;
import Model.DanhBa;
import Service.DanhbaService;
import Service.IDanhbaService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DanhBaController {
    private static final Scanner sc = new Scanner(System.in);
    private static final IDanhbaService iDanhbaservice = new DanhbaService();

    public void dissPlayDanhBa() {
        List<DanhBa> danhBas = iDanhbaservice.findAll();
        for (DanhBa d : danhBas) {
            System.out.println(d);
        }
    }

    public void addNewDanhBa() {

        System.out.println(" Nhập vào nhóm Danh Ba");
        int Nhomdanhba = Integer.parseInt(sc.nextLine());
        if (iDanhbaservice.findByNhomdanhba(Nhomdanhba) == null) {
            System.out.println("Nhóm danh bạ hợp lệ :" + Nhomdanhba);
        } else {
            System.out.println("Nhóm danh bạ đã tồn tại!!!");
            return;
        }
        System.out.println("Nhập vao ten ");
        String name = sc.nextLine();
        System.out.println("Nhập vào Gioi Tinh :");
        String GioiTinh = sc.nextLine();
        System.out.println("Nhập vào Dia Chi:");
        String DiaChi = sc.nextLine();
        System.out.println("Nhập vào ngày sinh:");
        String temp = sc.nextLine();
        LocalDate NgaySinh = LocalDate.parse(temp);
        System.out.println("nhập vào email khách hàng");
        String email = sc.nextLine();
        System.out.println("Nhap vao so dien thoai");
        String Sodienthoai = sc.nextLine();
        DanhBa danhBa = new DanhBa(Nhomdanhba, name, GioiTinh, DiaChi, NgaySinh, email, Sodienthoai);
        iDanhbaservice.save(danhBa);
        dissPlayDanhBa();
    }

    public void updateDanhBa() {
        System.out.println(" Nhập vào nhóm Danh Ba");
        int Nhomdanhba = Integer.parseInt(sc.nextLine());
        DanhBa danhBa = iDanhbaservice.findByNhomdanhba(Nhomdanhba);
        if (danhBa != null) {
            System.out.println("tồn tại id !!!");

            System.out.println("Nhập vao ten ");
            String name = sc.nextLine();
            System.out.println("Nhập vào Gioi Tinh :");
            String GioiTinh = sc.nextLine();
            System.out.println("Nhập vào Dia Chi:");
            String DiaChi = sc.nextLine();
            System.out.println("Nhập vào ngày sinh:");
            String temp = sc.nextLine();
            LocalDate NgaySinh = LocalDate.parse(temp);
            System.out.println("nhập vào email khách hàng");
            String email = sc.nextLine();
            System.out.println("Nhap vao so dien thoai");
            String Sodienthoai = sc.nextLine();
            iDanhbaservice.update(danhBa);
            System.out.println("đã sữa thành công!!!");
        }
    }
    public void deleteDanhBa() {
        System.out.println("Nhập nhóm danh bạ cần xóa :");
        int Nhomdanhba = Integer.parseInt(sc.nextLine());
        if (iDanhbaservice.findByNhomdanhba(Nhomdanhba) != null) {
            DanhBa danhBa = iDanhbaservice.findByNhomdanhba(Nhomdanhba);
            System.out.println("bạn có chắc muốn xóa danh bạ:\n " + danhBa + "\n" +
                    "y (xóa) \n" + "n (hủy xóa)\n");
            String confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                iDanhbaservice.delete(Nhomdanhba);
                System.out.println("Danh bạ đã được xóa.");
            } else {
                System.out.println("Xóa danh Bạ đã bị hủy.");
            }
        } else {
            System.out.println("Không tồn tại Nhóm danh bạ này: " + Nhomdanhba);
        }
    }
    public static void searchNhomdanhBa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Nhóm danh bạ: ");
        int Nhomdanhba = Integer.parseInt(sc.nextLine());
        DanhBa danhBa = iDanhbaservice.findByNhomdanhba(Nhomdanhba);
        if (danhBa != null) {
            System.out.println("Danh Bạ tìm thấy: " + danhBa);
        } else {
            System.out.println("Không tồn tại nhóm này: " + Nhomdanhba);
        }
    }
}
