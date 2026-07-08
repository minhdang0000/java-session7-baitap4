package baitap4;

public class Student {
    String studentId;
    String studentName;
    int age;

    public void displayData() {
        System.out.println("--- Thông tin sinh viên ---");
        System.out.println("Mã sinh viên : " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi         : " + age);
    }

    public double calculateAvgScore(double math, double physics, double chemistry) {
        return (math + physics + chemistry) / 3;
    }
}
