package Controler;

import java.time.LocalDate;
import Data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic);
}