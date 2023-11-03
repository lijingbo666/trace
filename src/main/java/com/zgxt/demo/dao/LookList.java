package com.zgxt.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LookList {
    public List<UserSchool> getUsers() throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil();
        Connection conn = jdbcUtil.LoadConf(); // 连接数据库

        List<UserSchool> users = new ArrayList<>(); // 创建用户列表

        // 数据库操作sql的对象
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM ds_xwpx_bxxkzxx"; // SQL查询语句
        ResultSet resultSet = statement.executeQuery(sql); // 执行查询语句

        while (resultSet.next()) { // 遍历结果集
            UserSchool user = new UserSchool(); // 创建用户对象
            String SchoolName = resultSet.getString("xxmc"); // 获取学校名称
            String SchoolAdress = resultSet.getString("xxdz"); // 获取学校地址链接
            String SchoolBoos = resultSet.getString("xzxm"); // 获取发布日期
            String SchoolEco = resultSet.getString("jbz");
            String SchoolClass = resultSet.getString("xxlx");//学校类别

            user.setSchoolName(SchoolName); // 设置学校名称
            user.setSchoolAddress(SchoolAdress); // 设置学校地址链接
            user.setSchoolBoos(SchoolBoos); //学校校长
            user.setSchoolEco(SchoolEco);
            user.setSchoolClass(SchoolClass);

            users.add(user); // 将用户添加到用户列表
        }

        return users; // 返回用户列表
    }
}
