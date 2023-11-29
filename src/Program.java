import Controler.StudentController;
import Controler.TeacherController;

public class Program {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Иванов", "Иван", "Иванович");
        studentController.create("Петров", "Петр", "Петрович");
        studentController.create("Абрамов", "Авраам", "Авраамович");
        studentController.create("Сидоров", "Сергей", "Сергеевич");
        System.out.println("___");
        studentController.printStudent();
        System.out.println("___");
        TeacherController teacherController = new TeacherController();
        teacherController.create("Катин", "Петр", "Евгеньевич");
        teacherController.create("Колин", "Павел", "Сергеевич");
        teacherController.printTeacher();
        System.out.println("___");
        teacherController.changeTeacherById(2, "Сашина", "Лиза", "Игоревна");
        System.out.println("___");

    }
}