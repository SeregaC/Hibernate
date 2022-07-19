package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Евгений","Миронов", (byte)55 );
        userDao.saveUser("Константин","Хабенский",(byte) 50);
        userDao.saveUser("Сергей","Безруков", (byte) 48);
        userDao.saveUser("Андрей","Панин",(byte) 50);

        userDao.getAllUsers();

        userDao.cleanUsersTable();

        userDao.dropUsersTable();

        Util.getSessionFactory().close();


   /*     userService.createUsersTable();

        userService.saveUser("Евгений","Миронов", (byte)55 );
        userService.saveUser("Константин","Хабенский",(byte) 50);
        userService.saveUser("Сергей","Безруков", (byte) 48);
        userService.saveUser("Андрей","Панин",(byte) 50);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.getSessionFactory().close();

       // Util.closeConnection();
    }

    */
    }
}
