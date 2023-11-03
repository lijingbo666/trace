package com.zgxt.demo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.*;

public class JDBCUtil {
//    public static void main(String[] args) {
//        String driver = "com.mysql.cj.jdbc.Driver";
//        String URL = "jdbc:mysql://localhost:3306/block?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
//        Connection conn = null;
//
//        try {
//            Class.forName(driver);
//            System.out.println("驱动加载成功");
//        } catch (java.lang.ClassNotFoundException e) {
//            System.out.println("驱动加载失败");
//        }
//        try {
//            System.out.println("数据库链接前" + conn);
//
//            conn = DriverManager.getConnection(URL, "root", "lijingbo=lwj");
//            System.out.println("数据库链接成功后" + conn);
//            Statement statement = conn.createStatement();
//            String sql = "SELECT * FROM t_area";
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                String string = resultSet.getString(4);
//                System.out.println(string);
//            }
//
//        } catch (Exception e) {
//            System.out.println("数据库链接失败");
//        }
//        try {
//            conn = DriverManager.getConnection(URL, "root", "lijingbo=lwj");
//            System.out.println("数据库链接成功后" + conn);
//            Statement statement = conn.createStatement();
//            String sql = "SELECT * FROM t_area";
//            ResultSet resultSet = statement.executeQuery(sql);
//            String a="INSERT INTO t_area " +
//                    "VALUES (id\tparent_id\tcode\tname\tdeep\tcreator_id\tcreator_name\tcreated_date\tmodifier_id\tmodifier_name\tmodi_date\tdata_source\tparent_code\taudit_status\n" +
//                    "20939\t20932\t340421\t就是你\t3\t1\tadmin\t2014-11-19 09:40:18.000\t1\tadmin\t2014-11-19 15:00:21.000\t\t340400\t\\N)";
//            int i=statement.executeUpdate(a);
//            System.out.println("一共"+i+"行收到影响");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("修改失败");
//        }
//    }

    /**
     * @return
     */
    public String driver;
    public String MysqlData;
    public Connection LoadConf()throws Exception{
        //读取配置文件
        Properties properties = new Properties();
        File file = new File("conf.properties");
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        fis.close();


       //给驱动和链接赋值
        driver=properties.getProperty("DRIVER");
        MysqlData= properties.getProperty("MYSQLURL");

        //加载驱动
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(MysqlData, "root", "lijingbo=lwj");

        return conn;
    }

    //查询数据库里面所有用户列表


}


