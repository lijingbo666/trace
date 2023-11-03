package com.zgxt.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddList extends JDBCUtil {

//    public String IntoList(User user) throws Exception {
//        String state="error";
//        Connection conn = LoadConf();
//        String sqlcall = "insert into user(name,email)  values(?,?)";
//
//        PreparedStatement ps = conn.prepareStatement(sqlcall);
//
//        user.setName("张三");
//        user.setEmail("lisi");
//
//        ps.setString(1, user.getName());
//        ps.setString(2, user.getEmail());
//
//        int i = ps.executeUpdate();
//        if (i > 0) {
//            state = "success";
//        } else {
//            return "fail";
//        }
//
//        return state;
//    }

}
