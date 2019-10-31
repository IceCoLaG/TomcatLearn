package com.IceCoLa.Test;

import com.IceCoLa.Login.Dao.Impl.UsersDaoImpl;
import com.IceCoLa.Login.Dao.UsersDao;
import com.IceCoLa.Login.Pojo.User;

import java.sql.SQLException;
import java.util.Arrays;

public class TestMysqlSearch01 {
    public static void main(String[] args) throws SQLException {
        UsersDao usersDao = new UsersDaoImpl();
        User u1 = usersDao.searchUser("IceCoLa","526995@dotation");
        System.out.println(u1.getId());
        System.out.println(u1.getUserName());
        System.out.println(u1.getUserSex());
        System.out.println(u1.getPassword());
        System.out.println(u1.getUserEmail());
        System.out.println(Arrays.toString(u1.getUserQRCode()));
    }
}
