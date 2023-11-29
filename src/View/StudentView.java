package View;

import Data.Student;
import Data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }
    Logger logger = Logger.getLogger(StudentView.class.getName());
    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
