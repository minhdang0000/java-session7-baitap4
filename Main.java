package baitap4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = "SV001";
        student1.studentName = "Nguyễn Văn A";
        student1.age = 20;
        student1.displayData();
        double avg1 = student1.calculateAvgScore(8.5, 7.0, 9.0);
        System.out.println("Điểm trung bình: " + avg1);

        Student student2 = new Student();
        student2.studentId = "SV002";
        student2.studentName = "Trần Thị B";
        student2.age = 19;
        student2.displayData();
        double avg2 = student2.calculateAvgScore(6.0, 8.0, 7.5);
        System.out.println("Điểm trung bình: " + avg2);
    }
}
