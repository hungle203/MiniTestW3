import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public Student editStudent(int id) {
        Student studentUpdate = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentUpdate = student;
            }
        }

        if (studentUpdate != null) {
            System.out.println("Nhập vào tên mới");
            String name = scanner.nextLine();
            studentUpdate.setName(name);
            System.out.println("Nhập vào tuổi mới");
            int age = scanner.nextInt();
            studentUpdate.setAge(age);
            System.out.println("Nhập diểm toán mới");
            double math = scanner.nextDouble();
            studentUpdate.setMathScore(math);
            System.out.println("Nhập vào điểm lý mới");
            double rea = scanner.nextDouble();
            studentUpdate.setPointOfReason(rea);
            System.out.println("Nhập vào điểm hóa mới");;
            double che = scanner.nextDouble();
            studentUpdate.setPointChemistry(che);
            return studentUpdate;
        }
        return null;
    }

    public static double mediumScore(Student student) {
        return (student.getMathScore() + student.getPointOfReason() + student.getPointChemistry()) / 3;
    }

//    public void sortByAvg() {
//     students.sort(new Comparator<Student>() {
//         @Override
//         public int compare(Student o1, Student o2) {
//             if ()
//         }
//     });
//    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findMaxScore() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : students) {
            double maxScore = 0;
            if (mediumScore(student) > maxScore) {
                students.add(student);
            }
            return student;
        }
        return null;
    }

    public ArrayList<Student> findById(int id) {
        ArrayList<Student> student = new ArrayList<>();
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student.add(student1);
            }
        }
        return student;
    }

    public ArrayList<Student> deleteById(int id) {
        ArrayList<Student> student = new ArrayList<>();
        for (Student s: students) {
            if (s.getId() == id) {
                student.add(s);
            }
        }
        students.remove(student);
        return student;
    }

        public Student createStudent(Scanner scanner){
            scanner.nextLine();
            System.out.println("Nhập vào tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập vào tuổi: ");
            int age = scanner.nextInt();
            System.out.println("Nhập vào điểm toán");
            double math = scanner.nextDouble();
            System.out.println("Nhập vào điểm lý: ");
            double rea = scanner.nextDouble();
            System.out.println("Nhập vào đểm Hóa");
            double che = scanner.nextDouble();

            return new Student(name, age, math, rea, che);
        }
    }

