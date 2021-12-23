import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên: ");
            System.out.println("2. Xóa sinh viên theo mã: ");
            System.out.println("3. sửa sinh viên theo mã");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. In ra dnh sách điểm trung bình");
            System.out.println("6. Tìm ra sinh viên có điểm cao nhất");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManager.createStudent(scanner);
                    System.out.println();
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println("Chọn id muốn xóa");
                    int id = scanner.nextInt();
                    studentManager.deleteById(id);
                    break;
                case 3:
                    System.out.println("Chọn id muốn sửa");
                    int idEdit = scanner.nextInt();
                    studentManager.editStudent(idEdit);
                    break;
                case 4:
                    System.out.println("Nhập vào mã muốn tìm");
                    int idFin = scanner.nextInt();
                    System.out.println(studentManager.findById(idFin));
                    break;
                case 5:
                    System.out.println(studentManager.findMaxScore());
                    break;
            }
        }while (choice!=0);
    }


}
