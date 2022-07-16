package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Евгений","Миронов", (byte)55 );
        userService.saveUser("Константин","Хабенский",(byte) 50);
        userService.saveUser("Сергей","Безруков", (byte) 48);
        userService.saveUser("Андрей","Панин",(byte) 50);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeConnection();
    }
}
