package Service;

import Data.Student;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, countMaxId);
        teachers.add(teacher);
    }

    public void changeTeacherById (int id, String fName, String sName, String patronymic) {
        for (Teacher teacher: getAll() ) {
            if (teacher.getTeacherId() == id) {
                teacher.setFirstName(fName);
                teacher.setSecondName(sName);
                teacher.setPatronymic(patronymic);
            } else {
                System.out.println("Учитель не найден");
            }
        }
    }
}
