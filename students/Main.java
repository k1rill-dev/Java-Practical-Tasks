package students;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
//    1.Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
//    2.Создать коллекцию, содержащую объекты класса Student.
//   3.Написать метод, который удаляет студентов со средним баллом <3.
//   4.Если средний балл >= 3, студент переводится на следующий курс.
//   5.Напишите метод printStudents(List<Student> students, int course), который
//    получает список студентов и номер курса.
//    6.А также печатает на консоль имена тех студентов из списка, которые обучаются на
//    данном курсе.
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Kirill", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,5,4,2)));
        students.add(new Student("Kolya", "IS-24", 2, Arrays.asList(5,5,5,5)));
        students.add(new Student("Danila", "IS-31", 3, Arrays.asList(4,4,5,5,4,2)));
        students.add(new Student("Rita", "IS-32", 3, Arrays.asList(5,4,2)));
        students.add(new Student("Kubara", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,5)));
        students.add(new Student("Lisa", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,4,4,4)));
        System.out.println("Все студенты:");
        for (Student student:
             students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Новый список без тех, у кого средние оценки <=3");
        List<Student> newStudents = deleteWithTrashAvg(students);
        for (Student student:
                newStudents) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Переведенные на новый курс: ");
        List<Student> nextCourse = upcastToNextCourse(students);
        for (Student student:
                nextCourse) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Печатаем студентов 4 курса:");
        printStudents(nextCourse, 4);
    }
    public static Long getAvgMark(Student student){
        return student.getMarks().stream().mapToInt(Integer::intValue).sum() / student.getMarks().stream().count();
    }
    public static List<Student> deleteWithTrashAvg(List<Student> students){
        students.removeIf(student -> getAvgMark(student) <= 3);
        return students;
    }

    public static List<Student> upcastToNextCourse(List<Student> students){
        for (Student student:
             students) {
            if(getAvgMark(student) > 3) student.setCourse(student.getCourse() + 1);
        }
        return students;
    }
    public static void printStudents(List<Student> students, int course){
        for (Student student:
             students) {
            if(student.getCourse() == course) System.out.println(student);
        }
    }
}