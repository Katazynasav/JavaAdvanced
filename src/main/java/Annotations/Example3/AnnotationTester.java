package Annotations.Example3;

public class AnnotationTester {
    private static StudentInfo.StudentInfor studentInfor;

    public static void main(String[] args) {
        //informacija apie klases objekta
        Class<Student> object = Student.class;

        if (object.isAnnotationPresent(StudentInfo.StudentInfor.class)) {
            System.out.println("Anotacija yra prideta,info pateikta");
            System.out.println(studentInfor.studentAge());
            System.out.println(studentInfor.studentName());
        }
    }
}