package View;

import Controller.DanhBaController;

import java.util.Scanner;

public class CodeMain {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        choosefuncion();

    }

    public static void choosefuncion() {
        do {
            System.out.println("<<<<<<---Lựa chọn chức năng--->>>>>> \n" +
                    "Chọn chức năng theo số: \n" +
                    "1-Quản lí Thông Tin Danh Bạ .\n" +
                    "2-Kết thúc chương trình .");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    chooseThongtindanhbafuncion();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng sự lựa chọn !!!!!!!!");

            }

        } while (true);
    }

    public static void chooseThongtindanhbafuncion() {
        DanhBaController danhBaController = new DanhBaController();
        do {
            System.out.println("<<<<<<---Lựa chọn chức năng--->>>>>> \n" +
                    "Chọn chức năng theo số:\n" +
                    "1-Hiển thị Danh Bạ.\n" +
                    "2-Thêm mới Danh Bạ.\n" +
                    "3-Chỉnh sửa Danh Bạ\n" +
                    "4-Xóa Danh Bạ .\n" +
                    "5-Tìm kiếm Danh Bạ.\n" +
                    "6- Quay lại chương trình ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    danhBaController.dissPlayDanhBa();
                    break;
                case 2:
                    danhBaController.addNewDanhBa();
                    break;
                case 3:
                    danhBaController.updateDanhBa();
                    break;
                case 4:
                    danhBaController.deleteDanhBa();
                    break;
                case 5:
                    danhBaController.searchNhomdanhBa();
                    break;
                case 6:
                    return;
            }
        }while (true);
    }
}
