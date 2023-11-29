package Controler;

import Data.Teacher;
import Service.StudentGroupService;
import Service.StudentService;
import Service.TeacherService;
import View.StudentView;
import View.TeacherView;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic) {
        teacherService.create(firstName,secondName,patronymic);
    }
    public void printTeacher() {
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void changeTeacherById (int id, String fName, String sName, String patronymic) {
        teacherService.changeTeacherById(id, fName, sName, patronymic);
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
